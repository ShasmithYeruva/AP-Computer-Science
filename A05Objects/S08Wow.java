
public class S08Wow {
	//Initializing the variables
	String word = "";

	public S08Wow(String word) {
		this.word = word;
	}
	// This for loop finds out what the reverse of the word/sentence
	// is and then returns it
	public String findReverseWord() {
		String reverseWord = "";
		for (int i = (word.length() - 1); i >= 0; i--) {
			reverseWord += word.charAt(i);
		}
		return reverseWord;
	}

	/* This if statement finds out if the original statement/word is the
	 * same as the reversed version and the prints out a phrase telling
	 *  the user if the word/statement is a palindrome or not.
	 */
	public String isPaladrome() {
		if (word.toLowerCase().equals(findReverseWord().toLowerCase())) {
			return (word + " is a Palindrome.");
		}
		else {
			return (word + " is not a Palindrome.");
		}
	}
}


