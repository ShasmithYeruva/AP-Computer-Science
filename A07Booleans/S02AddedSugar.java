/* TODO: 02
 The American Heart Association recommends that adult men get no more 
 than 36 grams of added sugar and adult women get no more than 25 grams 
 of added sugar per day.

In this program, ask the user to enter the number of grams of added sugar 
they have eaten that day. Using 30 grams as the cut off point, use a 
boolean statement to state if the user can eat more sugar.

DO NOT USE IF STATEMENTS FOR THIS EXERCISE.

Here is what your output should look like with the four test cases:

How many grams of sugar have you eaten today? 
28
You can eat more sugar: true
How many grams of sugar have you eaten today? 
29
You can eat more sugar: true
How many grams of sugar have you eaten today? 
30
You can eat more sugar: false
How many grams of sugar have you eaten today? 
31
You can eat more sugar: false

 */
public class S02AddedSugar {
	public static void run(TScanner input) {
		// Write code here.

		// Ask the user for the grams of sugar
		System.out.println("How many grams of sugar have you eaten today?");
		int sugar = input.nextInt();
		// Use a boolean expression to print if they can eat more sugar
		boolean moreSugar = sugar < 30;
		System.out.println("You can eat more sugar: " + moreSugar);
		// End code here.
	}
	public static void main(String[] args) {
		TScanner input = new TScanner("S02AddedSugarInput.txt");

		final int NUMBER_OF_TEST_CASES = 4;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input);
		}
	}

}
