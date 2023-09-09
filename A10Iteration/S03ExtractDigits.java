/* TODO: 03
Using a while loop, create an algorithm extractDigits that prints the 
individual digits of a positive integer.

For instance, extractDigits(54321); would create the output:

1
2
3
4
5
Hint: The % and the / operators are going to be very useful in this 
program. How can you use these to extract the last digit of the given 
number? You should be using a while loop to help you.
 */
public class S03ExtractDigits {

	public static void main(String[] args) {
		extractDigits(2938724);		
	}

	public static void extractDigits(int num) {
		// Write code here
		while (num >= 1) {
			int x = num % 10;
			System.out.println(x);
			num /= 10;
		}

	}

}
