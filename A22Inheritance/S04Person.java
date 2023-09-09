
public class S04Person {
	private String name;
	private String birthday;

	public S04Person (String name, String birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getName() {
		return name;
	}

	/* TODO 04C:
	 * Create a equals method here
	 */
	public boolean equals(S04Person other) {
		return getBirthday().equals(other.getBirthday()) && 
				getName().equals(other.getName());
	}
}
