/* TODO: 05
Write a program that asks the user what they want to drink. 
Then ask how many teaspoons of sugar they want.

Print out the order again to confirm it. You should print out the drink name. 
If they wanted more than 0 teaspoons of sugar, you should also 
print �with sugar�.

Remember to use print and println to help you.

Note the ": " is critical for the tester.

USE IF STATEMENTS FOR THIS EXERCISE, DO NOT USE ELSE STATEMENT.

Your final output should look like the following with the two test cases.

What do you want to drink? 
green tea
How many teaspoons of sugar do you want? 
0

Confirming your order.  You wanted: green tea

What do you want to drink? 
coffee
How many teaspoons of sugar do you want? 
4

Confirming your order.  You wanted: coffee with sugar

 */
public class S05DrinkOrder {
	public static void run(TScanner input) {
		// Begin test code
		// ask what they want to drink
		System.out.println("What do you want to drink?");
		String drink = input.nextLine();
		// ask how much sugar
		System.out.println("How many teaspoons of sugar do you want? ");
		int sugar = input.nextInt();
		if(input.hasNextLine()) {
			input.nextLine();
		}

		// confirm order
		System.out.print("Confirming your order.  You wanted: " + drink);
		// if they have more than 0 sugar, print with sugar
		if (sugar > 0) {
			System.out.println(" with sugar");
		}
		else {
			System.out.println("");
		}
		// End test code
	}

	public static void main(String[] args) {

		TScanner input = new TScanner("S05DrinkOrderInput.txt");

		int NUMBER_OF_TEST_CASES = 2;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input);
		}
	}
}
