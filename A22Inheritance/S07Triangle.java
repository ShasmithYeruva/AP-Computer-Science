public class S07Triangle extends S07Polygon{
	int height; 
	int width;
	public S07Triangle(int height_, int width_) {
		super(3, "Triangle");
		height = height_;
		width = width_;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
}
