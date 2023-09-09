/* TODO: 03
For this exercise, you are going to complete the printScope() method in the 
S03Scope class. Then you will create a Scope object in the S03ScopeTester and 
call printScope.

The method will print the name of each variable in the Scope class, as well as 
its corresponding value. There are 5 total variables in the Scope class, some 
of which can be accessed directly as instance variable, others of which need 
to be accessed via their getter methods.

For any variable that can be accessed directly, use the variable name. Otherwise, 
use the getter method.

Sample Output:
The output of the printScope method is:

t: 39
w: 24
x: 3
y: 18
z: 21

Remember that the colon space ": " is critical for the test code.
 */
public class S03ScopeTester {

	public static void main(String[] args) {
		// Write test code here
		S03Scope scope = new S03Scope();
		scope.printScope();
	}

}
