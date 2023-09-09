/* TODO: 07
In this program you will ask the user for three integers and
then print out the median (middle) value.

Remember that a number is the median value if it is larger than 
one number and smaller than the other. For example, given the 
numbers 1, 3, 2 or the numbers 2, 3, 1, the middle number is 2.

Use compound boolean expressions to help you.


Here is the expected output.
Enter the first integer: 10
Enter the second integer: 11
Enter the third integer: 12
The median is 11
Enter the first integer: 21
Enter the second integer: 20
Enter the third integer: 22
The median is 21
Enter the first integer: 30
Enter the second integer: 32
Enter the third integer: 31
The median is 31
Enter the first integer: 40
Enter the second integer: 42
Enter the third integer: 42
The median is 42
Enter the first integer: 51
Enter the second integer: 51
Enter the third integer: 52
The median is 52
Enter the first integer: 61
Enter the second integer: 62
Enter the third integer: 61
The median is 61

 */
public class S07FindMedian {
	public static void run(TScanner input) {
		// Write code here!
		System.out.print("Enter the first integer: ");
		int x = input.nextInt();
		System.out.print("Enter the second integer: ");
		int y = input.nextInt();
		System.out.print("Enter the third integer: ");
		int z = input.nextInt();
		// End of write code area.
		int median = 0;
		if(x >= y && x <= z || x <= y && x >= z) {
			median = x;
		}
		else if(z >= x && z <= y || z <= x && z >= y) {
			median = z;
		}
		else {
			median = y;
		}
		System.out.println("The median is " + median);
	}

	public static void main(String[] args) {
		TScanner input = new TScanner("S07FindMedianInput.txt");

		int NUMBER_OF_TEST_CASES = 6;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input);
		}
	}

}
