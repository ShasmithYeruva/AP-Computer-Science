/* TODO: 02
For this exercise, you are going to design 3 classes:

Computer - Superclass
Laptop - Subclass
Desktop - Subclass
You will design these classes to optimize the superclass/subclass 
relationship by creating instance variables and getter/setter methods.

Include the following instance variables:

int screenSize - Inches of monitor space
int memory - GB of ram
double batteryLife - Hours of battery life
boolean monitor - Whether or not a monitor is included
Each class should have at least one variable in it.

Once completed, the Tester class should execute without error.

 */
public class S02ComputerTester {
	public static void main(String[] args)
	{

		S02Laptop macBook = new S02Laptop();
		macBook.setBatteryLife(8.5);

		S02Desktop dell = new S02Desktop();
		dell.setScreenSize(18);

		S02Computer surface = new S02Computer();
		surface.setScreenSize(11);

		System.out.println(macBook.getBatteryLife());
		System.out.println(dell.getScreenSize());
		System.out.println(surface.getScreenSize());
	}
}
