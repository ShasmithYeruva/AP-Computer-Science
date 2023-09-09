
public class S07Circle {
	private int radius;
	private String color;
	private int x;
	private int y;

	public S07Circle(int theRadius, String theColor, 
			int xPosition, int yPosition)
	{
		radius = theRadius;
		color = theColor;
		x = xPosition;
		y = yPosition;
	}

	public int getRadius()
	{
		return radius;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public String getColor()
	{
		return color;
	}

	// Implement a toString method and an equals method here!
	public String toString()
	{
		return getColor() + " circle with a radius of " + getRadius()
		+ " at position (" + getX() + ", " + getY() + ").";
	}

	public boolean equals(S07Circle other)
	{
		boolean x;
		if(getRadius() == other.getRadius() && getColor() == other.getColor()
				&& getX() == other.getX() && getY() == other.getY()) {
			x = true;
		}
		else {
			x = false;
		}
		return x;
	}

}
