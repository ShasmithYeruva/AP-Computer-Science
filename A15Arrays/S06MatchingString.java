public class S06MatchingString {
	private static String[] arr = {"Hello", "Karel", "CodeHS!", "Karel"};

	public static int findString(String myString) {
		// your code goes here!
		int x = -1;
		for(int i = 0;i < arr.length; i++) {
			if (arr[i].equals(myString)) {
				x = i;	
			}
		}
		return x;
	}
}
