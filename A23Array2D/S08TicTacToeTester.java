/* TODO: 08
Assignment is 30%
n this exercise, we are going to complete the Tic Tac Toe game. In the 
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
import java.util.Scanner;

public class S08TicTacToeTester {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		S08TicTacToe g = new S08TicTacToe();

		while(g.getTurn() < 9) {
			System.out.println("Choose a row: ");
			int row = input.nextInt();
			System.out.println("Choose a column: ");
			int col = input.nextInt();
			if(g.pickLocation(row, col)) {
				g.takeTurn(row, col);
			}
			else {
				System.out.println("invalid position");
			}
			g.printb();
			if(g.checkWin()) {
				String winner = "";
				if(g.getTurn() % 2 == 1) {
					winner = "player X";
				}
				else {
					winner = "player O";
				}
				System.out.println("The winner is " + winner);
				break;
			}
		}
		if(g.getTurn() > 8) {
			System.out.println("We have a draw");
		}
	}
}
