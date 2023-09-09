/* TODO: 02
We have constructed a S02Team Class for you.

Add the following:

public static variable:

int totalTeams
Static variable should be an int. The value should be incremented whenever 
a new Team is constructed.

public static variable:

int minTeams
Static variable should be an int. This is the minimum number of teams needed 
to play in the tournament. Set its value to 6.

public static method:

tournamentReady()
The tournamentReady() static method should return a boolean indicating 
whether the total number of teams created meets the minimum number of teams 
needed to play.
 */
public class S02TeamTester {

	public static void main(String[] args) {
		// Test out the S01Team class here!
		for(int i = 0; i < 5; i++)
		{
			new S02Team();
		}
		System.out.println(S02Team.tournamentReady());
		new S02Team();
		System.out.println(S02Team.tournamentReady());
	}
}
