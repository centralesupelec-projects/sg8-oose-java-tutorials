package ex2;

public class Fraction extends Number implements BasicOps {
	
	/**
	 * the numerator of the fraction
	 */
	private int numerator;
	
	/**
	 * the denominator of the fraction
	 */
	private int denominator;
	
	

	/**
	 * build a fraction of given <code>numerator</code> and <code>denominator</code>
	 * @param numerator the numerator of the fraction 
	 * @param denominator the denominator of the fraction
	 */
	public Fraction(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}

	
	/**
	 * override the addNum method of class <code>Number</code>. Computes the fraction resulting by addition of 
	 * a given fraction with this fraction
	 */
	@Override
	public Number addNum(Number a) {
		
		if(a instanceof Fraction){
			Fraction that = (Fraction) a;
			int mcm = this.minimalCommonDenominator(this, that);
		
			int numerator_result = (mcm/this.denominator)*this.numerator + (mcm/that.denominator)*that.numerator ;
			Fraction result = new Fraction(numerator_result,mcm);
			return(result);
		}
		
		return null;
	}

	@Override
	public Number subNum(Number b) {
		
		if(b instanceof Fraction){
			Fraction that = (Fraction) b;
			int mcm = this.minimalCommonDenominator(this, that);
			
			int numerator_result = (mcm/this.denominator)*this.numerator - (mcm/that.denominator)*that.numerator ;
			Fraction result = new Fraction(numerator_result,mcm);
			return result;		
		}
		
		return null;
	}

	@Override
	public Number multNum(Number b) {
		if(b instanceof Fraction){
			Fraction that = (Fraction) b;
			Fraction result = new Fraction(this.numerator* that.numerator,this.denominator*that.denominator);
			return result;
		}
		return null;
	}

	@Override
	public Number divNum(Number b) {
		if(b instanceof Fraction){
			Fraction that = (Fraction) b;
			return (this.multNum(new Fraction(that.denominator, that.numerator)));
		}
		return null;
	}

	@Override
	public int intValue() {
		
		return (int) numerator/denominator;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return (long) numerator/denominator;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return (float) numerator/denominator;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return (double) numerator/denominator;
	}

	
	/**
	 * calculate the minimum common divisor between the denominator of two 
	 * given fraction 
	 * @param f1 the first fraction 
	 * @param f2 the second fraction 
	 * @return the minimum common divisor for the denominators of <code>f1</code> and f2
	 */
	public static int minimalCommonDenominator(Fraction f1, Fraction f2){
		
		int maxdenom = Math.max(f1.denominator, f2.denominator);
		int mindenom = Math.min(f1.denominator, f2.denominator);
		
		int result = maxdenom;
		
		if((maxdenom % mindenom) != 0)
			for(int i=1;i<Integer.MAX_VALUE;i++)
				if(((maxdenom*i) % mindenom) == 0){
					result = (int)(maxdenom*i);
					break;
				}
					
		return result;
	}

	
	/**
	 * define a unique hash-code for Fraction object 
	 */
	@Override
	public int hashCode() {
		
		
		// TODO Auto-generated method stub
		return (41*(41+(int)this.numerator)+(int)this.denominator);
	}

	
	/**
	 * define the equality relationship for Fractions objects 
	 */
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Fraction){
			Fraction f = (Fraction) obj;
			return (this.numerator==f.numerator && this.denominator==f.denominator);
		}
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Fraction [numerator=" + numerator + ", denominator="
				+ denominator + "]";
	}
			
		
	public static void main(String[] args) {
		BasicOps a = new Complex(2, 3); 
		Number b = new Fraction(1, 3);
		
		
		
		
		BasicOps d = new Fraction(3, 5);
		
		Number e = new Fraction(6,11);
		Number c = a.multNum(b); 
		System.out.println("Result = " + c);
		System.out.println( d.addNum(e));
	
	}
	
}

