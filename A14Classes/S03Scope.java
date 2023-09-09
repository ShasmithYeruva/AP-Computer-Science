
public class S03Scope {
	private int x;
	private int y;
	private int z;

	public S03Scope(){
		x = 3;
		y = 18;
		z = 21;
	}

	public void printScope(){
		// Start here
		System.out.println("t: " + getT());
		System.out.println("w: " + getW());
		System.out.println("x: " + getX());
		System.out.println("y: " + getY());
		System.out.println("z: " + getZ());

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public int getW(){
		int w = x + z;
		return w;
	}

	public int getT() {
		int t = y + z;
		return t;
	}
}
