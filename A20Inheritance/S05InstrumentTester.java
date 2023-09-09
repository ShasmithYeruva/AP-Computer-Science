/* TODO: 05
In this exercise, you are going to build a hierarchy to create instrument 
objects. We are going to create part of the orchestra using three classes, 
Instrument, Wind, and Strings. Note that the Strings class has a name very 
close to the String class, so be careful with your naming convention!

We need to save the following characteristics:

Name and family should be saved for all instruments
We need to specify whether a strings instrument uses a bow
We need to specify whether a wind instrument uses a reed
Build the classes out with getters and setters for all classes. Only the 
superclass needs a toString and the toString should print like this:
Violin is a member of the Strings family.

Your constructors should be set up to match the objects created in the 
InstrumentTester class.

 */
public class S05InstrumentTester {
	/**
	 * Don't Change This Tester Class!
	 * 
	 * When you are finished, this should run without error.
	 */
	public static void main(String[] args) {
		S05Wind tuba = new S05Wind("Tuba", "Brass", false);
		S05Wind clarinet = new S05Wind("Clarinet", "Woodwind", true);

		S05Strings violin = new S05Strings("Violin", true);
		S05Strings harp = new S05Strings("Harp", false);

		System.out.println(tuba);
		System.out.println(clarinet);

		System.out.println(violin);
		System.out.println(harp);
	}

}
