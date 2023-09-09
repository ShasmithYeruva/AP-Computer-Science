/* TODO: 08
Follow the instructions identified at the following reference.
https://drive.google.com/file/d/1VFWTMdQPhjPctBeQ2jtOMegBc2zKJ3q2/view?usp=view
 */
import java.io.File;
import java.io.IOException;

public class S08MazeRunner
{
	public static void main(String args[]) throws IOException
	{
		//TODO
		//Change to your own file path
		File file0 = new File (System.getProperty ("user.dir") + "/src/maze0.txt");
		S08Maze maze0 = new S08Maze(file0.getAbsolutePath());
		maze0.solve();
		File file1 = new File (System.getProperty ("user.dir") + "/src/maze1.txt");
		S08Maze maze1 = new S08Maze(file1.getAbsolutePath());
		maze1.solve();
		File file2 = new File (System.getProperty ("user.dir") + "/src/maze2.txt");
		S08Maze maze2 = new S08Maze(file2.getAbsolutePath());
		maze2.solve();
		File file3 = new File (System.getProperty ("user.dir") + "/src/maze3.txt");
		S08Maze maze3 = new S08Maze(file3.getAbsolutePath());
		maze3.solve();
		File file4 = new File (System.getProperty ("user.dir") + "/src/maze4.txt");
		S08Maze maze4 = new S08Maze(file4.getAbsolutePath());
		maze4.solve();
		File file5 = new File (System.getProperty ("user.dir") + "/src/maze5.txt");
		S08Maze maze5 = new S08Maze(file5.getAbsolutePath());
		maze5.solve();
	}
}

