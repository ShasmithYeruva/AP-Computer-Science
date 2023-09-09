public class S07Rectangle extends S07Polygon{
	int length; 
	int width;
	public S07Rectangle(int length_, int width_) {
		super(4, "Rectangle");
		length = length_;
		width = width_;
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
}
