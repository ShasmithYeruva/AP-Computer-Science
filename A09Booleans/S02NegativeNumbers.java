/* TODO: 02
This program reads input from the user to determine if the user�s two numbers 
are BOTH negative.

The program computes two boolean expressions in order to determine if the 
equivalent De Morgan expression gives the same result when checking for 
negative numbers. This expression is given in the code:

boolean bothNegative = num1 < 0 && num2 < 0;
Convert the bothNegative Boolean into its equivalent De Morgan style boolean 
expression on its own line and call it bothNegativeDeMorgan. De Morgan�s Laws 
show equivalencies, so you can work Boolean expressions in EITHER direction, 
not just with distributing the ! throughout an expression!

Your resulting boolean expression for bothNegativeDeMorgan should produce the 
same result as bothNegative.

The resulting program should still be able to successfully determine if two 
numbers entered by a user are both negative or not.

 */
public class S02NegativeNumbers {

	public static void run(TScanner input) {
		System.out.println("Enter 2 integers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		//Determine if both numbers are negative with bothNegative boolean
		// Do NOT remove this line!
		boolean bothNegative = num1 < 0 && num2 < 0;

		//Modify the line here.
		boolean bothNegativeDeMorgan = !(!(num1 < 0) || !(num2 < 0));

		//Print out if both numbers are negative or not both negative
		if (bothNegative)
		{
			System.out.println("Both numbers are negative");
		}
		else
		{
			System.out.println("Both numbers are NOT negative.");
		}

		//Print out if both numbers are negative or not both negative
		if (bothNegativeDeMorgan)
		{
			System.out.println("Both numbers are negative with De Morgan's Laws.");
		}
		else
		{
			System.out.println("Both numbers are NOT negative with DeMorgan's Laws.");
		}

		//Check that both Boolean values evaluate to the same value
		if(bothNegative == bothNegativeDeMorgan)
		{
			System.out.println("Correct implementation of DeMorgan");
		}

	}

	public static void main(String[] args) {
		TScanner input = new TScanner("S02NegativeNumbersInput.txt");

		int NUMBER_OF_TEST_CASES = 4;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input);
		}
	}

}
