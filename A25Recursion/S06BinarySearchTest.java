import java.util.Arrays;

/* TODO: 06
How many times does a binary search need to execute to find its value? 
Recall from our lesson that the number of iterations is roughly a log 
base 2 relationship.

In this exercise, you are going to calculate the maximum iterations and 
the actual iterations needed to find a random value in arrays of size 
100, 1000, 10k, and 100k.

You are given helper methods to calculate the maximum iterations, generate 
the random array, and do the binary search. You are also given a counter 
variable that increments each time your recursive binary method is called.

You will need to come up with the remainder of the code.

Sample Output
Array Size: 100
Max iterations: 7
Actual iterations: 4
====
Array Size: 1000
Max iterations: 10
Actual iterations: 5
====
Array Size: 10000
Max iterations: 14
Actual iterations: 5
====
Array Size: 100000
Max iterations: 17
Actual iterations: 6
====
 */
public class S06BinarySearchTest {

	static int count = 0;

	public static void main(String[] args) {

		// Use the helper code to generate arrays, calculate the max
		// iterations, and then find the actual iterations for a randomly
		// selected value.
		// Basically create a for loop that iterates and outputs the 
		// above cases.

		for(int i = 100; i <= 100000; i *= 10) {
			count = 0;
			System.out.println("Array Size: " + i);
			System.out.println("Max iterations: " + binaryMax(i));
			binaryRec(generateArrayOfLength(i), (int)Math.random() * 100, 0, i-1);
			System.out.println("Actual iterations: " + count);
			System.out.println("====");
		}




	}

	public static int binaryRec(int[] array, int target, int begin, int end) {
		if (begin <= end)
		{
			int mid = (begin + end) / 2;

			// Base Case
			if (target == array[mid]) {
				return mid;
			}

			if (target < array[mid]) {
				count += 1;
				return binaryRec(array, target, begin, mid - 1);
			}

			if (target > array[mid]) {
				count += 1;
				return binaryRec(array, target, mid + 1, end);

			}

		}
		return -1; //Alternate Base Case - not found
	}

	public static int[] generateArrayOfLength(int length)
	{
		int[] arr = new int[length];
		for(int i = 0; i < length; i++)
		{
			arr[i] = (int)(Math.random() * 100);
		}

		Arrays.sort(arr);

		return arr;
	}

	private static int binaryMax(int length) {
		return (int) (Math.log(length) / Math.log(2)) + 1;
	}
}