
public class S08WowVehicle {
	// initializing the variables
	private String name;
	private double topSpeed;
	private int wheels;
	private boolean gasOrElec;

	// A constructor with a string, double, integer, and a boolean
	public S08WowVehicle (String name, double topSpeed, 
			int wheels, boolean gasOrElec) {
		this.name = name;
		this.topSpeed = topSpeed;
		this.wheels = wheels;
		this.gasOrElec = gasOrElec;
	}

	// This is the toString and it prints the instances in full messages
	public String toString() {
		String x;
		if (gasOrElec == false)
			x = "electric";
		else {
			x = "gas";
		}
		return "Their vehicle's name is " + name +
				", its top speed is " + topSpeed + "mph, it has " +
				wheels + " wheels, and runs on " + x + "." + "\n";
	}

}
