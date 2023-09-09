/* TODO: 03
The BaseballPlayer class stores the number of hits and the number of at-bats 
a player has.

You will complete this class by writing the constructor:

public BaseballPlayer()
The constructor should take three parameters to match the three instance 
variables in the class and then initialize the instance variables with these 
parameters.

The parameters should be ordered so that the name of the baseball player is 
input first, then their hits, and at bats.

In the BaseballTester class, print a call to printBattingAverage to test your 
constructor.

 */
public class S03BaseballTester {

	public static void main(String[] args) {
		S03BaseballPlayer babeRuth = new S03BaseballPlayer("Babe Ruth", 2873, 8399);
		System.out.println(babeRuth);

		// Call the function printBattingAverage here
		babeRuth.printBattingAverage();
	}

}
