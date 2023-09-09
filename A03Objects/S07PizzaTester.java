/* TODO: 07
Modify the S07Pizza class with three instance variables

private String type
private String toppings
private int size
Add the instance variables, and then add the constructor as specified below.



Constructor
It must have a constructor with the method signature

S07Pizza(String theType, String theToppings, int theSize)


Main
In your tester program you should create at least three different S07Pizza 
objects and print them out.

For example, your program might print

12 inch Veggie pizza with Tomatoes, onions, olives
15 inch Cheese pizza with Cheese
20 inch Meat pizza with Pepperoni, sausage, bacon 
 */
public class S07PizzaTester {

	public static void main(String[] args) {
		// Test your Pizza class here.
		S07Pizza pizza1 = new S07Pizza("onions, olives", "Tomatoes", 12);
		S07Pizza pizza2 = new S07Pizza("Cheese", "Cheese", 15);
		S07Pizza pizza3 = new S07Pizza("Meat", "Pepperoni, sausage, bacon", 20);
		System.out.println(pizza1);
		System.out.println(pizza2);
		System.out.println(pizza3);
	}

}
