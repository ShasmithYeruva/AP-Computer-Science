/* TODO: 03
n this exercise, you will create a full 8x8 chess board.

First, initialize an 8x8 2D String array. Then, populate the first and 
last array in the 2D array with the correct chess pieces. The rest of 
the arrays should be filled with Strings with the value "-".

When printed using the provided method, the result should look like:

Rook  Knight  Bishop  Queen  King  Bishop  Knight  Rook  
Pawn   Pawn    Pawn   Pawn   Pawn  Pawn    Pawn    Pawn 
  -      -      -      -      -      -      -      -    
  -      -      -      -      -      -      -      -    
  -      -      -      -      -      -      -      -    
  -      -      -      -      -      -      -      -    
Pawn   Pawn    Pawn   Pawn   Pawn  Pawn    Pawn    Pawn  
Rook  Knight  Bishop  Queen  King  Bishop  Knight  Rook  
 */
public class S03ChessBoard
{
	public static void main(String[] args)
	{
		//Create an 8x8 2D String array called chess.
		String[][] chess = new String [8][8];
		String[] pawnRow = {"Pawn","Pawn","Pawn","Pawn","Pawn","Pawn","Pawn","Pawn"};
		String[] powerPeicesRow = {"Rook","Knight","Bishop","Queen","King","Bishop","Knight","Rook"};
		String[] emptyRow = {"-","-","-","-","-","-","-","-"};
		chess[0] = powerPeicesRow;
		chess[1] = pawnRow;
		for(int i = 2; i < 6; i++) {
			chess[i] = emptyRow;
		}
		chess[6] = pawnRow;
		chess[7] = powerPeicesRow;
		//Use this method to print the chess board onto the console
		// UNCOMMENT AND FINISH CODE
		print(chess);


	}

	//Do not make alterations to this method!
	public static void print(String[][] array)
	{
		for(String[] row: array)
		{
			for(String thing: row)
			{
				System.out.print(thing + "\t");
			}
			System.out.println();
		}
	}
}
