public class S01Rectangle
{
	private int width;
	private int height;

	/**
	 * This is the constructor to create a Rectangle.
	 * To create a Rectangle we need to know its width
	 * and height.
	 */
	public S01Rectangle(int rectWidth, int rectHeight)
	{
		width = rectWidth;
		height = rectHeight;
	}


	// Put your methods here
	public int getHeight() {
		return height;
	}

	public void setHeight(int ht) {
		height = ht;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int wd) {
		width = wd;
	}

	public int getArea() {
		return getHeight() * getWidth();
	}

	public int getPerimeter() {
		return getHeight() + getHeight() + getWidth() + getWidth();
	}

	/**
	 * This is the toString method. It returns a String
	 * representation of the object. 
	 */
	public String toString(){
		String res = "Rectangle width: " + width;
		res += ", Rectangle height: " + height;
		return res;
	}
}
