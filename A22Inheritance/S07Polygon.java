public class S07Polygon extends S07Shape {
	int lineSegments;
	public S07Polygon(int lineSegments_, String shape) {
		super(false, shape);
		lineSegments = lineSegments_;
	}
	public int getLineSegments() {
		return lineSegments;
	}

}
