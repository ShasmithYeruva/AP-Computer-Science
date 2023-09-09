public class S07Salutations {
	String name;

	public S07Salutations(String name) {
		this.name = name;
	}
	public void addressLetter() {
		System.out.println("Dear, " + name);
	}

	public void signLetter() {
		System.out.println("Sincerely," + "\n" + name);
	}

	public void addressMemo() {
		System.out.println("To whom it may concern");
	}

	public void signMemo() {
		System.out.println("Best, " + "\n" + name);
	}
}
