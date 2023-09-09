/* TODO: 08
S08CarShowroom Class
 *** NOTE: This assignment is 30% of total points ***

Specific to this assignment:
In this exercise, you will need to write two methods.

A car showroom consists of N numbered spaces. Each space can hold at most 
one car. The spaces are indexed starting from 0 though the last space, 
N - 1. No two cars in the showroom are the same model.

Write the S08CarShowroom method findCarSpace. This method returns the index of 
the space in which the car with the specified model is located. If there is 
no car of that model in the showroom, the method returns -1.

Then write the S08CarShowroom method consolidate. This method should move the 
cars so that cars in adjacent spaces, starting at index 0, have no empty 
spaces between any two cars. Keep the order of the cars the same as the array 
in the code shows. The toString method has been provided to print out filled 
and unfilled spaces.

Output:

Space 0 has a Mustang with a top speed of 157
Space 1 has a Camaro with a top speed of 155
Space 2 has a  null 
Space 3 has a Corvette with a top speed of 194
Space 4 has a  null 
Space 5 has a  null 
Space 6 has a Porsche with a top speed of 210

Index of Mustang should be 0 and is 0
Index of Corvette should be 3 and is 3
Index of Miata should be -1 and is -1

Original Car Showroom:
Space 0 has a Mustang with a top speed of 157
Space 1 has a Camaro with a top speed of 155
Space 2 has a  null 
Space 3 has a Corvette with a top speed of 194
Space 4 has a  null 
Space 5 has a  null 
Space 6 has a Porsche with a top speed of 210

Car Showroom after cars have been consolidated:
Space 0 has a Mustang with a top speed of 157
Space 1 has a Camaro with a top speed of 155
Space 2 has a Corvette with a top speed of 194
Space 3 has a Porsche with a top speed of 210
Space 4 has a  null 
Space 5 has a  null 
Space 6 has a  null 


 */

public class S08CarShowroom {
	public static void main (String[] args)
	{
		S08CarShowroom showroom = new S08CarShowroom(7);
		showroom.spaces[0] = new S08CarModel("Mustang", 157);
		showroom.spaces[1] = new S08CarModel("Camaro",155);
		showroom.spaces[3] = new S08CarModel("Corvette", 194);
		showroom.spaces[6] = new S08CarModel("Porsche", 210);

		// print out what is in the showroom
		System.out.println(showroom);

		// test output
		System.out.println("Index of Mustang should be 0 and is " +
				showroom.findCarSpace("Mustang"));
		System.out.println("Index of Corvette should be 3 and is " +
				showroom.findCarSpace("Corvette"));
		System.out.println("Index of Miata should be -1 and is " +
				showroom.findCarSpace("Miata"));


		System.out.println("\nOriginal Car Showroom:");
		System.out.println(showroom);
		showroom.consolidate();
		System.out.println("Car Showroom after cars have been consolidated:");
		System.out.println(showroom);
	}

	private S08CarModel[] spaces;

	// constructor for number of spaces in showroom
	public S08CarShowroom(int numParkingSpaces)
	{
		spaces = new S08CarModel[numParkingSpaces];
	}

	// Returns index of space that contains the car with the specified model
	// and -1 if no car in the showroom is that model.No two cars in the showroom are the same model.

	public int findCarSpace(String name)
	{
		// your code goes here and modify return value
		int x = -1;
		for (int i = 0; i < spaces.length; i++) {
			if(spaces[i] != null && name.equals(spaces[i].getName())) {
				x = i;
			}
		}
		return x;
	}

	// Consolidates cars in the showroom so that there are no gaps
	// in the parking spaces so that it's easier to move new models in

	public void consolidate()
	{ 
		// your code goes here
		for (int i = 0; i < spaces.length - 1; i++) {
			if (spaces[i] == null) {
				for (int j = i + 1; j < spaces.length; j ++) {
					if(spaces[j] != null) {
						spaces[i] = spaces[j];
						spaces[j] = null;
						j = spaces.length;
					}
				}
			}
		}
	}

	public String toString()
	{
		String result = "";
		S08CarModel sp = null;

		// iterate through the spaces
		for (int i = 0; i < spaces.length; i++) 
		{
			sp = spaces[i];
			result = result + "Space " + i + " has a ";

			// locate empty spaces
			if (sp == null)
			{
				result = result + " null \n";
			}
			else result = result + sp.toString() + "\n";
		}
		return result;
	}

}
