
public class S05Instrument {
	private String name;
	private String family;
	public String getName() {
		return name;
	}
	public S05Instrument(String name, String family) {
		this.name = name;
		this.family = family;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String toString() {
		return name + " is a member of the " + family + " family";
	}
}
