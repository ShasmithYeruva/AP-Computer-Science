/* TODO: 05
Determine if the user can ride a rollercoaster.

To ride the rollercoaster, you must be at least 42 inches tall. You must also 
be at least 9 years old.

Ask the user how tall and how old they are. Use ONE if-else to determine if 
the user can ride the rollercoaster. 

If they can, print “Welcome aboard!”
If they cannot, print “Sorry, you are not eligible to ride”
 */
public class S05RollerCoaster {
	public static void run(TScanner input) {
		// Write code here!
		int height = input.nextInt();
		int age = input.nextInt();

		if (age >= 9 && height >= 42) {
			System.out.println("Welcome aboard!");
		}
		else {
			System.out.println("Sorry, you are not eligible to ride");

		}
		// End of write code area.

	}

	public static void main(String[] args) {
		TScanner input = new TScanner("S05RollerCoasterInput.txt");

		int NUMBER_OF_TEST_CASES = 4;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input);
		}
	}

}
