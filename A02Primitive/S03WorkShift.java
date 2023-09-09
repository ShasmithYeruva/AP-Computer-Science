/* TODO: 03 
A doctor works 20 hours, 42 minutes, and 16 seconds in one shift at a 
hospital. Convert the total shift time into seconds and display that 
information.

NOTE: You must use at least ONE compound operator (+=, -=, *=, /=, %=) 
to complete this program.
 */
public class S03WorkShift {

	public static void main(String[] args) {
		int seconds = 0;
		// Start code after this line.
		seconds = 16;
		int minutes = 42;
		int hours = 20;

		seconds += (minutes * 60) + (60 * (60 * hours));


		// End code before this line.
		System.out.println("Doctor worked (seconds): "+seconds);
	}

}
