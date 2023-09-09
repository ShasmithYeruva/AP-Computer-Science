/* TODO: 03
For this exercise, you are going to create a part of an Animal hierarchy. 
Unlike some of our examples and the previous exercises, this exercise is 
going to have 3 levels in the hierarchy.

At the top is the Animal class. Below that, we are going to have a subclass 
for Pets. Under pets, we are going to have 2 subclasses, Dogs and Fish.

You will need to create your class hierarchy and add instance variables, 
getters, and setter methods to accommodate the following information:

I need to save what type of animal I have (String type)
I want to be able to save a name for my fish and dog (String name)
I want to know which fish need salt water v. fresh water (String saltFresh)
I want to know if my dog has been trained (boolean trained)
I want to know the size of my dog and fish (String size)
None of your classes should have constructors. Instead, create setter and 
getter methods to set the value of the instance variables that you create.

Make sure you use the variable names provided along with appropriate names
for the getter and setter methods!
 */
public class S03AnimalTester {
	public static void main(String[] args) {
		// Add code to test your hierarchy
		S03Animal dove = new S03Animal();
		dove.setType("dove");

		S03Pet cat = new S03Pet();
		cat.setName("Jack");
		cat.setSize("Large");

		S03Dog dog = new S03Dog();
		dog.setTrained(false);

		S03Fish fish = new S03Fish();
		fish.setSaltFresh("Salt Water");

		System.out.println(dove.getType());
		System.out.println(cat.getName());
		System.out.println(cat.getSize());
		System.out.println(dog.isTrained());
		System.out.println(fish.getSaltFresh());
	}

}
