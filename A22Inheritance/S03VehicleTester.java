import java.util.ArrayList;

/* TODO: 03
 * For this exercise, we are going to revisit Vehicle Car superclass that 
 * we saw as an example in the last lesson. We are also adding the Car 
 * class which adds the make and model and the Bike class which add the 
 * color and type.
 * 
 * For this exercise, you need to create either an Array or an ArrayList 
 * and add 3 vehicles to that list, a Bike, a Car, and a third type using 
 * the Vehicle class.

 * After adding these to your list, loop through and print out the basic 
 * information about the vehicles using the getName(), hasEngine(), and
 * getWheels() methods.
 * 
 * Sample Output
 * Car with 4 wheels and engine 
 * Bike with 2 wheels and no engine
 * Scooter with 2 wheels and engine
 * */
public class S03VehicleTester {
	public static void main(String[] args) {
		{
			ArrayList<S03Vehicle> list = new ArrayList<S03Vehicle>();
			S03Car car = new S03Car("Infinity", "G35");
			S03Bicycle bike = new S03Bicycle("Blue", "BMX");
			S03Vehicle scooter = new S03Vehicle("Scooter", false, 2);
			list.add(car);
			list.add(bike);
			list.add(scooter);
			for (S03Vehicle x: list) {
				if (x.hasEngine()) {
					System.out.println(x.getName() + " with " + x.getWheels()
					+ " wheels and engine");
				}
				else {
					System.out.println(x.getName() + " with " + x.getWheels()
					+ " wheels and no engine");
				}
			}
		}
	}
}
