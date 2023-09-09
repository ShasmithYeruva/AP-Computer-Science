
public class S03Routine {
	private double school;
	private double sleep;
	private double friends;
	private double hobbies;

	public double getSchool() {
		return school;
	}
	public void setSchool(double x) {
		school = x;
	}
	public double getSleep() {
		return sleep;
	}
	public void setSleep(double x) {
		sleep = x;
	}
	public double getFriends() {
		return friends;
	}
	public void setFriends(double x) {
		friends = x;
	}
	public double getHobbies() {
		return hobbies;
	}
	public void setHobbies(double x) {
		hobbies = x;
	}
	public void printTotal() {
		System.out.println("You're busy " + ((school + sleep + friends + hobbies) * 7) + " hours a week!");
	}
}
