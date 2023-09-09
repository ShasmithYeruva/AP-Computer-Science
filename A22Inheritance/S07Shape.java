public class S07Shape {
	boolean curvilinear;
	String type; 
	public S07Shape(boolean curvilinear_, String type_) {
		curvilinear = curvilinear_;
		type = type_;
	}
	public String getType() {
		return type;
	}
	public boolean isCurvilinear() {
		return curvilinear;
	}
}
