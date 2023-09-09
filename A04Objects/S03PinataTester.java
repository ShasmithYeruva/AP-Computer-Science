/* TODO: 3A
This class represents a piñata. If you aren’t familiar with piñatas, 
according to Wikipedia, a piñata is a shape or animal made out of 
paper mache and is filled with candy or toys. People take turns 
trying to break open the piñata while wearing a blindfold!

The class only has a constructor without parameters. Your job is to 
add three more constructors so the user can design their own pinatas:

A constructor that allows users to customize all the instance variables.
A constructor that allows users to customize the color and the shape.
A constructor that allows users to customize the candy.
Note:
The default color is "rainbow".
The default shape is "donkey".
the default candy is "hard candy".

You can see the descriptions in the Pinata class. You can also see how 
the constructors should be able to be used in PinataTester.java.

Note: The additional constructors will take values as formal parameters. 
You do not need to prompt the user for these values.

After you make the constructors, you should be able to run your program 
without changing code in PinataTester.java.

In the constructors, use the default values given in the default 
constructors to fill in any values that were not passed as parameters.

 */

public class S03PinataTester {

	public static void main(String[] args) {
		// Make Pinatas!

		S03Pinata ella = new S03Pinata();

		// TODO: 3B Uncomment the next three lines.
		S03Pinata pete = new S03Pinata("chocolate", "blue", "star");
		S03Pinata donkey = new S03Pinata("brown", "donkey shape");
		S03Pinata sweetie = new S03Pinata("sour straws");

		// Print the pinatas
		System.out.println(ella);

		// TODO: 3C Uncomment the next three lines.
		System.out.println(pete);
		System.out.println(donkey);
		System.out.println(sweetie);
	}

}
