package Session_2;

public class Fraction {
	private int numerator;
	private int denominator;
	
    public Fraction(){
		this.numerator = 0;
		this.denominator = 1;
    }
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		if (denominator == 0) {
            return;
		}
		this.denominator = denominator;
		simplify();
	}
	
	
	public int getDenominator() {
		return this.denominator;
	}
	
	public int getNumerator() {
		return this.numerator;
	}
	
	public void setNumerator(int n) {
		this.numerator = n;
		simplify();
	}
	
	
	public void setDenominator(int d) {
		if (d == 0){
			return;
		}
		this.denominator = d;
		this.simplify();
	}
	
	public void print() {
		if (this.denominator == 1) {
			System.out.println(this.numerator);
		} else {
			System.out.println(this.numerator + "/" + this.denominator);
		}	
	}
	
	void simplify() {
		// private function to convert the fraction into its standard form	
        int gcd = 1;
        int smaller = Math.min(this.numerator, this.denominator);
        for(int i=2; i<=smaller; i++){
            if(this.denominator / i ==0 && this.numerator % i == 0){
                gcd = i;
            }
        }
        this.numerator = this.numerator / gcd;
        this.denominator = this.denominator / gcd;
	}
	
	public static Fraction add(Fraction f1, Fraction f2) {
		// add f1 and f2, keep it in third fraction object, return the third fraction object
        int newNum = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        int newDen = f1.denominator * f2.denominator;

        Fraction f = new Fraction();
        f.numerator = newNum;
        f.denominator = newDen;

		return f;
	}
	
	public void add(Fraction f2) {
		// add this and f2, keep result in this
        this.numerator = this.numerator * f2.numerator + this.denominator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
	}
	
	public void multiply(Fraction f2) {
		// multiply this and f2, keep result in this
        this.numerator = this.numerator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
	}
	
}


