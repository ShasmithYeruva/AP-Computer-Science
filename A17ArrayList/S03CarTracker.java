/* TODO: 03
A car company wants to keep a list of all the cars that they have in stock. 
The company has created a S03ClassicCar class that stores important information 
about each of their cars.

Initialize an ArrayList called garage that stores each S03ClassicCar that the 
company has in stock. 
 */
import java.util.ArrayList;

public class S03CarTracker {

	public static void main(String[] args) {
		//Initialize your ArrayList here:
		ArrayList<S03ClassicCar> garage = new ArrayList<S03ClassicCar>();
		// Uncomment code when done
		S03CarTrackerTester.test(garage);
	}

}
