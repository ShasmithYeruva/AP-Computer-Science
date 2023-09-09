/* TODO: 07
The Fibonacci sequence is the sequence of numbers:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, �

The next number is found by adding up the two numbers before it.

For example, the 2 is found by adding the two numbers before it (1+1). The 3 
is found by adding the two numbers before it (1+2). The 5 is found by adding 
the two numbers before it (2+3), and so on! Each number in the sequence is 
called a term.

In this exercise, you will need to:

Create the array int[] sequence that holds the values of the first 15 terms 
of the Fibonacci sequence. Think carefully about what happens to the index 
when iterating through the loop to fill this array. Read the Fibonacci 
description above to help!

Then print out the sequence of numbers separated by a space.
Finally, create a method findNextElement that returns the element that comes 
after the parameter value. If the element doesn�t exist, return -1.
Sample output:
The first 15 elements in the Fibonacci sequence are: 
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 
The element after 21 is 34
The element after 233 is 377
The element after 377 is -1

Hint: You will need to use several loops: One to fill the array, one to print 
the array, and one to traverse the array!


 */
public class S07Fibanacci {

	public static void main(String[] args) {
		//number of elements to generate in the sequence
		int max = 15;

		// create the array to hold the sequence of Fibonacci numbers
		int[] sequence = new int[16];
		// create the first 2 Fibonacci sequence elements

		sequence[0] = 0;
		sequence[1] = 1;

		//create the Fibonacci sequence and store it in int[] sequence
		for(int i = 2; i <= max; i++) {
			sequence[i] = sequence[i-2] + sequence[i-1];
		}

		//print the Fibonacci sequence numbers
		System.out.println(sequence[0]);
		System.out.println(sequence[1]);
		System.out.println(sequence[2]);
		System.out.println(sequence[3]);
		System.out.println(sequence[4]);
		System.out.println(sequence[5]);
		System.out.println(sequence[6]);
		System.out.println(sequence[7]);
		System.out.println(sequence[8]);
		System.out.println(sequence[9]);
		System.out.println(sequence[10]);
		System.out.println(sequence[11]);
		System.out.println(sequence[12]);
		System.out.println(sequence[13]);
		System.out.println(sequence[14]);

		System.out.println("\nThe element after 55 is " + 
				findNextElement(sequence, 55));

		// Be careful! Where is 377 in the array? How should your function avoid problems?

	}

	// This method returns the element that comes after element 'toFind'
	public static int findNextElement (int[] arr, int toFind) {
		int x = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == toFind) {
				x = arr[i + 1];
			}
		}
		return x;
	}

}

