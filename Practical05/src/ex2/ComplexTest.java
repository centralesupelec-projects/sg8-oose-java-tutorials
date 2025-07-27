package ex2;



import static org.junit.Assert.*;

import org.junit.Test;

public class ComplexTest {

	@Test
	public void testAddNum() {
		Complex c1 = new Complex(1.4,0.4);
		Complex c2 = new Complex(0.8,0.8);
		Complex result = (Complex) c1.addNum(c2);
		
		Complex testresult = new Complex(2.2, 1.2);
		
		assertTrue(result.equals(testresult));
	}

	@Test
	public void testSubNum() {
		Complex c1 = new Complex(1.4,0.4);
		Complex c2 = new Complex(0.8,0.8);
		Complex result = (Complex) c1.subNum(c2);
		
		Complex testresult = new Complex(0.6, -0.4);
		
		assertTrue(result.equals(testresult));
	}

	@Test
	public void testMultNum() {
		Complex c1 = new Complex(1.4,0.4);
		Complex c2 = new Complex(0.8,0.8);
		Complex result = (Complex) c1.multNum(c2);
		
		Complex testresult = new Complex(0.80, 1.44);
		
		assertTrue(result.equals(testresult));
	}

	@Test
	public void testDivNum() {
		Complex c1 = new Complex(1.4,0.4);
		Complex c2 = new Complex(0.8,0.8);
		Complex result = (Complex) c1.divNum(c2);
		
		Complex testresult = new Complex(1.125, -0.625);
		
		assertTrue(result.equals(testresult));
	}
}

