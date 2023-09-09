import java.util.Arrays;
public class S08TicTacToe
{
	//copy over your constructor from the Tic Tac Toe b activity in the previous lesson!
	private String[][] b;
	public S08TicTacToe() {
		b = new String[3][3];
		String[] row1 = {"-","-","-"};
		String[] row2 = {"-","-","-"};
		String[] row3 = {"-","-","-"};
		b[0] = row1;
		b[1] = row2;
		b[2] = row3;
	}   
	private int turn;
	//this method returns the current turn
	public int getTurn()
	{
		return turn;
	}
	/*This method prints out the b array on to the console
	 */
	public void printb() {
		System.out.println("  0 1 2");
		for(int i = 0; i < 3; i++) {
			System.out.println(i + " " + b[i][0] 
					+ " " + b[i][1] + " " + b[i][2]);
		}
	}
	//This method returns true if space row, col is a valid space
	public boolean pickLocation(int row, int col)
	{
		if(row > 2 || row < 0 || col > 2 || col < 0) {
			return false;
		}
		else if(!b[row][col].equals("-")) {
			return false;
		}
		return true;
	}
	//This method places an X or O at location row,col based on the int turn
	public void takeTurn(int row, int col) {
		String l;
		if (turn % 2 == 0) {
			l = "X";
		}
		else {
			l = "O";
		}
		turn++;
		b[row][col] = l;
	}
	//This method returns a boolean that returns true if a row has three X or O's in a row
	public boolean checkRow() {
		String[] x = {"X","X","X"};
		String[] o = {"O","O","O"};
		boolean row = false;
		for(int column = 0; column < 3; column++) {
			if(Arrays.equals(b[column], x) || Arrays.equals(b[column], o)) {
				row = true;
			}
		}
		return row;
	}
	//This method returns a boolean that returns true if a col has three X or O's
	public boolean checkCol() {
		String[] x = {"X","X","X"};
		String[] o = {"O","O","O"};
		boolean col = false;
		for(int i = 0; i < 3; i++) {
			String[] c = {b[0][i], b[1][i], b[2][i]};
			if(Arrays.equals(c, x) || Arrays.equals(c, o)) {
				col = true;
			}
		}
		return col;
	}
	//This method returns a boolean that returns true if either diagonal has three X or O's
	public boolean checkDiag() {
		String[] x = {"X","X","X"};
		String[] o = {"O","O","O"};
		String[] diag1 = {b[0][0], b[1][1], b[2][2]};
		String[] diag2 = {b[2][0], b[1][1], b[0][2]};
		if(Arrays.equals(diag1, x) || Arrays.equals(diag1, o) || 
				Arrays.equals(diag2, x) || Arrays.equals(diag2, o)) {
			return true;
		}
		return false;
	}
	//This method returns a boolean that checks if someone has won the game
	public boolean checkWin() {
		if(checkRow() || checkCol() || checkDiag()) {
			return true;
		}
		return false;
	}

}