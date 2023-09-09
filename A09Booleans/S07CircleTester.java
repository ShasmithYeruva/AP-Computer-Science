/* TODO: 07
This program is incorrectly comparing Circles using ==.

Modify the CircleTester class to correctly compare Circle objects 
using .equals

You�ll need to implement the following methods in the Circle class 
so that the CircleTester can correctly compare and print Circles:

public String toString()
public boolean equals(Circle other)

equals should only return true if both Circles have the exact same 
attributes (color, radius, x, and y). toString should return a 
String of the form 
[color] circle with a radius of [radius] at position ([x], [y]).

For example:

Circle circle = new Circle(10, "blue", 50, 40);
System.out.println(circle);
Should print out

blue circle with a radius of 10 at position (50, 40) 
 */
public class S07CircleTester {

	public static void main(String[] args) {
		S07Circle one = new S07Circle(10, "blue", 50, 35);
		S07Circle two = new S07Circle(10, "blue", 50, 35);
		S07Circle three = new S07Circle(20, "red", 0, 0);
		S07Circle four = three;

		// Modify this program to correctly compare objects
		// We should not be comparing objects using ==

		if(one.equals(two))
		{
			System.out.println("Circles one and two are equal!");
			System.out.println(one);
			System.out.println(two);
		}

		if (two.equals(three)) {
			System.out.println("Circles two and three are equal!");
			System.out.println(one);
			System.out.println(two);        	
		}

		if(three.equals(four))
		{
			System.out.println("Circles three and four are equal!");
			System.out.println(three);
			System.out.println(four);
		}
	}

}
