
public class S06Ball {
	private double diameter;

	public S06Ball(double diameter){
		constructor01++;
		this.diameter = diameter;
	}

	public double getDiameter(){
		method01++;
		return diameter;
	}
	static public int constructor01 = 0;
	static public int method01 = 0;

	/* TODO: 06C */
	// Write an equals method here that returns true if
	// the diameters are the same.
	// Note: Remember to use Object as the parameter type
	// and cast to S06Ball.
	public boolean equals(Object obj) {
		S06Ball other = (S06Ball) obj;
		return (other.getDiameter() == getDiameter());
	}
	/* TODO: 06D */
	// Write a toString statement here, in this format:
	// Diameter: 2.75
	public String toString() {
		return "Diameter: " + getDiameter();
	}

}
