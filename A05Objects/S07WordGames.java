
public class S07WordGames {
	private String word;

	public S07WordGames(String text)
	{
		word = text;
	}

	public String scramble()
	{
		// switch first half
		// and second half
		int half = word.length() / 2;
		return word.substring(half) + word.substring(0, half);

	}


	public String bananaSplit(int insertIdx, String insertText)
	{
		// Insert insertText at the position
		// insertIdx
		return word.substring(0, insertIdx) + insertText + 
				word.substring(insertIdx);
	}


	public String bananaSplit(String insertChar, String insertText)
	{
		// Insert insertText after the first
		// Occurrence of the insertChar
		return word.substring(0, word.indexOf(insertChar)) +
				insertText + word.substring(word.indexOf(insertChar));
	}


	public String toString()
	{
		// Games[word]
		return "[" + word + "]";
	}

}
