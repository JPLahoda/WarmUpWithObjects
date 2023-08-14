/* Jason Lahoda
 * Section 4
 * This program represents fractions and performs some simple arithmetic operations. */
public class Fraction {

/**	public static void main(String[] args) {

	} **/
	
	int numerator;
	int denominator;
	
	public Fraction(int n, int d) {
		if (d == 0) {
			throw new ArithmeticException();
		}
		numerator = n / gcd(n,d);
		denominator = d / gcd(n,d);
		
	}
	//(5 points) Constructor that creates a Fraction with numerator and denominator d. If d is 0, throw an ArithmeticException. We haven't yet had a chance to cover exceptions in as much depth as we soon will, but this can be done simply in your method with the statement throw new ArithmeticException();
	
	public int getNum() {
		return numerator;
	}
	//(2.5 points) Returns the value of the numerator field
	
	public int getDenom() {
		return denominator;
	}
	//(2.5 points) Returns the value of the denominator field
	
	public void setNum(int n) {
		numerator = n;
	}
	//(2.5 points) Sets the numerator field to the value given in n
	
	public void setDenom(int d) {
		denominator = d;
		if (d == 0) {
			throw new ArithmeticException();
		}
	}
	//(2.5 points) Sets the denominator field to the value given in d. If d is 0, throw an ArithmeticException.
	
	public Fraction add(Fraction a) {
		int n = (numerator * a.getDenom()) + (a.getNum() * denominator);
		int d = denominator * a.getDenom();
		return new Fraction(n, d);
	}
	//(5 points) Returns the fraction that is the sum of the subject of the method and a. For example (new Fraction(3,4)).add(new Fraction(1,4)) is 16/16 i.e 1/1 We sum the fractions a/b and c/d as (a*d+b*c)/b*d then reduce.
	public boolean equals(Fraction a) {
		if (numerator / gcd(numerator,denominator) == a.getNum() && denominator / gcd(numerator,denominator) == a.getDenom()) {
				return true;
		}
		return false;
	}
	//(5 points) Returns true if subject of method and argument of call are equal. Fractions a/b and c/d are equal if a*d and b*c are equal or since the fractions are normalized, if a==c and b==d.
	
	public String toString() {
		if(denominator!=1) {
			return (numerator / gcd(numerator,denominator)) + "/" + (denominator / gcd(numerator,denominator));
		}
		else {
		    return numerator+"";
		}
	}
	//(5 points) Returns a String representation of the fraction. For example, if the numerator is 1 and the denominator is 2, the String "1/2" is returned.
	
	public static int gcd(int a, int b){
	    if (a < 0) {
	        a = -1 * a;
	    }
	    
	    if (b < 0) {
	        b = -1 * b;
	    }
	    
	    int t;
	    while(b != 0){
	        t = b;
	        b = a % b;
	        a = t;          
	    }
	    
	    return a;
	}
	
}
