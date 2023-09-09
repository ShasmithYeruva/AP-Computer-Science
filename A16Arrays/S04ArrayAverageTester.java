/* TODO: 04
Complete the getAverage() method in the ArrayAverage class using a for-each 
loop. Create an ArrayAverage object and print the result.

Your output should be:

The average of the array is 36.5

 */
public class S04ArrayAverageTester {

	public static void main(String[] args) {
		int[] numArray =  {12, 17, 65, 7, 30, 88};

		// Create an S04ArrayAverage object and print the result
		S04ArrayAverage array = new S04ArrayAverage(numArray);
		System.out.println("The average of the array is " + array.getAverage());
	}

}
