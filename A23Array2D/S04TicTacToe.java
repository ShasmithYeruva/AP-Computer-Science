public class S04TicTacToe {
	String[][] b;
	public S04TicTacToe() {
		b = new String[3][3];
		String[] r = {"-","-","-"};
		for(int i = 0; i < 3; i++) {
			b[i] = r;
		}
	}
	public String[][] getBoard() {
		return b;
	}
}
