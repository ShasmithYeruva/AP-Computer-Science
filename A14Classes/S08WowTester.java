/* TODO: 08
S08WowTester Class

This assignment challenge criteria for the WowTester.
1) An overall description on what you are attempting to accomplish
2) A description of each method stating its functional purpose.
3) The output should be message based, not just raw numbers.
4) Methods and variables are formatted with the proper lower camel case.
5) Classes are formatted with upper camel case. 
6) Code is properly indented <Ctrl><a> followed by <Ctrl><i>
7) Comments and code should not exceed 80 columns. 

Specific to this assignment:
Write a world cup soccer simulator.

S08SoccerTeam class
1) Start with a S08Soccer class that has the following private attributes:
country
blockGoalPercentage
scoreGoalPercentage

 *** The class will only use the default constructor, no toString method and ***
 *** will rely strictly on the getter and setter methods to access and       ***
 *** modify the attributes.                                                  ***

2) Create getter and setter methods strictly using the this pointer and using 
the same variable names as the class attributes.

3) Create a playMatch method that will take the parameter S08Soccer other as 
an input.
return 1 if the local object wins
return -1 if the other object wins
return 0 if it is a tie

To determine the win, lose, or draw, create the following algorithm.

local goalsScored is 
local shots on goal a randomized integer between 1 and 5 inclusive
times
other blockedGoalPercentage
times
local scoreGoalPercentage 

other goalsScore is 
other shots on goal a randomized integer between 1 and 5 inclusive
times
local blockedGoalPercentage
times
other scoreGoalPercentage 

The return value is based on a comparison of local goalsScored and
goals scored.

4) Create a shootOut method that 
will take the parameter S08Soccer other as an input and return 
true if the local object won and false otherwise.

local goalScored is
local outOfReach factor a randomized integer between 0 and 1 

other goalScored is 
other outOfReach factor a randomized integer between 0 and 1 

repeat the above until local goalScored is not equal to other goalScored

S08WowTester
5) In the S08WowTester main method create 4 different instances of 
the S08SoccerTeam and populate the attributes using the setter methods.

6) In the S08WowTester create a static method called matchUp to determine 
a winner that takes two teams as input and outputs one team winner.
	The team1 will playMatch with team2 
	If a clear winner occurs, return the winner
	If a tie occurs, execute a shootOut to return the winner

7) In the S08WowTester matchUp team1 against team4 to determine winner1.

8) In the S08WowTester matchUp team2 against team3 to determine winner2.

9) In the S08WowTester matchUp winner1 against winner2 to determine the
finalWinner.

10) In the S08WowTester print the finalWinner country, blockGoalPercentage, 
and scoreGoalPercentage.

====================================
The WowTester code is designed as a freelance learning assignment required for 
all students to experience the joy of testing.

WowTester code cannot not be embedded inside an assignment class.  

If the WOW code requires input prompts, the input prompts must come from 
either the randomizer class utility or use a text file input.

The test code must be placed in the S08WowTester.java file.  If you decide 
or are required to add unique files as part of this exercise, include those 
files in the  archive by adding a zc.addEntry("<filename.ext>"); line to the 
Tester.java main method for each new file.

 */




// This is  world cup soccer simulator for the semifinal and final games. 
// It uses the blocked goal percentages and the shots scored percentages
// in order to try to predict the winner in the whole world cup.

public class S08WowTester {

	// In this method two teams execute the playMatch method and 
	// if a clear winner occurs the method returns the winner and
	// if a tie occurs the method executes
	// the shootOut method to return the winner

	static S08Soccer matchup(S08Soccer team1, S08Soccer team2) {
		int x = team1.playMatch(team2);
		if (x == 1) {
			return team1;
		}
		else if (x == -1) {
			return team2;
		}
		else {
			if (team1.shootOut(team2)) {
				return team1;
			}
			else {
				return team2;
			}
		}
	}

	public static void main(String[] args) {

		// Initializing the Argentina team
		S08Soccer team1 = new S08Soccer();
		team1.setCountry("Argentina");
		team1.setBlockGoalPercentage(57.4);
		team1.setScoreGoalPercentage(34.7);

		// Initializing the Morocco team
		S08Soccer team2 = new S08Soccer();
		team2.setCountry("Morocco");
		team2.setBlockGoalPercentage(39.1);
		team2.setScoreGoalPercentage(23.5);

		// Initializing the France team
		S08Soccer team3 = new S08Soccer();
		team3.setCountry("France");
		team3.setBlockGoalPercentage(63.6);
		team3.setScoreGoalPercentage(41.3);

		// Initializing the Croatia team
		S08Soccer team4 = new S08Soccer();
		team4.setCountry("Croatia");
		team4.setBlockGoalPercentage(45.9);
		team4.setScoreGoalPercentage(19.8);

		// Playing out the semifinal matches
		S08Soccer winner1 = matchup(team1, team4);
		S08Soccer winner2 = matchup(team2, team3);

		// Playing out the final match
		S08Soccer finalWinner = matchup(winner1, winner2);

		// Printing out the final winner and their statistics
		System.out.println("The winner of the 2022 World Cup is " 
				+ finalWinner.getCountry() + "! \nTheir block goal"
				+ " percentage is " + finalWinner.getBlockGoalPercentage()
				+"% and their goals scored percentage is " 
				+ finalWinner.getScoreGoalPercentage() + "%.");
	}
}

