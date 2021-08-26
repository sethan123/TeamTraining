package script1;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculateTest {
calculate calc=new calculate();
	
	
	@Test
	public void testSub() {
		assertEquals(10,calc.sub(15,5));

	}

	@Test
	public void testMul() {
		
		assertEquals(25,calc.mul(5,5));
		
	}

}
