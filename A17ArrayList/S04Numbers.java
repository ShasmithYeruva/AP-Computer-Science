/* TODO: 04
Write a program that adds the numbers 10, 15, 20, 25, 30 into the numbers 
ArrayList and then outputs the first element in the list.
 */
import java.util.ArrayList;

public class S04Numbers {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		// Add 5 numbers to `numbers`
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		// Assign the first element in `numbers` to the variable out.
		int out = 0;

		numbers.set(0, out);

		S04NumbersTester.test(out, numbers);
	}

}
