import java.util.Arrays;

/* TODO: 05
Write a method called median that returns the median value in the array.

If the length of the array is odd, the median is the value in the center 
of the array.

If the length of the array is even, the median is the average of the two 
numbers in the center.

You may assume the array passed into this method will never be empty.

Sample output:

The median value of the EVEN array is 19.5
The median value of the ODD array is 22.0

Hint: We�ve imported java.util.* for you, so you have a handy static method 
on Arrays that you can use called Arrays.sort so you can sort your array 
BEFORE finding the median.


 */
public class S05Medium {

	public static void main(String[] args) {
		int[] numbers1 = {12, 75, 3, 17, 65, 22};
		System.out.println("The median value of the EVEN array is " + median(numbers1));

		int[] numbers2 = {12, 75, 3, 17, 65, 22, 105};
		System.out.println("The median value of the ODD array is " + median(numbers2));

	}

	public static double median(int[] arr)
	{
		// your code goes here and replace return value!
		Arrays.sort(arr);
		double x ;
		if (arr.length % 2 == 1) {
			x = arr[arr.length / 2];
		}
		else {
			double y = arr[ (int) ((arr.length / 2.0) + .5)];
			y += arr[(int) ((arr.length / 2.0) - .5)];
			x = y / 2;
		}
		return x;
	}
}
