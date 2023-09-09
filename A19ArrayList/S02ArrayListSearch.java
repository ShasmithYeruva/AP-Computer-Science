/* TODO: 02
In this exercise, you will code a modified version of the linear search from 
the previous example.

Here you should implement a method to do a linear search on an ArrayList of 
Strings and return the index of the search double, or -1 if it isn�t found 
using a while loop.
 */
import java.util.ArrayList;

public class S02ArrayListSearch {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add(new String("We the People"));
		array.add(new String("in order to form"));
		array.add(new String("a more perfect union"));
		array.add(new String("establish justice and"));
		array.add(new String("ensure domestic tranquility"));
		System.out.println(search(array,new String
				("a more perfect union")));
		System.out.println(search(array,new String
				("don't tread on me")));
	}

	public static int search(ArrayList<String> array, String key) {
		//
		for (int i = 0;i < array.size(); i++) {
			if (array.get(i).equals(key)) {
				return i;
			}
		}
		return -1;
	}

}
