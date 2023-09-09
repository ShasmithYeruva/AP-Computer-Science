/* TODO: 02
Every year, salmon return from the salt water they usually live in to a 
freshwater river to spawn (lay eggs). Some people like to go and watch 
the salmon swim upstream to their favorite spawning places, especially 
at fish farms.

There are several different varities of salmon. Some spawn in the spring 
and most spawn in the fall.

Your task is to write a program that takes the month of the year as an 
integer and outputs if it is “Spring spawning season”, 
“Fall spawning season”, or “Not spawning season”.

The spring spawning season lasts from March to June (month 3 - 6). The fall 
spawning season lasts from September to November (month 9 - 11).

Remember that in an if-else if statement, the first if statement that 
evaluates to true is the one whose body is executed. Therefore, you will 
need to check the months in numerical order.

 */
public class S02Salmon {
	public static void run(TScanner input) {
		// Write code here!

		// Ask user for month of year as an integer
		System.out.println("Enter the month");
		int month = input.nextInt();
		// Use if/else if/else statement to determine if it is spawning season
		if (month >= 3 && month <= 6) {
			System.out.println("Spring spawning season");
		}
		else if (month >= 9 && month <= 11) {
			System.out.println("Fall spawning season");
		}
		else {
			System.out.println("Not spawning season");
		}
	}
	// End of write code area.

	public static void main(String[] args) {
		TScanner input = new TScanner("S02SalmonInput.txt");

		int NUMBER_OF_TEST_CASES = 6;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input);
		}
	}

}
