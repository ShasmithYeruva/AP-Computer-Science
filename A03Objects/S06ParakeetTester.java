/* TODO: 06
Now we are going to use more instance variables.
Here we have a class that represents a parakeet. Currently, the only instance 
variable (or field) is called name. You can make a new Parakeet object by 
passing the name to the constructor.

We want to add an instance variable, a String called color, that represents 
the parakeet’s color. Add the instance variable. Then include it as the 
second parameter to the constructor.

Test out your Parakeet class in ParakeetTester.java. Fill in the constructor 
to create a Parakeet object. If you name the bird “Ron” and make it “green”, 
then it should print

Ron is a green parakeet
 */
public class S06ParakeetTester {

	public static void main(String[] args) {
		S06Parakeet budgie = new S06Parakeet( "sam", "blue");
		System.out.println(budgie);
	}

}
