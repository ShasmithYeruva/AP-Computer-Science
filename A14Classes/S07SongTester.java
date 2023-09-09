/*
The S07Song class is designed to hold basic information about songs. We want 
to give the user the option to create songs as well as update all of the 
information about a song. For example, if a user accidentally thinks that 
Bruce Springsteen wrote The Heart of Rock and Roll, we want to be able to 
update that to Huey Lewis & The News.

Complete the S07Song class as outlined in the comments. Don�t change any of 
the instance variable or parameter names for this exercise. Instead, make sure 
you are using this notation.

Once completed, test your code using the S07SongTester class. You should test 
creating, printing, and updating information.

Sample Output:
artist= ABBA
title= Dancing Queen
Time= 3:54

artist= Bruce Springsteen
title= The Heart of Rock and Roll
Time= 5:14

artist= Huey Lewis & the News
title= The Heart of Rock and Roll
Time= 4:59

 */
public class S07SongTester {

	public static void main(String[] args) {
		// Write test code here.
		S07Song dancing = new S07Song("ABBA", "Dancing Queen", 3, 54);
		System.out.println(dancing);

		S07Song heart = new S07Song("Bruce Springsteen", 
				"The Heart of Rock and Roll", 5, 14);
		System.out.println(heart);

		heart.setArtist("Huey Lewis & the News");
		heart.setMinutes(4);
		heart.setSeconds(59);
		System.out.println(heart);
	}

}
