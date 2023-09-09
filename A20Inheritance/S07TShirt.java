
public class S07TShirt extends S07Clothing {
	private String fabric;

	public String getFabric() {
		return fabric;
	}
	public S07TShirt(String size, String color, String fabric) {
		super(size, color);
		this.fabric = fabric;
	}
}
