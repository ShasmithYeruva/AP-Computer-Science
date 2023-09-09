
public class S05Strings extends S05Instrument {
	private boolean usesBow;
	public S05Strings(String name, boolean b) {
		super(name, "Strings");
		usesBow = b;
	}
	public boolean getUsesBow() {
		return usesBow;
	}
	public void setUsesBow(boolean usesBow) {
		this.usesBow = usesBow;
	}

}
