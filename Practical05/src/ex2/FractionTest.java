package ex2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FractionTest {

	@Test
	public void testAddNum() {
		
		// defining two fraction numbers: f1=3/4 and f2=5/8 
		Fraction f1 = new Fraction(3, 4);
		Fraction f2 = new Fraction(5 ,8);
		
		// computing result of addition of two fraction
		Fraction result = (Fraction) f1.addNum(f2);
		
		// setting a fraction with the correct result
		Fraction testresult = new Fraction(11, 8);
		
		// comparing the obtained result with the correct one
		assertTrue(result.equals(testresult));
		
	}

	@Test
	public void testSubNum() {
		
		Fraction f1 = new Fraction(3, 4);
		Fraction f2 = new Fraction(5 ,8);
		
		Fraction result = (Fraction) f1.subNum(f2);
		
		Fraction testresult = new Fraction(1, 8);
		
		
		assertTrue(result.equals(testresult));
		
	}

	@Test
	public void testMultNum() {
		
		Fraction f1 = new Fraction(3, 4);
		Fraction f2 = new Fraction(5 ,8);
		
		Fraction result = (Fraction) f1.multNum(f2);
		
		Fraction testresult = new Fraction(15, 32);
		
		assertTrue(result.equals(testresult));
		
		
	}

	@Test
	public void testDivNum() {
		Fraction f1 = new Fraction(3, 4);
		Fraction f2 = new Fraction(5 ,8);
		
		Fraction result = (Fraction) f1.divNum(f2);
		
		Fraction testresult = new Fraction(24, 20);
		
		assertTrue(result.equals(testresult));
	}

	@Test
	public  void testMinimalCommonDenominator() {
		
		

		Fraction f1 = new Fraction(7, 24);
		Fraction f2 = new Fraction(11 ,32);
		
		int result = Fraction.minimalCommonDenominator(f1, f2) ;
		
		assertTrue(result == 96);
		
		
	}

}
