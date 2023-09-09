/* TODO: 04
A splash screen is a quick, simple graphic or text that usually appears 
while a game or program is launching.

You need to make a splash screen for your Snap Shot app and a separate pop 
up to upgrade to your premium app.

Create one array that contains the Strings for the Welcome splash screen 
and print it out.

Then, without modifying the original array declaration or creating a new 
array, change the first and last elements by resetting the values of the 
original array.

Your output will look as follows:
Welcome
to
the snap shot
app!

Upgrade
to
the snap shot
premium app!

 */
public class S04SnapShot {

	public static void main(String[] args) {
		// Start here!
		String[] hi = {"Welcome", "to", "the snap shot", "app!"};
		System.out.println(hi[0]);
		System.out.println(hi[1]);
		System.out.println(hi[2]);
		System.out.println(hi[3] + "\n");
		hi[0] = "Upgrade";
		hi[3] = "premium app!";
		System.out.println(hi[0]);
		System.out.println(hi[1]);
		System.out.println(hi[2]);
		System.out.println(hi[3]);
	}

}
