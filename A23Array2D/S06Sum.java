/* TODO: 06
Write the methods

public static int sumRow(int[][] array, int row)
and

public static int sumArray(int[][] array)
sumRow returns the sum of row row in the 2D array called array.

sumArray returns the sum of all of the elements in the 2D array called array. 
You should use sumRow to implement this method.

In main, print the sum of all the elements in the array.
 */
public class S06Sum
{
	public static void main(String[] args)
	{
		int[][] array = {{4, 4, 5, 6, 3, 1},
				{14, 2, 5, 4, 8, 2},
				{45, 12, 13, 5, 2, 1}};

		System.out.println("The sum of the array's elements is: " 
				+ sumArray(array));
	}

	// Returns the sum of row row in 2D array array
	public static int sumRow(int[][] array, int row)
	{
		int c = 0;
		for(int i = 0; i < array[row].length; i++) 
		{
			c += array[row][i];
		}
		return c;
	}
	// Returns the sum of all elements in array
	public static int sumArray(int[][] array)
	{
		int c = 0;
		for(int row = 0; row < array.length; row++) 
		{
			for(int index = 0; index < array[row].length; index++) 
			{
				c += array[row][index];
			}
		}
		return c;
	}
}
