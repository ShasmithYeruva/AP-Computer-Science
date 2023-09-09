/* TODO: 04 
Create a TicTacToe class that initializes a 3x3 board of "-" values. We will 
use this class in future exercises to fully build out a Tic Tac Toe game!

The TicTacToe class should have a 2D array as an instance variable and a 
constructor that initializes the 2D array with the "-" value.

Add a getter method that returns the private 2D instance variable.
 */
public class S04TicTacToeTester
{
    //You don't need to alter any of the code in this class!
    //This is just to test that your TicTacToe class is working correctly
    public static void main(String[] args)
    {
        S04TicTacToe board = new S04TicTacToe();
        // UNCOMMENT AND FINISH CODING
        printBoard(board.getBoard());
    }
    
    public static void printBoard(String[][] array)
    {
        for(String[] row: array)
        {
            for(String play: row)
            {
                System.out.print(play + " ");
            }
            System.out.println();
        }
    }
}
