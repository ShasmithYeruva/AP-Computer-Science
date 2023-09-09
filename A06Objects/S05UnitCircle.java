
public class S05UnitCircle {

	// Angle in degrees
	private double angle_;

	// Construct a Unit Circle with an angle in degrees.
	public S05UnitCircle(double angle) {
		angle_ = angle;        
	}

	// Get the angle in radians rounded to 2 decimal places using
	// Math.PI and
	// Math.round
	public double getRadians() {
		return Math.round(angle_/180 * 100 * Math.PI)/100.0;
	}

	// Implement getCosine rounded to 2 decimal places using
	// Math.cos,
	// Math.PI, and
	// Math.round
	public double getCosine()
	{
		return Math.round(Math.cos(getRadians())*100.2)/100.0;
	}

	// Implement getSine rounded to 2 decimal places using
	// Math.sin,
	// Math.PI, and
	// Math.round
	public double getSine()
	{
		return Math.round(Math.sin(getRadians())*100)/100.0;
	}

}
