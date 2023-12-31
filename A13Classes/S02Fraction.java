public class S02Fraction {

	private int numerator;
	private int denominator;

	public S02Fraction(int numer, int denom) {
		numerator = numer;
		denominator = denom;
	}

	public int getNumerator() {
		// IMPLEMENT THIS METHOD
		return numerator;
	}

	public int getDenominator() {
		// IMPLEMENT THIS METHOD
		return denominator;
	}

	public void setNumerator(int x) {
		// IMPLEMENT THIS METHOD
		numerator = x;
	}


	public void setDenominator(int x) {
		// IMPLEMENT THIS METHOD
		denominator = x;
	}

	public void add(S02Fraction other) {
		// IMPLEMENT THIS METHOD
		numerator *= other.denominator;
		numerator += other.numerator*denominator;
		denominator *= other.denominator;
	}

	public void subtract(S02Fraction other) {
		// IMPLEMENT THIS METHOD

		numerator *= other.denominator;
		numerator -= other.numerator*denominator;
		denominator *= other.denominator;
	}

	public void multiply(S02Fraction other) {
		// IMPLEMENT THIS METHOD
		numerator *= other.numerator;
		denominator *= other.denominator;
	}

	public String toString() {
		// IMPLEMENT THIS METHOD
		return getNumerator() + " / " + 	getDenominator();
	}

}
