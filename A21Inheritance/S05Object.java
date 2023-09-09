public class S05Object {
	public boolean equals(Object object) {
		method01++;
		return super.equals(object);
	}
	public String toString() {
		method02++;
		return super.toString();
	}
	public static int method01 = 0;
	public static int method02 = 0;
}
