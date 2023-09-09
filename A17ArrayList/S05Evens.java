/* TODO: 05
Create an ArrayList with elements that are even numbers from 100 - 300.

Hint: Use a loop!
 */

import java.util.ArrayList;

public class S05Evens
{
	public static void main(String[] args)
	{
		// Create the evens ArrayList
		ArrayList<Integer> evens = new ArrayList<Integer>();

		for (int i = 100; i <= 300; i += 2)
			evens.add(i);
		//	Then uncomment the code.        
		printArray(evens);
	}


	//Don't alter this method! It will print your array in the console
	public static void printArray(ArrayList<Integer> array)
	{
		System.out.print("Array: ");
		for(int name: array)
		{
			System.out.print(name + " ");
		}
		System.out.println();
	}
}