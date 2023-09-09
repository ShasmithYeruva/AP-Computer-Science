import java.util.ArrayList;
/* TODO: 06A
Write a recursive function that finds the minimum value in an ArrayList.

Your function signature should be

public static int findMinimum(ArrayList<Integer> numbers, int currentMin)
One way to think of finding a minimum recursively is to think 
“the minimum number is either the last element in the ArrayList, 
or the minimum value in the rest of the ArrayList”.

For example, if you have the ArrayList

[1, 3, 2, 567, 23, 45, 9]

9 or minimum of [1, 3, 2, 567, 23, 45]

Here is the complete expected output.
Minimum: 1
3 or minimum of [1, 2]
2 or minimum of [1]
Minimum: 1
1 or minimum of [3, 2]
1 or minimum of [3]
Minimum: 1
9 or minimum of [1, 3, 2, 567, 23, 45]
9 or minimum of [1, 3, 2, 567, 23]
9 or minimum of [1, 3, 2, 567]
9 or minimum of [1, 3, 2]
2 or minimum of [1, 3]
2 or minimum of [1]
Minimum: 1

 */

public class S06RecursiveMin
{
	public static void main(String[] args)
	{    	
		TesterHelper th = new TesterHelper();
		th.initIO("S06RecursiveMinOut.txt");

		int[][] testCases = 
			{{1},{1,2,3},{3,2,1},    				
					{1,3,2,567,23,45,9}};

		for (int[] testCase : testCases) {
			int minimum = findMinimum(buildArrayList(testCase),Integer.MAX_VALUE);
			System.out.println("Minimum: " + minimum);
		}

	}

	public static ArrayList<Integer> buildArrayList(int[] inputList) {
		ArrayList<Integer> out = new ArrayList<Integer>();
		for (int item : inputList) {
			out.add(item);
		}
		return out;
	}

	public static int findMinimum(ArrayList<Integer> numbers, int currentMin)
	{

		// TODO: 06B Write code here.
		if (numbers.size() == 0) {
			return currentMin;
		}

		int i = numbers.remove(numbers.size() - 1);
		if(i < currentMin) {currentMin = i;}
		if(numbers.size() != 0){
			System.out.println(currentMin + " or minimum of " + numbers.toString());
		}
		return findMinimum(numbers, currentMin);
	} 
}
