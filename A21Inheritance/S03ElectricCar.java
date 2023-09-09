public class S03ElectricCar extends S03Car {

	// Complete the constructor
	// Note we're reinterpreting "fuelLevel" as "batteryLevel"
	public S03ElectricCar(String model, int batteryLevel) {

		super(model, batteryLevel);

	}

	/* TODO: 03B */
	// Override getFuelLevel
	// Reinterprets fuelLevel() as a percentage
	// Remember super.getFuelLevel will return fuelLevel!
	public double getFuelLevel() {

		return super.getFuelLevel() / 100;

	}

	/* TODO: 03C */
	// Override milesLeft
	// Takes one parameter - the total number of miles an ElectricCar
	// gets on a full charge.
	// Computes miles left by interpreting fuelLevel as the
	// battery percentage left in the car
	public double milesLeft(double totalMiles) {

		return getFuelLevel() * totalMiles;

	}


	/* TODO: 03D */
	// Override toString
	// Should print: model electric car
	/* NOTE: Look at the parent toString method, a space is require
	 * just prior to the end of lines for the code checker to pass.
	 */
	public String toString() {

		return "Model: " + super.getModel() + " \n" + "Tank Type: electric";

	}
}