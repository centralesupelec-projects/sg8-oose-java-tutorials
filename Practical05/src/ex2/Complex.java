package ex2;

//import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.RoundingMode;



;

public class Complex extends Number implements BasicOps{
	
	/*
	 * the real part of a complex number
	 */
	private double r;
	
	/*
	 * the imaginary part of a complex number
	 */
	private double i;
	
	

	/*
	 * default constructor: real and imaginary parts initialised to 0
	 */
	public Complex() {
		super();
		this.r=0;
		this.i=0;
	}

	/*
	 * creates a complex number with given real and imaginary part
	 */
	public Complex(double r, double i) {
		super();
		this.r = r;
		this.i = i;
	}

	@Override
	public int intValue() {
		return (int)r;
	}

	@Override
	public long longValue() {
		return (long)r;
	}

	@Override
	public float floatValue() {
		return (float)r;
	}

	@Override
	public double doubleValue() {
		return r;
	}

	@Override
	public Number addNum(Number a) {	
		if(a instanceof Complex){
			Complex aComplex = (Complex) a;
			return new Complex(this.r+aComplex.r,this.i+aComplex.i);
		}
		return null;
	}

	@Override
	public Number subNum(Number a) {		
		if(a instanceof Complex){
			Complex aComplex = (Complex) a;
			return new Complex(this.r-aComplex.r,this.i-aComplex.i);
		}
		return null;
	}

	@Override
	public Number multNum(Number a) {		
		if(a instanceof Complex){
			Complex aComplex = (Complex) a;
			return new Complex(this.r*aComplex.r-this.i*aComplex.i,this.i*aComplex.r+this.r*aComplex.i);
		}
		return null;
	}

	@Override
	public Number divNum(Number a) {
		if(a instanceof Complex){
			Complex aComplex = (Complex) a;
			double quotient_realPart = (this.r*aComplex.r+this.i*aComplex.i)/(Math.pow(aComplex.r,2)+Math.pow(aComplex.i, 2));
			double quotient_imPart = (this.i*aComplex.r-this.r*aComplex.i)/(Math.pow(aComplex.r,2)+Math.pow(aComplex.i, 2));
			return new Complex(quotient_realPart,quotient_imPart);
		}
		return null;
	}

	//@Override
	//public int hashCode() {
	//	return (41*(41+(int)this.r)+(int)this.i);
	//}

	
	

	@Override
	public boolean equals(Object obj) {
		
		// number of decimal to which stop the comparison of real and imaginary parts of a complex number
		final double THRESHOLD = .0001; 
				
		// if it is a Complex object then compare its real and immaginary parts
		if(obj instanceof Complex){			
			Complex c = (Complex) obj;
			return ((Math.abs(this.r-c.r)<THRESHOLD)  && (Math.abs(this.i-c.i)<THRESHOLD));
		}
		// otherwise check for equality through the superclass equals
		return super.equals(obj);
	}

	
	@Override
	public String toString() {
		return "Complex [r=" + r + ", i=" + i + "]";
	}

	public static void main(String[] args) {
		Complex c1 = new Complex(1,2);
		Complex c2 = new Complex(1,2);
		Complex c3 = (Complex) c1.addNum(c2);
		System.out.println(c3);
	}
	
}
