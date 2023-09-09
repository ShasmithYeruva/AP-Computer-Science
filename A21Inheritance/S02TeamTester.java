/* TODO: 02A
For this exercise, you are given a Team superclass with a BaseballTeam 
and FootballTeam subclass. Take a moment to examine these classes and 
the instance variables and methods in each.

In the TeamTester class, you will see three objects declared and 
instantiated using the Team, FootballTeam, or BaseballTeam classes.

For each object, use a print statement to print out any public method 
that returns information that is available for that particular object, 
including the toString.

For example, the dolphin object is a FootballTeam object. One of the 
pieces of information that can be printed is the getTies() method, 
so you will call that method in your TeamTester file:

System.out.println(dolphins.getTies());
Do this for all the methods that each of the objects can call.

Hint: Remember, for the program to compile and run, Java looks for 
methods to exist in certain classes.
 */
public class S02TeamTester {

	public static void main(String[] args) {
		S02FootballTeam dolphins = new S02FootballTeam("Dolphins", "Miami", 8, 4, 1);
		S02Team cubs = new S02BaseballTeam("Cubs", "Chicago", 80, 65, "National");
		S02Team lizards = new S02Team("Lizards", "New York", 9, 5);

		/* TODO: 02B */
		//Print out all available information for the Dolphins
		System.out.println(dolphins);
		System.out.println(dolphins.getName());
		System.out.println(dolphins.getLocation());
		System.out.println(dolphins.getLosses());
		System.out.println(dolphins.getTies());
		System.out.println(dolphins.getWins());


		/* TODO: 02C */
		//Print out all available information for the Cubs
		System.out.println(cubs);
		System.out.println(cubs.getName());
		System.out.println(cubs.getLocation());
		System.out.println(cubs.getLosses());
		System.out.println(cubs.getWins());


		/* TODO: 02D */
		//Print out all available information for the Lizards
		System.out.println(lizards);
		System.out.println(lizards.getName());
		System.out.println(lizards.getLocation());
		System.out.println(lizards.getLosses());
		System.out.println(lizards.getWins());

	}

}
