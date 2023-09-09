/* TODO: 01
Write your own accessor and mutator method for the S01Rectangle class instance 
variables.

You should create the following methods:

getHeight
setHeight
getWidth
setWidth
getArea
getPerimeter
toString- The output of a rectangle with width 10 and height 4 method 
should be:
Rectangle width: 10, Rectangle height: 4
 */
public class S01RectangleTester {

	public static void main(String[] args) {
		// Make some objects and print out their
		// areas and perimeters
		S01Rectangle one = new S01Rectangle(10, 4);
		System.out.println("The original rectangle has ");
		System.out.println(one);
		System.out.println("The area is " + one.getArea());
		System.out.println("The perimeter is " + one.getPerimeter());
		one.setHeight(7);
		one.setWidth(9);
		System.out.println("After modifying the rectangle ");
		System.out.println(one);
		System.out.println("The area is " + one.getArea());
		System.out.println("The perimeter is " + one.getPerimeter());
		System.out.println("=============================================");
		S01Rectangle two = new S01Rectangle(15, 5);
		System.out.println("The original rectangle has ");
		System.out.println(two);
		System.out.println("The area is " + two.getArea());
		System.out.println("The perimeter is " + two.getPerimeter());
		two.setHeight(12);
		two.setWidth(14);
		System.out.println("After modifying the rectangle ");
		System.out.println(two);
		System.out.println("The area is " + two.getArea());
		System.out.println("The perimeter is " + two.getPerimeter());
		System.out.println("=============================================");
		S01Rectangle three = new S01Rectangle(5, 3);
		System.out.println("The original rectangle has ");
		System.out.println(three);
		System.out.println("The area is " + three.getArea());
		System.out.println("The perimeter is " + three.getPerimeter());
		three.setHeight(18);
		three.setWidth(20);
		System.out.println("After modifying the rectangle ");
		System.out.println(three);
		System.out.println("The area is " + three.getArea());
		System.out.println("The perimeter is " + three.getPerimeter());
		System.out.println("=============================================");

	}

}
