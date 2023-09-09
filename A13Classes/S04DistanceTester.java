/* TODO: 04
Implement the class S04Distance.

This class has one instance variable, a double called kilometers. The class 
has methods that convert the kilometers into different units.

It should have the following methods

A constructor taking one parameter - initializes kilometers to the parameter 
value

toMiles - converts kilometers to miles, then returns the value. To convert to 
miles, divide kilometers by 1.609

toLeagues - converts kilometers to leagues, then returns the value. To convert 
to leagues, divide kilometers by 5.556.

doubleMiles - converts kilometers to miles, then returns double that value. 
Use toMiles to do the conversion.

getKilometers - returns the value of kilometers

Note that the only method that should modify the value of kilometers 
is the constructor.

Main Method
To test your class, create three Distance objects in main. Convert one 
distance to miles, one to leagues, and one to doubled miles. Print out the 
kilometer value and the converted value.

Here is what your output should look like:

5.0 km = 3.107520198881293 miles
20.0 km = 3.599712023038157 leagues
10.0 km (one way) = 12.430080795525171 miles (round trip)

 */
public class S04DistanceTester {

	public static void main(String[] args) {
		// Create three Distance objects
		S04Distance one = new S04Distance(5.0);
		S04Distance two = new S04Distance(20.0);
		S04Distance three = new S04Distance(10.0);
		// Convert one to miles, one to leagues and
		// double one mileage

		// Print out the converted values
		// Use the getter!
		System.out.println(one.getKilometers() + " km = " + (one.toMiles()) + " miles");
		System.out.println(two.getKilometers() + " km = " + (two.toLeagues()) + " leagues");
		System.out.println(three.getKilometers() + " km (one way) = " + (three.doubleMiles()) + " miles (round trip)");
	}

}
