
public class S08PlayerRunner {
	public static void main(String[] args)
	{
		S08Player s = new S08Player("Michael Jackson", "rock");

		System.out.println(s.getChoice());			//outs rock
		System.out.println(s.getName()); //call the getName() method 					//outs Michael Jackson
		System.out.println(s);								//outs Michael Jackson rock

		s.setChoice("paper"); //set the choice to paper
		System.out.println(s);								//outs Michael Jackson paper	

		//instantiate a new Player named jb named Jim Bob that chose scissors
		S08Player jb = new S08Player("Jim Bob", "scissors");
		//print out Jim Bob	
		System.out.println(jb);
	}

}
