/* TODO: 01
In this exercise, rewrite the for loop in the starter code, which prints out 
the odd numbers in an array, as an enhanced for-each loop.
 */
public class S01PrintOdds {
	public static void main(String[] args)
	{
		int[] values = {17, 34, 56, 2, 19, 100};

		// for : values)    
		for (int i : values)
		{
			if (i % 2 == 1)
				System.out.println(i + " is odd");
		}
	}

}
