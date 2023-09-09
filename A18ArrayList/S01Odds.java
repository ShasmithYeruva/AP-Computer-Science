import java.util.ArrayList;
/*
Create a method removeEvens that removes all even elements from an 
ArrayList of Integers.

Once the method is created, call it on the existing ArrayList in 
the main method, then print the results.
 */
public class S01Odds {

	public static void main(String[] args) {
		ArrayList<Integer> odds = new ArrayList<Integer>();
		// Pre-load the array list with values.
		for(int index = 1; index < 21; index++)
		{
			odds.add(index);
			odds.add(index);
		}
		// Call removeEvens on the ArrayList above
		removeEvens(odds);
		// Do not modify code to print array.
		for(int index = 0; index < odds.size(); index++)
		{
			System.out.print(odds.get(index) + " ");
		}
		System.out.println();
	}
	public static void removeEvens(ArrayList<Integer> array)
	{
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) % 2 == 0) {
				array.remove(i);
				i--;
			}
		}
	}	
}
