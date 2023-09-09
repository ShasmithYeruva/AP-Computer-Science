/* TODO: 07
In this problem, you�ll design and test a few classes that represent 
different pieces of clothing in a clothing store.

You�ll write the classes for TShirt, Jeans, Sweatshirt and Clothing.

The Clothing class should have two instance variables: one for the size 
of the clothing (a String), and another for the clothing�s color (also a 
string).

Clothing should have two accessor (getter methods) as well:

public String getSize()
public String getColor()
The Sweatshirt class should have a private instance variable (or field) to 
store whether or not it has a hood, and a corresponding getter method

public boolean hasHood()
The TShirt class should have a private field to store the fabric and a 
corresponding getter for that called

public String getFabric()
All Jeans should have the color blue.

The constructors should be of this format:

public Clothing(String size, String color)
public TShirt(String size, String color, String fabric)
public Sweatshirt(String size, String color, boolean hasHood)
public Jeans(String size)
Be sure and test your methods in the ClothingTester class by creating 
different objects and printing out the results.
 */
public class S07ClothingTester {
	public static void main(String[] args) {
		// Start here!
		S07Clothing one = new S07Clothing("Sweatpants", "Black");
		S07Sweatshirt two = new S07Sweatshirt("Large", "Red", true);
		S07Jeans three = new S07Jeans("Small");
		S07TShirt four = new S07TShirt("Medium", "Green", "Cotton");

		System.out.println(one.getSize());
		System.out.println(one.getColor());
		System.out.println(two.hasHood());
		System.out.println(three.getColor());
		System.out.println(four.getFabric());
	}
}
