import java.util.ArrayList;

/* TODO: 07
Happy Numbers

The definition of a "happy" number, per Wikipedia:
A happy number is a number defined by the following process: Starting 
with any positive integer, replace the number by the sum of the squares 
of its digits, and repeat the process until the number either equals 1 
(where it will stay), or it loops endlessly in a cycle which does not 
include 1 (4, 16, 37, 58, 89, 145, 42, 20, 4, 16, 37, ...)

Those numbers for which this process ends in 1 are happy numbers, while 
those that do not end in 1 are "sad" numbers.

Write a method boolean isHappy(int n) that will return true if a number 
is happy.  Your solution should not use any loops.  You can assume n will 
always be greater than zero.

You will need a couple private "helper" methods to perform the recursion.  
The isHappy() method is simply the "client" method; the helper methods 
will do the necessary recursion.  

One of the helper methods should return the "next" number in the series 
(the sum of the squares of the current number's digits).  This is usually 
done with a while loop:

int num = 16;
int next = 0;

while (num > 0) {
	next += Math.pow(num % 10, 2);
	num /= 10;
} //next == 62 + 12 or 37

However, you'll be using recursion instead.  You will detect infinite loops 
by remembering which numbers you've already encountered (e.g. using an 
ArrayList to remember all the numbers in the current series).
	isHappy(19)  >>> true
	isHappy(230) >>> true
	isHappy(231) >>> false

 */
public class S07HappyNumber 
{
	public static void main(String[] args) 
	{

		computeIsHappy(19);
		computeIsHappy(230);
		computeIsHappy(231);

	}
	public static void computeIsHappy(int num) 
	{
		System.out.println("isHappy(" + num + ") >>> " + isHappy(num));
	}
	public static boolean isHappy(int num) {
		if(num == 1) 
			return true;
		num = next(num, 0);
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(num);
		return computeIsHappy(num, array);
	}
	public static boolean computeIsHappy(int num, ArrayList<Integer> arr) 
	{
		if(num == 1)
			return true;
		num = next(num, 0);
		if(binaryRec(arr, num, 0, arr.size() - 1) != -1)
			return false;
		arr.add(num);
		return computeIsHappy(num, arr);	
	}
	public static int next(int num, int n) 
	{
		if(num == 0)
			return n;
		n += Math.pow(num % 10, 2);
		num /= 10;
		return next(num, n);
	}
	public static int binaryRec(ArrayList<Integer> array, int target, int begin, int end) 
	{
		if (begin <= end)
		{
			int mid = (begin + end) / 2;
			if (target == array.get(mid))
				return mid;  
			if (target < array.get(mid))
				return binaryRec(array, target, begin, mid - 1);
			if (target > array.get(mid))
				return binaryRec(array, target, mid + 1, end);
		}
		return -1;
	}
}
