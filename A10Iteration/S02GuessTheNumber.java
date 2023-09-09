/* TODO: 02
Write a program that has a user guess the height of Mt. Everest (in meters).

Mt. Whitney is 14505 feet tall. The height has been stored in a variable 
called whitneyHeight. You’ll be able to access this variable from both main 
and guessTheHeight.

Allow the user to continually guess the height until they guess the height 
correctly.

Complete the method guessTheHeight that uses a while loop to ask the user 
for their guess and compares it with everestHeight.

A run of the program will look like this:

Do you know how tall Mt. Whitney is?
See if you can guess the height in feet.
Guess the height: 89
That's not it!
Guess the height: 4000
That's not it!
Guess the height: 14000
That's not it!
Guess the height: 14505
Right! Mt. Whitney is 14505 feet tall!
 */
public class S02GuessTheNumber {

	// This is the height of Mt. Whitney.
	final static int whitneyHeight = 14505;

	public static void main(String[] args) {
		System.out.println("Do you know how tall Mt. Whitney is?");
		System.out.println("See if you can guess the height in feet.");

		// This calls the static method guessTheHeight. Notice that the method is outside 
		// of the main method. 
		guessTheHeight();
	}

	public static void guessTheHeight() {
		TScanner input = new TScanner("S02GuessTheNumberInput.txt");
		// Your code goes here!
		// Allow the user to keep guessing until they guess the correct height
		while (true) {
			System.out.println("Guess the height: ");
			int height = input.nextInt();
			if (height != whitneyHeight) {
				System.out.println("That's not it!");
			}
			else if (height == whitneyHeight) {
				System.out.println("Right! Mt. Whitney is "
						+ whitneyHeight + " feet tall!");
				break;
			}
		}

	}

}
