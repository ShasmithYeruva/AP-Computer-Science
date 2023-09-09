/* TODO: 06
Write a program that helps a novice microwave chef decide how long to 
microwave frozen pizza rolls.

Use the Math class to generate a random integer between 100 and 160 to 
represent the number of seconds the pizza rolls will be microwaved.

Print out the number of seconds generated.

If the number is less than or equal to 130, print
Rolls will be the right temperature!

If the number is greater than 130, print
Rolls will be boiling hot!


If you�ve forgotten how to use random numbers, refer back to the slides:

Random Number Slides
https://docs.google.com/presentation/d/1htRQeMFTJawYV6VDM97vQ8GrF8hbudzY_SdtdhAlvco/edit#slide=id.g5c5bb0f811_0_161
 */

public class S06MicrowaveCooking {
	public static void run() {
		// Begin test code
		// Generate a random number of seconds
		int randomSeconds = (int) (Math.random() * 60 + 100);
		// Print the number of seconds
		System.out.println(randomSeconds);
		// Use two if statements to print the temperature
		if (randomSeconds <= 130) {
			System.out.println("Rolls will be the right temperature!");
		}
		else if (randomSeconds > 130) {
			System.out.println("Rolls will be boiling hot!");
		}
		// End test code
	}

	public static void main(String[] args) {

		int NUMBER_OF_TEST_CASES = 4;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run();
		}
	}

}
