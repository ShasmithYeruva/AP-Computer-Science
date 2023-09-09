/* TODO: 07
Football Rankings
The football season is here, and the standings are out! Fortunately, the 
weekend’s games have shuffled all the teams around.

If you run the starter code now, you will get the variables in the 
original order. Your task is to switch the teams around and get them in 
the new order. You should do this by switching variable values, not just 
retyping the names.

Remember, a variable can only hold one value, so you will need to use a 
temp variable to help make the switch. For example, if we wanted to switch 
team1 and team2, we would swap values like this:

// Swapping values
team1 = "A";
team2 = "OSU";

String temp = team2; // team1 = "A", team2 = "OSU", temp = "OSU" 
team2 = team1;       // team1 = "A", team2 = "A", temp = "OSU" 
team1 = temp;        // team1 = "OSU", team2 = "A", temp = "OSU"
Original order:
1. Alabama
2. Ohio State
3. Florida State
4. USC
5. Clemson
6. Penn State
7. Oklahoma
8. Maryland
9. Wisconsin
10. Louisiana State

New Order/Sample Output:

1. Louisiana State
2. Penn State
3. Maryland
4. Alabama
5. USC
6. Clemson
7. Oklahoma
8. Wisconsin
9. Florida State
10. Ohio State
 */
public class S07TeamRanks {

	public static void main(String[] args) {
		String team1 = "Alabama";
		String team2 = "Ohio State";
		String team3 = "Florida State";
		String team4 = "USC";
		String team5 = "Clemson";
		String team6 = "Penn State";
		String team7 = "Oklahoma";
		String team8 = "Maryland";
		String team9 = "Wisconsin";
		String team10 = "Lousianna State";
		/*
		 * Don't edit above this line.
		 * Enter your code below this comment.
		 */

		String alabama = team1;
		String ohioState = team2;
		String floridaState = team3;
		String uSC = team4;
		String clemson = team5;
		String pennState = team6;
		String oklahoma = team7;
		String maryland = team8;
		String wisconsin = team9;
		String lousiannaState = team10;

		team1 = lousiannaState;
		team2 = pennState;
		team3 = maryland;
		team4 = alabama;
		team5 = uSC;
		team6 = clemson;
		team7 = oklahoma;
		team8 = wisconsin;
		team9 = floridaState;
		team10 = ohioState;


		/*
		 * Don't edit below this line.
		 * Enter your code above this comment.
		 */

		System.out.print("1. ");
		System.out.println(team1);
		System.out.print("2. ");
		System.out.println(team2);
		System.out.print("3. ");
		System.out.println(team3);
		System.out.print("4. ");
		System.out.println(team4);
		System.out.print("5. ");
		System.out.println(team5);
		System.out.print("6. ");
		System.out.println(team6);
		System.out.print("7. ");
		System.out.println(team7);
		System.out.print("8. ");
		System.out.println(team8);
		System.out.print("9. ");
		System.out.println(team9);
		System.out.print("10. ");
		System.out.println(team10);
	}

}
