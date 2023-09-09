/* TODO: 06
For this exercise, you are going to create a Food superclass with a 
HealthyFood subclass. The HealthyFood will also have a Fruit subclass. 
After creating these classes, test the results in the FoodTester class.

The Food class will have two instance variables, one to store the name 
and one to store the calories.

Food should have two accessor (getter methods) as well:

public String getName()
public int getCalories()
The HealthyFood class will only have two instance variables, group and 
color, which represents the food group and the color of the food, 
respectively. It should have the following accessors (getter method):

public String getGroup()
public String getColor()
The Fruit class will have two instance variables, a boolean indicator if 
the fruit is in season and the vitamins the fruit has. The accessor methods 
should be:

public boolean isInSeason()
public String getVitamins()
Constructors should follow this format:

public Food (String foodName, int calories)

public HealthyFood(String foodName, int calories, 
                   String foodGroup, String foodColor)

public Fruit(String foodName, int calories, String foodColor, 
             boolean isInSeason, String majorVitamins)

Finally, the Food class should have a toString that prints:
name has cal calories

For example:
Ice Cream has 200 calories
 */
public class S06FoodTester {
	public static void main(String[] args) {
		// Test each of your classes

		// Make an object of each type
		S06Food one = new S06Food("Ice Cream", 200);
		S06HealthyFood two = new S06HealthyFood("Lettuce", 100,
				"Compositae", "Green");
		S06Fruit three = new S06Fruit("Apple", 150, "red", true, "C");
		// Use the getters to verify the fields are set correctly
		System.out.print(one.getName());
		System.out.println(one.getCalories());
		System.out.println(two.getGroup());
		System.out.println(two.getColor());
		System.out.println(three.getVitamins());
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}

}
