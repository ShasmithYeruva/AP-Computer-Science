/* TODO: 01
Write a program that helps the user manage their exercise goals

Ask for two integers - the first is their exercise goal amount in minutes
for the week and the second is the actual exercise amount for the week. 

Then create three boolean variables, as described below, to help the user 
determine whether they met their exercise goal.

The first boolean should be true if the user went over their goal.

The second boolean should be true if the user was under their goal.

The third boolean should be true if the user met their goal exactly.

Then print the results (that is, the value of the booleans).

DO NOT USE IF STATEMENTS FOR THIS EXERCISE.

The ": " delimiter is critical for the tester.

Here is an example output with the three test cases.

What is the expected exercise goal?
50
What is the actual exercise goal?
70
Right at the goal: false
Below expected: false
Above expected: true
What is the expected exercise goal?
70
What is the actual exercise goal?
50
Right at the goal: false
Below expected: true
Above expected: false
What is the expected exercise goal?
60
What is the actual exercise goal?
60
Right at the goal: true
Below expected: false
Above expected: false



 */
public class S01ExerciseChecker {

	public static void run(TScanner input) {
		// Write code here.

		// Ask for expected goal exercise
		System.out.println("What is the expected exercise goal?");
		int expected = input.nextInt();

		// Ask for actual goal exercise
		System.out.println("What is the actual exercise goal?");
		int actual = input.nextInt();		
		// Compare numbers by creating three booleans
		boolean atGoal = expected == actual;
		boolean below = expected > actual;
		boolean above = expected < actual;

		// Display results as instructed
		System.out.println("Right at the goal: " + atGoal);
		System.out.println("Below expected: " + below);
		System.out.println("Above expected: " + above);
		// End of coding area.
	}
	public static void main(String[] args) {
		TScanner input = new TScanner("S01ExerciseCheckerInput.txt");

		final int NUMBER_OF_TEST_CASES = 3;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input);
		}
	}

}
