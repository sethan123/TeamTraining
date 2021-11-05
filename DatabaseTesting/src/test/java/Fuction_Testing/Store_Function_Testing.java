package Fuction_Testing;

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

public class Store_Function_Testing {
	
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
	
	@AfterClass 
	void tearDown() throws SQLException
	{
		con.close();
	}
	
	//@Test(priority = 1)
	void test_StoredFunctionExits() throws SQLException
	{
		rs=con.createStatement().executeQuery("SHOW FUNCTION STATUS WHERE NAME ='CUSTOMERLEVEL'");  
		rs.next();		
		Assert.assertEquals(rs.getString("Name"),"CUSTOMERLEVEL");
	
	}
	@Test(priority = 2)
	void test_CUSTOMERLEVEL_With_SQLStatment() throws SQLException
	{
		rs1=con.createStatement().executeQuery("select customerName,CUSTOMERLEVEL(creditLimit) from customers");  
		rs2=con.createStatement().executeQuery("select customerName, case when creditLimit > 50000 then 'platinum'\r\n"
				+ "when creditLimit >= 10000 and \r\n"
				+ "creditLimit < 50000 then 'GOLD'\r\n"
				+ "when creditlimit < 10000 then 'SILVER'\r\n"
				+ "end as CUSTOMERLEVEL From customers");
		
		
		Assert.assertEquals(compareResultset(rs1,rs2),true);
	}
		//@Test(priority = 3)
		void test_CUSTOMERLEVEL_With_StoreProcedure() throws SQLException
		{
			cStmt=con.prepareCall("{call GetCUSTOMERLEVEL(?,?)}");
			cStmt.setInt(1, 131);
			cStmt.registerOutParameter(2, Types.VARCHAR);
			
			cStmt.executeQuery();
			String custlevel=cStmt.getString(2);
			
			rs=con.createStatement().executeQuery("select  customerName, case when creditLimit>50000 then 'platinum'\r\n"
					+ "when creditLimit>=10000 and \r\n"
					+ "creditLimit<50000 then 'GOLD'\r\n"
					+ "when creditlimit <10000 then 'SILVER'\r\n"
					+ "end as CUSTOMERLEVEL From customers where customerNumber=131");
			rs.next();
			
			String exp_custlevel =rs.getString("CUSTOMERLEVEL");
			
			Assert.assertEquals(custlevel,exp_custlevel);
			
		
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
