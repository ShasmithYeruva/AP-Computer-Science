/* TODO: 08A
If an expression would evaluate to an int value outside of the allowed 
range, an integer overflow occurs. This could result in an incorrect value 
within the allowed range.

In this program you will test for underflow and overflow in Java by adding 
1 to the maximum value and subtracting 1 from the minimum value to see what 
happens to the output. Your output should include 4 items:

The minimum value for an integer.
The maximum value for an integer.
The minimum value subtracted by 1.
The maximum value with 1 added.

Sample output: 

min value: xxx
max value: xxx
overflow min: xxx
overflow max: xxx

Note: Critical parts for the tester is the ": " and four lines
of output.

TODO 08B: Write down what happen to the output and why do you think that occurred?
 */
public class S08IntegerOverflow {

	public static void main(String[] args) {
		// Start here!
		int minValue = -2147483648;
		int maxValue = 2147483647;

		System.out.println("min value: " + minValue);
		System.out.println("max value: " + maxValue);
		System.out.println("overflow min: " + (minValue - 1));
		System.out.println("overflow max: "+ (maxValue + 1));
	}

}
