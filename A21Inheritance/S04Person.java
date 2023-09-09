public class S04Person {
	private String name;
	private String birthday;

	public S04Person (String name, String birthday)
	{
		this.name = name;
		this.birthday = birthday;
	}

	public String getName()
	{
		return name;
	}

	public String getBirthday()
	{
		return birthday;
	}

	public String toString()
	{
		return "Name: " + name + "\nBirthday: " + birthday;
	}

}
