/* TODO: 08
Follow the instructions on...
https://docs.google.com/document/d/1SZVzIre0ST-XVrAK-Mc2xXVHLXgLByuP/edit?usp=share_link&ouid=105487398417538011081&rtpof=true&sd=view
 */

//(c) A+ Computer Science
//www.apluscompsci.com

//Rock / Paper / Scissors 

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings({ "serial", "unused" })
public class S08RockPaperScissorsRunner extends JFrame implements ActionListener
{
	private static final int WIDTH = 400;
	private static final int HEIGHT = 200;

	//this variable is the area to which all text is written
	private JTextArea text;

	//these are the buttons that can be clicked
	private JButton rock;
	private JButton paper;
	private JButton scissors;

	//use these variables to keep track of the players
	private S08Player player;
	private S08Computer pooter;

	//use these variables to keep track of the score
	private int playerWinCount;
	private int pooterWinCount;

	public S08RockPaperScissorsRunner()
	{
		super("RockPaperScissors Runner");

		setSize(WIDTH,HEIGHT);

		//initialize all variables - player / pooter and the counts
		player = new S08Player("dude");
		pooter = new S08Computer();

		//this is the panel to which all objects will be added
		JPanel main = new JPanel();
		//use X.AXIS or Y.AXIS
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));

		//these panels will be used to divide the screen
		JPanel top = new JPanel();
		JPanel bot = new JPanel();

		top.setLayout(new BoxLayout(top, BoxLayout.X_AXIS));

		//instantiate a new JTextArea
		text = new JTextArea();
		text.setText("WELCOME TO ROCK-PAPER-SCISSORS!!!\n\n");

		//instantiate a new JButton and refer rock to it
		rock = new JButton("Rock");
		rock.addActionListener(this);
		rock.setActionCommand("rock");

		//instantiate a new JButton and refer paper to it
		paper = new JButton("Paper");
		paper.addActionListener(this);
		paper.setActionCommand("paper");

		//instantiate a new JButton and refer scissors to it
		scissors = new JButton("Scissors");
		scissors.addActionListener(this);
		scissors.setActionCommand("scissors");

		//add all three buttons to the bottom panel
		bot.add(rock);
		bot.add(paper);
		bot.add(scissors);

		//add the text to the top panel
		top.add(text);

		//add both panels to the main panel
		main.add(top);
		main.add(bot);

		//add the main panel to the frame
		getContentPane().add(main);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e)
	{
		//instantiate a new Computer and refer pooter to it
		pooter = new S08Computer();

		//get the String value from the button pressed
		player.setChoice(e.getActionCommand());

		//set screenText to the toString() value of each player reference
		String screenText = pooter.toString() + "\n" + player.toString();

		//call the Computer's didIWin(Player p) method to find the winner
		//you must pass in the Player as a parameter to the method
		int result = pooter.didIWin(player);

		//if the result is 0 - draw
		if(result == 0)
			screenText = screenText + "\n" + "DRAW!";
		//if the result is 1 - pooter wins
		else if(result == 1) {
			screenText = screenText + "\n" + "POOTER WINS!";
			pooterWinCount++;
		}

		//if the results is -1 - player wins
		else if(result == -1) {
			screenText = screenText + "\n" + "PLAYER WINS!";
			playerWinCount++;
		}

		screenText = screenText + "\n" + "Computer has won " + pooterWinCount;
		screenText = screenText + "\n" + "Player has won " + playerWinCount;
		screenText = screenText + "\n" + "Pick Again Sucka!";

		//set the text to the screen using setText( String txt )
		text.setText(screenText);
	}

	public static void main( String args[] )
	{
		S08RockPaperScissorsRunner run = new S08RockPaperScissorsRunner();
	}
}