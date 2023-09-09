/* TODO: 05
For this exercise, you are going to write a recursive function that 
counts down by twos to a Blastoff!

Your recursive function will not actually print. It will return a 
String that can be printed from the main function. Each recursive call 
will add on to that string.

In your main function, write a for loop from 0 to 5 inclusive, then 
print the results.

 *** No credit provided without test code written here. ***
Expected output:
Blastoff!
1 Blastoff!
2 Blastoff!
3 1 Blastoff!
4 2 Blastoff!
5 3 1 Blastoff!

 */
public class S05Countdown
{
	public static void main(String[] args)
	{    	
		System.out.println(countdown(0));
		System.out.println(countdown(1));
		System.out.println(countdown(2));
		System.out.println(countdown(3));
		System.out.println(countdown(4));
		System.out.println(countdown(5));
	}

	public static String countdown(int number)
	{

		// Base case - return Blastoff!
		if (number < 1) {

			return "Blastoff!";
		}
		// Recursive call
		return number + " " + countdown(number - 2);

	}
}