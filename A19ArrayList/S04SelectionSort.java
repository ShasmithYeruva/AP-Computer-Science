/* TODO: 04
In this exercise, we will be looking at our example code for Selection Sort.

However, while we are sorting we will also count the number of swaps taking 
place, then print them out once the array has been sorted.

Add a print statement at the end of the selectionSort method that prints out 
the number of swaps that took place during the sort.

You should not modify the main() method.

Hint: Where are items compared? Try writing out the steps in the algorithm on 
paper to help.
 */
import java.util.Arrays;

public class S04SelectionSort
{
	public static void main(String[] args)
	{
		int[] array1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		int[] array2 = {5, 6, 4, 8, 9, 7, 3, 1, 2};

		System.out.print("First array: ");
		System.out.println(Arrays.toString(array1));
		System.out.print("Second array: ");
		System.out.println(Arrays.toString(array2));

		// sort first array
		int numberOfSwaps1 = selectionSort(array1);
		// sort second array
		int numberOfSwaps2 = selectionSort(array2);

		System.out.print("First array sorted: ");
		System.out.println(Arrays.toString(array1));
		System.out.println("First array swaps: "+numberOfSwaps1);
		System.out.print("Second array sorted: ");
		System.out.println(Arrays.toString(array2));
		System.out.println("Second array swaps: "+numberOfSwaps2);
	}

	/*
	 * Selection sort takes in an array of integers and
	 * returns a sorted array of the same integers.
	 */
	public static int selectionSort(int[] arr)
	{
		int currentMinIndex;
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++)
		{
			currentMinIndex = i;
			for (int j = i + 1; j < arr.length; j++)
			{
				if(arr[j] < arr[currentMinIndex])
				{
					currentMinIndex = j;
				}
			}

			// swap numbers if needed
			if (i != currentMinIndex)
			{
				int temp = arr[currentMinIndex];
				arr[currentMinIndex] = arr[i];
				arr[i] = temp;
				count ++;
			}
		}

		// Return the number of swaps that took place here
		return count;
	}
}