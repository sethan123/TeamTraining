package Store_Procedure_Testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.apache.commons.lang3.StringUtils;



public class SPTesting {
	
	Connection con=null;
	Statement stmt=null;
	ResultSet rs;
	
	ResultSet rs1;
	ResultSet rs2;
	CallableStatement cStmt;
	
	@BeforeClass 
	void setup() throws SQLException
	{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "root123");
		  
	}
	@AfterMethod
	@AfterClass 
	void tearDown() throws SQLException
	{
		con.close();
	}
	//@Test(priority = 1)
    void test_storedProcedureExists() throws SQLException
{
		stmt=con.createStatement();  
		rs=stmt.executeQuery("SHOW PROCEDURE STATUS WHERE NAME = 'selectallcustomers'");  
		rs.next();		
		Assert.assertEquals(rs.getString("Name"),"SelectAllCustomers");
//		//rs=stmt.executeQuery("select * from customers"); 
		
	}
	//Invovkeing store procedure
	//@Test(priority=2)
	void test_SELECTALLCUSTOMERS() throws SQLException
	{
		// store producure
		 cStmt=con.prepareCall("{CALL SELECTALLCUSTOMERS()}");
		rs1=cStmt.executeQuery(); // result1
		// test query
		Statement stmt=con.createStatement();  
		rs2=stmt.executeQuery("Select * from customers");
		Assert.assertEquals(compareResultset(rs1,rs2),true);
		
	}
	
	//@Test(priority=3)
	void test_SELECTALLCUSTOMERSByCity() throws SQLException
	{
		// store producure
		 cStmt=con.prepareCall("{call SELECTALLCUSTOMERSByCity(?)}");
		 cStmt.setString(1, "Singapore");
		rs1=cStmt.executeQuery(); // result1
		// test query
		Statement stmt=con.createStatement();  
		rs2=stmt.executeQuery("Select * from customers where city ='Singapore'");
		Assert.assertEquals(compareResultset(rs1,rs2),true);
		
	}
	//@Test(priority=4)
	void test_SELECTALLCUSTOMERSByCityandPincode() throws SQLException
	{
		// store producure
		 cStmt=con.prepareCall("{call SelectAllCustomersByCityandPin(?,?)}");
		 cStmt.setString(1, "Singapore");
		 cStmt.setString(2, "079903");
		rs1=cStmt.executeQuery(); // result1
		// test query
		Statement stmt=con.createStatement();  
		rs2=stmt.executeQuery("call SelectAllCustomersByCityandPin('singapore','079903')");
		Assert.assertEquals(compareResultset(rs1,rs2),true);
		
	}
	//@Test(priority=5)
	void test_get_order_by_cust() throws SQLException
	{
		// store producure
		 cStmt=con.prepareCall("{call get_order_by_cust(?,?,?,?,?)}");
		 cStmt.setInt(1, 141);
		
		 
		 cStmt.registerOutParameter(2, Types.INTEGER);
		 cStmt.registerOutParameter(3, Types.INTEGER);
		 cStmt.registerOutParameter(4, Types.INTEGER);
		 cStmt.registerOutParameter(5, Types.INTEGER);
		 cStmt.executeQuery(); // result1
		 
		 int shipped=cStmt.getInt(2);
		 int cancelled=cStmt.getInt(3);
		 int resolved=cStmt.getInt(4);
		 int disputed=cStmt.getInt(5);
		 
		// System.out.println(shipped  + " " +cancelled + " "+ resolved+ " "+disputed+ " ");
		 
		 Statement stmt=con.createStatement();  
			rs=stmt.executeQuery(" select"
					+ "    (SELECT count(*) as 'shipped' from orders where customerNumber =141\r\n"
					+ "    and status ='shipped') as shipped,\r\n"
					+ "    (SELECT count(*) as 'cancelled' from orders where customerNumber =141\r\n"
					+ "    and status ='cancelled') as cancelled,\r\n"
					+ "	(SELECT count(*) as 'resolved' from orders where customerNumber =141\r\n"
					+ "    and status ='resolved') as resolved,\r\n"
					+ "    (SELECT count(*) as 'disputed' from orders where customerNumber =141\r\n"
					+ "    and status ='disputed') as disputed");
			
			rs.next();
			
			int exp_shipped=rs.getInt("shipped");
			int exp_cancelled=rs.getInt("cancelled");
			int exp_resolved=rs.getInt("resolved");
			int exp_disputed=rs.getInt("disputed");
			
			if(shipped==exp_shipped && cancelled==exp_cancelled && resolved ==exp_resolved && disputed ==exp_disputed)
			Assert.assertTrue(true);
			else
				Assert.assertTrue(false);
		
		
	}
	@Test(priority=6)
		void test_GetCustomerShipping() throws SQLException
		{
			// store producure
			 cStmt=con.prepareCall("{call GetcustomerShipping(?,?)}");
			 cStmt.setInt(1, 121);//input parametet
			
			 
			 cStmt.registerOutParameter(2, Types.VARCHAR);//output parameter
			 
			 cStmt.executeQuery(); // result1
			 
			 String shippingtime=cStmt.getString(2);
			 
			// System.out.println(shipped  + " " +cancelled + " "+ resolved+ " "+disputed+ " ");
			 
			 Statement stmt=con.createStatement();  
				rs=stmt.executeQuery(" select country,case     \r\n"
						+ "    When country='USA' THEN'2-day shipping'\r\n"
						+ "	    When country='canada' THEN'3-day shipping'\r\n"
						+ "        else '5-day shipping'\r\n"
						+ "        end as shippingtime\r\n"
						+ "        from customers where customerNumber=121 ");
				
				rs.next();
				
				String exp_shippingtime=rs.getString("shippingtime");
				
				
				Assert.assertEquals(shippingtime,exp_shippingtime);
			
		}
		
	
	
	
	
	
	public boolean compareResultset(ResultSet resultset1 ,ResultSet resultset2 ) throws SQLException
	{
		while(resultset1.next())
		{
			resultset2.next();
			int count = resultset1.getMetaData().getColumnCount();
			for(int i=1;i<=count;i++)
			{
				if(!StringUtils.equals(resultset1.getString(i),resultset2.getString(i)))
				{
					return false;
				}
			}
		}
		return true;
		
	}
	
}
