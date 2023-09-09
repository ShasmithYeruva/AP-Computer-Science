/* TODO: 03
In basketball, a triple double is when you end a game with statistics in 
three different categories that are at least 10.

For example, you get a triple double if you have scored 10 points, got 
10 rebounds, and had 10 assists in a game.

This program asks the user to enter the number of points, rebounds, and 
assists for a player.

You should edit this code, so the boolean tripleDouble is true if the 
player got a triple double, and false otherwise.

Then, it should print tripleDouble as seen in the provided 
System.out.println statement. 

Note the ": " is critical for the tester.

DO NOT USE IF STATEMENTS FOR THIS EXERCISE.

Your final output should look like the following with the four test cases.

How many points did you get? 
9
How many rebounds did you get? 
10
How many assists did you have? 
10
Player Got A Triple Double: false
How many points did you get? 
10
How many rebounds did you get? 
9
How many assists did you have? 
10
Player Got A Triple Double: false
How many points did you get? 
10
How many rebounds did you get? 
10
How many assists did you have? 
9
Player Got A Triple Double: false
How many points did you get? 
10
How many rebounds did you get? 
10
How many assists did you have? 
10
Player Got A Triple Double: true

 */

public class S03TrippleDouble {

	public static void run(TScanner input) {
		System.out.println("How many points did you get? ");
		int points = input.nextInt();

		System.out.println("How many rebounds did you get? ");
		int rebounds = input.nextInt();

		System.out.println("How many assists did you get? ");
		int assists = input.nextInt();

		boolean tripleDouble = points >= 10 && rebounds >= 10 && assists >= 10;

		System.out.println("Player Got A Triple Double: " + tripleDouble);


	}

	public static void main(String[] args) {

		TScanner input = new TScanner("S03TrippleDoubleInput.txt");

		int NUMBER_OF_TEST_CASES = 4;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input);
		}

	}

}
