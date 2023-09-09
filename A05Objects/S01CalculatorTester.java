/*
TODO: 01
The Calculator class has been implemented a bit differently in this lesson. 
The last time you implemented the Calculator class, its methods were void. 
Check out the class to understand it.

Modify the main method. Ask for two doubles. Then print the sum, difference, 
product, and quotient. This time, you will have to call each method and 
store the result. The equation will be printed from main rather than from 
Calculator.

You should use a single print statement for each equation. Use String 
concatenation to form the equations. Be sure to add the spaces around the 
operators to ensure the output is formatted neatly.

For example, your output should look like this

Enter two doubles
3.4
1.6
3.4 + 1.6 = 5.0
3.4 - 1.6 = 1.7999999999999998
3.4 * 1.6 = 5.44
3.4 / 1.6 = 2.125

Note: Wondering why you get really long decimal numbers sometimes? That�s 
because the computer cannot actually represent all decimal numbers 
accurately. The approximations cause rounding errors when you use the 
numbers in calculations. This is called a �floating point error�.
 */
public class S01CalculatorTester {

	public static void main(String[] args) {
		// Create and assign a Scanner object
		TScanner input = TScanner.inputFile("S01CalculatorInput.txt");
		// Put your code here
		System.out.println("Enter two doubles? ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		S01Calculator calculate = new S01Calculator();
		System.out.println(x + " + " + y + " = " + calculate.sum(x, y));
		System.out.println(x + " - " + y + " = " + calculate.subtract(x, y));
		System.out.println(x + " * " + y + " = " + calculate.multiply(x, y));
		System.out.println(x + " / " + y + " = " + calculate.divide(x, y));
		// A good place to start is to
		// create comments to remind yourself 
		// what you need to do

	}

}
