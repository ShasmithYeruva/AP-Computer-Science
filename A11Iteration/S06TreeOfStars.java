/* TODO: 06
In this program, you need to make an upside-down tree that contains stars *. 
After all, in computer science, trees have the root at the top and leaves 
at the bottom!

Your output should look like:

 * * * * * * * * * 
 * * * * * * * * 
 * * * * * * * 
 * * * * * * 
 * * * * * 
 * * * * 
 * * * 
 * * 
 * 
Modify the makeATree method in the starter code to create this!

Hint: You will need to create a variable that controls how far the * is from 
edge of the console. That variable should change size each iteration through 
the outer loop!
 */
public class S06TreeOfStars {

	public static void main(String[] args) {
		// Call makeATree 
		makeATree();
	}
	public static void makeATree() {
		// Your code goes here!!!
		String y = "";
		String tree = ("*********");
		for(int i = tree.length(); i > 0; i--) {
			String x = (tree.substring(0, i)).replace("", " ");
			System.out.print(y);
			System.out.println(x);
			y += " ";
		}
	}

}
