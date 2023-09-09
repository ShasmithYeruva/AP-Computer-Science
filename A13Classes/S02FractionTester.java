/* TODO: 02
In this exercise, you must take the S02Fraction class and extend it by adding 
a few handy methods.

YOUR JOB:

Implement the following methods in the S02Fraction class:

public void add(S02Fraction other)
public void subtract(S02Fraction other)
public void multiply(S02Fraction other)
public int getNumerator()
public int getDenominator()
public void setNumerator(int x)
public void setDenominator(int x)
public String toString()
Use the FractionTester file to test as you go along.

HINTS:

Note that

public void add(S02Fraction other)
public void subtract(S02Fraction other)
public void multiply(S02Fraction other)
are void methods. They do not return anything. These methods should not 
create a new Fraction and return it.

Instead, these methods should modify the instance variables to be added, 
subtracted, or multiplied by the Fraction other.

For example, if you had the following code in your S02FractionTester class:

Fraction first = new Fraction(1, 2);
Fraction second = new Fraction(1, 3);
System.out.println();

System.out.println("BEFORE:");
System.out.println("first: " + first);
System.out.println("second: " + second);

first.multiply(second);

System.out.println("AFTER:");

System.out.println("first: " + first);
System.out.println("second: " + second);
Running should print out:

BEFORE:
first: 1 / 2
second: 1 / 3

AFTER:
first: 1 / 6
second: 1 / 3
The Fraction first was modified by being multiplied by the Fraction second. 
first was affected, second was not. 1/2 became 1/6 because it was multiplied 
by 1/3.


 */
public class S02FractionTester {

	public static void main(String[] args) {

		S02Fraction first = new S02Fraction(1, 2);
		S02Fraction second = new S02Fraction(1, 3);
		System.out.println();

		System.out.println("BEFORE:");
		System.out.println("first: " + first);
		System.out.println("second: " + second);

		first.multiply(second);

		System.out.println("AFTER:");

		System.out.println("first: " + first);
		System.out.println("second: " + second);
	}

}
