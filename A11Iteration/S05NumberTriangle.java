/* TODO: 05
In this program, you need to make an upright triangle that contains the 
numbers 1-5. 
Your output should look like:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
Modify the makeNumberTriangle method in the starter code to create this!
 */
public class S05NumberTriangle {

	public static void main(String[] args) {
		// Call makeNumberTriangle 
		makeNumberTriangle();
	}

	// Makes an upright triangle with the numbers 1-5
	public static void makeNumberTriangle() {
		// Your code goes here! 
		for(int i = 1; i <= 5; i++) {
			String triangle = ("12345");
			System.out.println((triangle.substring(0, i)).replace("", " "));
		}


	}

}
