/* TODO: 07 
 * For this exercise, you are going to create a part of a Shape hierarchy. 
 * Unlike some of our examples and the previous exercises, this exercise is 
 * going to have 3 levels in the hierarchy. 
 * 
 * At the top is the Shape class. Below that, we are going to have a 
 * subclass for Polygon. Under polygon, we are going to have 2 subclasses, 
 * Rectangle and Triangle.
 * 
 * You will need to create your class hierarchy and add instance variables, 
 * constructors and getters methods to accommodate the following information:
 * 
 * I need to save what type of shape I have (String variable)
 * I need to know if the shape is curvilinear (boolean variable)
 * I want to know number of line segments of the Polygon (int variable)
 * I want to know the width and height of the Triangle (int variables)
 * I want to know the length and width of the Rectangle (int variables)
 * Do not make width common in Polygon.
 * 
 * 1) Use only getters (accessors) and no mutators.
 * 2) Design classes with only one constructor.
 * 3) Design the constructors with the minimum number of parameters. 
 * */

public class S07ShapeTester {

	public static void main(String[] args) {
		S07Polygon trapazoid = new S07Polygon(4, "Trapazoid");
		System.out.println(trapazoid.getType() + " is curvilinear: " + 
				trapazoid.isCurvilinear() + ", and has " + 
				trapazoid.getLineSegments() + " line segments");
		S07Shape oval = new S07Shape(true, "Oval");
		System.out.println(oval.getType() + " is curvilinear: " 
				+ oval.isCurvilinear());
		S07Triangle triangle = new S07Triangle(15,21);
		System.out.println(triangle.getType() + " has a height of "  
				+ triangle.getHeight() + ", " + triangle.getLineSegments() +
				" line segments, a width of "  +  triangle.getWidth() + 
				", and is curvilinear: "  + triangle.isCurvilinear());
		S07Rectangle rectangle = new S07Rectangle(2,9);
		System.out.println(rectangle.getType() + " has a width of " 
				+ rectangle.getWidth() + ", a length of " 
				+ rectangle.getLength() 
				+ ", " + rectangle.getLineSegments() + " line segments, and"
				+ " is curvilinear: " + rectangle.isCurvilinear());
	}

}
