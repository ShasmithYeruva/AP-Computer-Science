import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class S08Maze
{
	private int[][] maze;
	private boolean exitFound = false;
	private int count = 0;
	/** Make sure to look at the format of the mazes in the maze text files */
	public S08Maze(String fileName) throws IOException
	{
		//for getting next int from the maze text file
		Scanner in = new Scanner(new File(fileName));
		int numRows = in.nextInt();
		int numCol = in.nextInt();
		maze = new int[numRows][numCol];
		for (int i = 0; i < numRows; i++) {
			for(int j = 0;j < numCol; j++) {
				maze[i][j] = in.nextInt();
			}
		}
		//TODO
	}

	/**
	 * Helper method, makes the interface a little cleaner
	 * 
	 * The user doesn't have to know the solver should start at 0, 0
	 * 
	 * Also responsible for printing the final state of the maze
	 */
	public void solve()
	{
		this.hasExitPath(0, 0);
		System.out.println(this);
	}

	public void hasExitPath(int r, int c)
	{
		solver(r,c,0);
	}
	public boolean solver(int r, int c, int count)
	{
		if (r >= 0 && r < maze.length && c >= 0 && c < maze[r].length && maze[r][c]  == 1) {
			maze[r][c] = 2;
			count++;
			if (c == maze[0].length - 1) {
				exitFound = true;
				this.count = count;
				maze[r][c] = 3;
				return exitFound;
			}
			exitFound = solver(r -1, c, count);
			exitFound = solver(r,c - 1, count);
			exitFound = solver(r + 1, c, count);
			exitFound = solver(r, c + 1, count);
			if (exitFound) {
				maze[r][c] = 3;
			}
		}
		return exitFound;
	}

	public String toString()
	{
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if (maze[i][j] == 2 || maze [i][j] == 3) {
					maze[i][j] = 1;
				}
			}
		}	
		String output = "";
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				output += maze[i][j] + " ";
			}
			output += "\n";
		}
		if (exitFound) {
			output += "exit found - " + count + " steps \n";
		}
		else {
			output += "The exit was not found \n";
		}


		//TODO

		return output;
	}
}