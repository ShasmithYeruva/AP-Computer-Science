/* TODO: 02
In this exercise, rewrite the for-each loop that finds the largest value 
in an array as a for or while loop.
 */
public class S02LargestValue {
	public static void main(String[] arg) 
	{ 
		{ 
			int[] values = {32, 56, 79, 2, 150, 37}; 

			int highestValue = findMax(values); 
			System.out.println("The highest score is " + highestValue); 
		} 
	} 
	public static int findMax(int[] numbers) 
	{  
		int maxSoFar = numbers[0];

		// for each loop to rewrite as for loop 
		for (int num = 0;num < numbers.length; num++)  
		{ 
			if (numbers[num] > maxSoFar) 
			{ 
				maxSoFar = numbers[num]; 
			} 
		} 
		return maxSoFar; 
	} 
}
