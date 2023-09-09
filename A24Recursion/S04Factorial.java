/* TODO: 04 
For this problem, you are going to write a recursive function to 
calculate the factorial of a number. Remember, factorial is the 
product of an integer and all the integers below it. This function 
should be similar to the summing example we looked at earlier.
 */
public class S04Factorial {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(calcFactorial(i));
		}
	}

	public static int calcFactorial(int x)
	{
		// Write a base case
		if (x < 2) {
			return 1;
		}
		// Call the simplified solution
		return x * calcFactorial(x - 1);
	}
}
