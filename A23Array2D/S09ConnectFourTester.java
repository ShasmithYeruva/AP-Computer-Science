import java.util.Scanner;

/* TODO: 08
Assignment is 30%
In this exercise, we are going to complete the Tic Tac Toe game. In the 
S08TicTacToeTester class, use the methods that you created in the 
S08TicTacToe class to implement your own version of Tic Tac Toe.

Your game should take user input to determine which index the user would 
like to place their X�s and O�s, and check to see if there is a winner 
after every turn that is taken. If the user inputs an invalid space, they 
should be notified, and asked to input another index. Utilize loops to 
implement this effectively!

Your game should indicate which player won, and notify the users if there 
is a tie at the end.

Take advantage of all the methods that you created in the previous exercise, 
and feel free to make alterations to the game to make it your own!
 */

public class S08ConnectFourTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		S08ConnectFour g = new S08ConnectFour();
		while (true) {
			String player = "";
			if (g.getTurn() % 2 == 0) {
				player = "X";
			}
			else {
				player = "O";
			}
			g.printb();
			System.out.println("Player " + player + " pick a column (0 - 6)");
			int x = input.nextInt();
			while (true) {
				if (g.pickLocation(x)) {
					g.takeTurn(x);
					break;
				}
				else {
					System.out.println("Invalid input, try again (0 - 6)");
					x = input.nextInt();
				}
			}
			if (g.checkWin()) {
				g.printb();
				g.printWinner();
				break;
			}
		}
	}
}

