
public class S06Parakeet {
	private String name;
	// Add an instance variable here for color.
	private String color;
	public S06Parakeet(String birdsName, String colors)
	{
		name = birdsName;
		color = colors;
	}

	// This method should work after you add the
	// new instance variable and update the constructor.
	// DO NOT modify this method except to remove comment on the color.
	public String toString()
	{
		return name + " is a " + color + " parakeet";
	}

}
