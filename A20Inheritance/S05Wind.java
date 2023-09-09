
public class S05Wind extends S05Instrument {
	private boolean usesReed;
	public S05Wind(String name, String family, boolean b) {
		super(name, family);
		usesReed = b;
	}
	public boolean getUsesReed() {
		return usesReed;
	}
	public void setUsesReed(boolean usesreed) {
		this.usesReed = usesreed;
	}

}
