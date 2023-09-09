
public class S07Sweatshirt extends S07Clothing {
	private boolean hood;

	public boolean hasHood() {
		return hood;
	}
	public S07Sweatshirt(String size, String color, boolean hasHood) {
		super(size, color);
		hood = hasHood;
	}
}
