/* TODO: 01
Write a program that asks the user for a number.

Use an if-else if- else to determine if the number is positive, negative, 
or zero. A number is considered positive if it is greater than to 0. A 
number is negative if it is less than 0.

Once you determine a number is not positive and not negative, that leaves 
one case left – the number must equal zero!

If it is positive, print “The number is positive!”
If it is negative, print “The number is negative!”
If it is zero, print “The number is neither positive nor negative!”
 */
public class S01Numbers {

	public static void run(TScanner input) {
		// Write code here!
		System.out.println("What is your number? ");
		int x = input.nextInt();
		if (x > 0) {
			System.out.println("The number is positive!");
		}
		else if (x < 0) {
			System.out.println("The number is negative!");
		}
		else {
			System.out.println("The number is neither positive nor negative!Therefore your number is zero!");
		}

		// End of write code area.

	}

	public static void main(String[] args) {
		TScanner input = new TScanner("S01NumbersInput.txt");

		int NUMBER_OF_TEST_CASES = 3;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input);
		}
	}
}
