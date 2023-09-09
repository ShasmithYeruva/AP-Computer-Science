/* TODO: 04
Write a program that computes how much the user owes for parking in a 
particular parking garage.

The garage charges $4.25 per hour. However, the minimum amount they 
charge is $7. This means that if the total comes to something less than 
$7, the user is still charged $7.

In addition, if the user was parked for more than 3 hours, they earn a 
25% discount.

For example, if they were parked for 4 hours, they would owe $17. But since 
they were parked for more than 3 hours, they get 25% off and only owe $12.75.

Follow the comments in main to ask the user how many hours they parked and 
compute their total.

Note the ": " is critical for the tester.

USE IF STATEMENTS FOR THIS EXERCISE.

Your final output should look like the following with the three test cases.

How many hours were you parked? 
1
You owe: $7.0
How many hours were you parked? 
2
You owe: $8.5
How many hours were you parked? 
3
You owe: $12.75


 */
public class S04Discounts {
	public static void run(TScanner input) {
		// Write code here...
		// Ask how many hours were you parked
		System.out.println("How many hours were you parked? ");
		int hours = input.nextInt();
		// Compute cost
		double cost = hours * 4.25;


		// If parked for more than 3 hours, apply 25% discount
		if (hours > 3) {
			cost = Math.round(cost * .75 * 100.0) /100.0;
		}
		else if (cost < 7) {
			cost = 7;
		}
		// If cost is under $7, set cost to $7

		// Display the final cost
		System.out.println("You owe: $" + cost);

		// End write code
	}

	public static void main(String[] args) {

		TScanner input = new TScanner("S04DiscountsInput.txt");

		int NUMBER_OF_TEST_CASES = 3;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input);
		}

	}

}
