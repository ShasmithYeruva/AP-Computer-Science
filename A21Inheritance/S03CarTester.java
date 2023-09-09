import java.util.ArrayList;
import java.util.Scanner;

/* TODO: 03A
The focus of this exercise is the CarTester class. In this class, create 
an ArrayList that can hold Cars and ElectricCars. Then, you will prompt 
the user for a car model. Ask for either the remaining battery percentage 
or the amount of fuel left, depending on whether the car is electric. 
Add each car to the ArrayList.

You will continue asking the user until no lines left, then you will loop 
through your ArrayList and print the results.

Remember, for a method call to compile, it needs to be defined in the 
reference type (the Car class in this exercise), but the actual method 
that executes will be based on the instantiated class. In this exercise, 
we want electric cars to run the Override methods.

The input prompts are predetermine for you using the text file input
S03CarInput.txt instead of the standard prompt from the console. 
You should use this text file input the same way as if a user was 
entering these commands one at a time using input prompts. 
The only difference is that you will need to print out the value 
from the scanner input.

Example:
System.out.print("Person's name: ");
String personName = input.nextLine();
System.out.println(personName);

To pass the code checker you will need a ": " followed by the 
input or output value.

Points deducted for poorly worded input prompts.

The standard output is redirected to the file "S03CarOut.txt"

<Begin of Sample output>
Model: Leaf
Electric car (y/n): y
Percent of battery left (as a whole number): 57
Model: Tank
Electric car (y/n): n
Gallons of fuel left: 80

Model: Leaf 
Tank Type: electric
Fuel Amount: 0.57

Model: Tank 
Tank Type: fuel
Fuel Amount: 80.0
<End of Sample output>

 */
public class S03CarTester {
	public static void main(String[] args) {
		ArrayList<S03Car> list = new ArrayList<S03Car>();
		TesterHelper th = new  TesterHelper();		
		Scanner input = th.initIO("S03CarInput.txt","S03CarOut.txt");
		while (input.hasNext()) {
			System.out.print("Model: ");
			String model = input.nextLine();
			System.out.println(model);

			System.out.print("Electric car (y/n): ");
			String electric = input.nextLine();
			System.out.println(electric);

			if (electric.equals("y")) {
				System.out.print("Percent of battery left (as a whole number): ");
				int battery = input.nextInt();
				System.out.println(battery);			
				input.nextLine(); // To advance to next line
				list.add(new S03ElectricCar(model, battery));
			}
			else {
				System.out.print("Gallons of fuel left: ");
				int gallons = input.nextInt();
				System.out.println(gallons);			
				input.nextLine(); // To advance to next line
				list.add(new S03Car(model, gallons));
			}
		}
		for (S03Car car: list) {
			System.out.println("");
			System.out.println(car + " ");
			System.out.println("Fuel amount: " + car.getFuelLevel() + " ");
		}

	}
}
