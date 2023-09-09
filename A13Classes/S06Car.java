
public class S06Car {
	private double efficiency; // this is miles per gallon
	private double gas;
	private double tankCapacity;
	private double totalMilesDriven;
	public S06Car(double carEfficiency, double carTankCapacity) {
		efficiency = carEfficiency;
		tankCapacity = carTankCapacity;
	}

	public void addGas() {
		System.out.println("Filling up ...");
		gas = tankCapacity;
	}

	public void addGas(double amount) {
		System.out.println("Adding gas ...");
		if (gas + amount < tankCapacity) {
			gas += amount;
		}
		else {
			gas = tankCapacity;
		}
	}

	public double getTotalMilesDriven() {
		return totalMilesDriven;
	}

	public void drive(double distance) {
		if (canDrive(distance)) {
			System.out.println("Driving " + distance);
			totalMilesDriven += distance;
			gas = ((gas * efficiency) - distance) / efficiency;
		}
		else{
			System.out.println("Can't drive " + distance + ". That's too far!");
		}

	}


	public boolean canDrive (double distance) {
		boolean x = false;
		if (gas * efficiency >= distance) {
			x = true;
		}
		return x;
	}


	public double milesAvailable() {
		return (gas * efficiency);
	}


	public double getGas() {
		return gas;
	}

}
