//(c) A+ Computer Science
//www.apluscompsci.com

//Player class 


public class S08Player {
	private String name;
	private String choice;

	public S08Player(String nm)
	{
		name = nm;
	} 	

	public S08Player(String nm, String ch)
	{
		name = nm;
		choice = ch;
	} 

	public void setName( String nm)
	{
		name = nm;
	}	

	public void setChoice( String ch )
	{		
		choice = ch;
	}	

	public String getChoice()
	{
		return choice;
	}	

	public String getName()
	{
		return name;
	}

	public String toString()
	{
		return name + " " + choice;
	}

}
