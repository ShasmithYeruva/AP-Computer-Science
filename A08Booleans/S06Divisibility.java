/* TODO: 06
This program reads in two numbers from the user, dividend and divisor, and 
prints out whether dividend is evenly divisible by divisor.

For example, one run of the program may look like this:

Enter the dividend: 10
Enter the divisor: 5
10 is divisible by 5!
Because 5 goes into 10 twice. 10 is evenly divisible by 5.

Another run may look like this:

Enter the dividend: 10
Enter the divisor: 8
10 is not divisible by 8!
Because 10 / 8 is 1.25, 10 is not evenly divisible by 8.

The Bug:
The problem is that if the user inputs 0 for the divisor, the program tries 
to divide by 0 and the program crashes.

Your Job:
Your job is to use Short Circuiting to prevent the condition inside the if 
statement from dividing by 0.

Here is the expected output:

Enter the dividend: 2
Enter the divisor: 10
2 is not divisible by 10!
Enter the dividend: 10
Enter the divisor: 2
10 is divisible by 2!
Enter the dividend: 0
Enter the divisor: 10
0 is divisible by 10!
Enter the dividend: 10
Enter the divisor: 0
10 is not divisible by 0!
 */
public class S06Divisibility {
	public static void run(TScanner input) {
		// Write code here!
		System.out.println("Enter the dividend:");
		int dividend = input.nextInt();
		System.out.println("Enter the divisor:");
		int divisor = input.nextInt();
		if (divisor == 0) {
			System.out.println(dividend + " is not divisible by " + divisor + "!");
		}
		else {
			if (dividend % divisor == 0) {
				System.out.println(dividend + " is divisible by " + divisor + "!");
			}
			else {
				System.out.println(dividend + " is not divisible by " + divisor + "!");
			}
		}
	}

	// End of write code area.



	public static void main(String[] args) {
		TScanner input = new TScanner("S06DivisibilityInput.txt");

		int NUMBER_OF_TEST_CASES = 4;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input);
		}
	}

}
