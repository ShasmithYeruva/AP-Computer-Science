public class S08ConnectFour {
	private String[][] b;
	private int turn;
	private String winner = "";
	public S08ConnectFour() {
		b = new String[6][7];
		String[] r1 = {"-","-","-","-","-","-","-"};
		b[0] = r1;
		String[] r2 = {"-","-","-","-","-","-","-"};
		b[1] = r2;
		String[] r3 = {"-","-","-","-","-","-","-"};
		b[2] = r3;
		String[] r4 = {"-","-","-","-","-","-","-"};
		b[3] = r4;
		String[] r5 = {"-","-","-","-","-","-","-"};
		b[4] = r5;
		String[] r6 = {"-","-","-","-","-","-","-"};
		b[5] = r6;
	}  
	public String getWinner() {
		return winner;
	}
	public int getTurn()
	{
		return turn;
	}
	public void printb() {
		System.out.println("  0 1 2 3 4 5 6");
		for(int i = 0; i < b.length; i++) {
			System.out.print(i);
			for (int j = 0; j < b[0].length; j++) {
				System.out.print(" " + b[i][j]);
			}
			System.out.println("");
		}
	}
	public boolean pickLocation(int c)
	{
		if(c > b[0].length || c < 0) {
			return false;
		}
		for (int i = 0;i < b.length; i++) {
			if (!(b[i][c].equals("X") || b[i][c].equals("O"))) {
				return true;
			}
		}
		return false;
	}
	public void takeTurn(int c) {
		String place;
		int row = 0;
		if (turn % 2 == 0) {
			place = "X";
		}
		else {
			place = "O";
		}
		turn++;
		for (int r = 0;r < b.length; r++) {
			if (!(b[r][c].equals("X") || b[r][c].equals("O"))) {
				row = r;
			}
		}
		b[row][c] = place;
	}
	public boolean checkRow() {
		for (int r = 0; r < b.length - 3; r++) {
			for (int c = 0; c < b[0].length; c++) {
				if (b[r][c].equals("X") && b[r + 1][c].equals("X") &&
						b[r + 2][c].equals("X") && b[r + 3][c].equals("X")) {
					winner = "X";
					return true;
				}
			}
		}
		for (int r = 0; r < b.length - 3; r++) {
			for (int c = 0; c < b[0].length; c++) {
				if (b[r][c].equals("O") && b[r + 1][c].equals("O") &&
						b[r + 1][c].equals("O")&& b[r + 3][c].equals("O")) {
					winner = "O";
					return true;
				}
			}
		}
		return false;
	}
	public boolean checkCol() {
		for (int r = 0; r < b.length; r++) {
			for (int c = 0; c < b[0].length - 3; c++) {
				if (b[r][c].equals("X") && b[r][c + 1].equals("X") &&
						b[r][c + 2].equals("X")&& b[r][c + 3].equals("X")) {
					winner = "X";
					return true;
				}
			}
		}
		for (int r = 0; r < b.length; r++) {
			for (int c = 0; c < b[0].length - 3; c++) {
				if (b[r][c].equals("O") && b[r][c + 1].equals("O") &&
						b[r][c + 2].equals("O")&& b[r][c + 3].equals("O")) {
					winner = "O";
					return true;
				}
			}
		}
		return false;
	}
	public boolean checkDiag() {
		for (int r = 0; r < b.length - 3; r++) {
			for (int c = 0; c < b[0].length - 3; c++) {
				if (b[r][c].equals("X") && b[r + 1][c + 1].equals("X") &&
						b[r + 2][c + 2].equals("X")&& b[r + 3][c + 3].equals("X")) {
					winner = "X";
					return true;
				}
			}
		}
		for (int r = 0; r < b.length - 3; r++) {
			for (int c = 0; c < b[0].length - 3; c++) {
				if (b[r][c].equals("O") && b[r + 1][c + 1].equals("O") &&
						b[r + 2][c + 2].equals("O")&& b[r + 3][c + 3].equals("O")) {
					winner = "O";
					return true;
				}
			}
		}
		for (int r = 3; r < b.length; r++) {
		    for (int c = 0; c < b[0].length - 3; c++) {
		        if (b[r][c].equals("X") && b[r - 1][c + 1].equals("X") &&
		            b[r - 2][c + 2].equals("X") && b[r - 3][c + 3].equals("X")) {
		            winner = "X";
		            return true;
		        }
		    }
		}
		for (int r = 3; r < b.length; r++) {
		    for (int c = 0; c < b[0].length - 3; c++) {
		        if (b[r][c].equals("O") && b[r - 1][c + 1].equals("O") &&
		            b[r - 2][c + 2].equals("O") && b[r - 3][c + 3].equals("O")) {
		            winner = "O";
		            return true;
		        }
		    }
		}
		return false;
	}
	public boolean checkWin() {
		if(checkRow() || checkCol() || checkDiag()) {
			return true;
		}
		return false;
	}
	public void printWinner() {
		if (checkWin()) {
			System.out.println("The winner is player " + getWinner() + "!");
		}
	}
}
