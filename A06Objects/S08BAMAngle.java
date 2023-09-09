public class S08BAMAngle {
	// initializing the variables
	private int bamAngle;
	private double deg;
	// The constructor
	public S08BAMAngle(double deg) {
		this.deg = deg;
		bamAngle = toBam();
	}
	// adds the two angles
	public void addAngles(S08BAMAngle deltaAngle) {
		bamAngle += deltaAngle.bamAngle;
	}
	// subtracts the two angles
	public void subtractAngles(S08BAMAngle deltaAngle) {
		bamAngle -= deltaAngle.bamAngle;
	}
	// returns the degrees 
	public double getDegrees() {
		return (bamAngle >>> 1) * 360.0 / Integer.MAX_VALUE;
	}
	// converts from degrees to BAM
	public int toBam() {
		double bammerdub = Integer.MAX_VALUE / 360.0 * deg;
		return ((int) Math.round(bammerdub)) << 1;
	}
}
