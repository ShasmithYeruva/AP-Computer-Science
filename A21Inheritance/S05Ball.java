
public class S05Ball {
	private double diameter;

	public S05Ball(double diameter){
		constructor01++;
		this.diameter = diameter;
	}

	public double getDiameter(){
		method01++;
		return diameter;
	}
	static public int constructor01 = 0;
	static public int method01 = 0;

}
