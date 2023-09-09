public class S06Racecar
{
	private double accel; // acceleration
	private String name; // name of driver

	public S06Racecar(String driver)
	{
		name = driver;
	}


	// Compute a random acceleration from 1.0 to 1.99
	// rounded to 2 decimal places
	public void computeAcceleration() {
		accel = (Math.random() + 1);
	}
	// Get the acceleration

	public double getAcceleration() {
		return accel;
	}

	// Returns the time it takes the race car
	// to complete the track rounded to 2 decimal places
	public double computeTime(double distance)
	{
		double x = Math.sqrt((2.0 * distance / accel));
		return Math.round(x * 100.0) / 100.0;
	}

	public String toString()
	{
		return "Racer " + name;
	}
}
