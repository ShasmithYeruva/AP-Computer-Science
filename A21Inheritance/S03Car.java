
public class S03Car {
	// This code is complete
	private String model;
	private int fuelLevel;

	public S03Car(String model, int fuelLeft){
		this.model = model;
		this.fuelLevel = fuelLeft;
	}

	public String getModel(){
		return model;
	}

	public double getFuelLevel(){
		return fuelLevel;
	}

	// Returns how many more miles the car can go
	// with the fuel left
	public double milesLeft(double mpg){
		return fuelLevel * mpg;
	}

	public String toString(){
		return "Model: " + model + " \n" + "Tank Type: fuel ";
	}

}
