/* TODO 04: 
A t-shirt costs $22. You can personalize the t-shirt for $1 extra.

Using only one variable called cost and the increment and decrement 
operators, print the cost of the t-shirt, the cost of a personalized 
t-shirt, and then the original cost of the t-shirt.

Sample output: 

The t-shirt costs: $22
A personalized t-shirt costs: $23
Without personalization, the t-shirt costs: $22

Note: Critical parts for the tester is the ": " and three lines
of output.
 */
public class S04Tshirt {

	public static void main(String[] args) {
		// Start here!
		int cost = 22;
		System.out.println("The t-shirt costs: $" + cost++ );
		System.out.println("A personalized t-shirt costs: $" + cost-- );
		System.out.println("Without personalization, the t-shirt costs: $" + cost );
	}

}
