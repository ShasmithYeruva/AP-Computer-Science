//(c) A+ Computer Science 
//www.apluscompsci.com

//Computer class 


public class S08Computer {
	//instance / member variables
	private String choice;

	public S08Computer()
	{
		randomSetChoice();
	}

	public String getChoice()
	{
		return "";
	}

	public void randomSetChoice()
	{
		//use Math.random()
		//use switch case
		int x = (int)((Math.random() * 3) + 1);
		switch(x) {
		case 1: 
			choice = "rock";
			break;
		case 2:
			choice = "paper";
			break;
		case 3:
			choice = "scissors";
			break;
		}
	}	

	/*
		 didIWin(Player p) will return the following values
		 	0 - both players have the same choice
		 	1 - the computer had the higher ranking choice
		 	-1 - the player had the higher ranking choice
	 */	
	public int didIWin(S08Player p)
	{
		int x = -2;
		if (p.getChoice().equals(choice)) {
			x = 0;;
		}
		else if (p.getChoice().equals("rock")&&choice.equals("scissors")
				||p.getChoice().equals("paper")&&choice.equals("rock")
				||p.getChoice().equals("scissors")&&choice.equals("paper")) {
			x = 1;
		}
		else {
			x = -1;
		}
		return x;
	}

	public String toString()
	{
		return "pooter chose " + choice;
	}		   

}
