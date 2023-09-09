/* TODO: 04
The given MathOperations class has several methods to perform mathematical 
operations.

The class has its own instance variables, and each method has its own local 
variables and parameters.

Your job is to count out the variables that exist inside each method. Each
time you see the comment.  Note the list of potential variables are identified
as private static attributes with the suffic _COUNT;

// COUNT OUT VARIABLES HERE 

appears in the code, write a print statement for each variable that is in 
scope.

An example has been provided in the sum function.

 */
public class S04MathOperations {
	private static double PI = 3.14159;

	// Potential count variables
	public static int PI_COUNT = 0;
	public static int one_COUNT = 0;
	public static int two_COUNT = 0;
	public static int a_COUNT = 0;
	public static int b_COUNT = 0;
	public static int radius_COUNT = 0;
	public static int area_COUNT = 0;
	public static int args_COUNT = 0;
	public static int result_COUNT = 0;

	public static void main(String[] args)
	{
		sum(5, 10);
		difference(20, 2);
		product(3.5, 2);
		circleCircumference(10);
		circleArea(12);
	}

	public static int sum(int one, int two)
	{
		// Counting Variables Example
		PI_COUNT++;
		one_COUNT++;
		two_COUNT++;

		return one + two;
	}

	public static int difference(int one, int two)
	{
		// COUNT OUT VARIABLES HERE
		PI_COUNT++;
		one_COUNT++;
		two_COUNT++;

		return one - two;
	}

	public static double product(double a, double b)
	{
		double result = a * b;

		// COUNT OUT VARIABLES HERE
		PI_COUNT++;
		a_COUNT++;
		b_COUNT++;
		result_COUNT ++;

		return result;
	}

	public static double circleCircumference(int radius)
	{
		// COUNT OUT VARIABLES HERE
		radius_COUNT ++;
		PI_COUNT++;

		return 2 * radius * PI;
	}

	public static double circleArea(int radius)
	{
		double area = PI * radius * radius;

		// COUNT OUT VARIABLES HERE
		PI_COUNT++;
		radius_COUNT ++;
		area_COUNT ++;

		return area;
	}
}
