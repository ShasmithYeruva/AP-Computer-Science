/* TODO: 02
The Circle and CircleTester have been created, but they have errors. 
The public and private settings for variables and methods are not all correct.

Your job is to go through and fix them. You will need to make edits in both 
files to get them working correctly, but once complete, your output should 
match the output below.

Sample Output:
Circle with a radius of 5.0
The diameter is 10.0
The perimeter is 31.41592653589793

 */
public class S02CircleTester {
	public static void main(String[] args) {

		S02Circle circ = new S02Circle(10.0);

		circ.radius = 5.0;

		System.out.println(circ);

		System.out.println("The diameter is " + circ.getDiameter());
		System.out.println("The perimeter is " + circ.getPerimeter());
	}

}
