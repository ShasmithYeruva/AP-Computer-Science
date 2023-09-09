/* TODO: 03
Write a program that takes a String containing a text using the method 
signature

String useProperGrammar(String text)
Your method should replace the word �2� with �to� and return the updated 
text. Also, in this method, output the number of grammar errors fixed as 
noted below.

Your output should look like the following.
Enter your text: can you go 2 the store?
Grammar errors fixed: 1
Corrected text: can you go to the store?
 ************************************
Enter your text: back 2 back 2 back
Grammar errors fixed: 2
Corrected text: back to back to back
 ************************************
Enter your text: 2 be or not 2 be
Grammar errors fixed: 2
Corrected text: to be or not to be
 ************************************


 */
public class S03Grammar {
	public static void run(TScanner input)
	{
		// Ask the user to enter a sentence that uses the word 2 instead of to.
		System.out.print("Enter your text: ");
		String text = input.nextLine();
		;        // Call the method useProperGrammar to process the string according to 
		// the directions.
		// Start code here
		System.out.println("Corrected text: " + useProperGrammar(text));
		// End code here
		System.out.println("************************************");

	}

	public static String useProperGrammar(String theText)
	{
		int count = 0;
		// Process the sentence that is sent to this method and replace every 2
		// with the word to.
		// Start code here
		for (int i = 0; i < theText.length(); i++) {
			if (((theText.substring(i, i + 1)).equals("2"))) {
				count ++;

			}

		}

		theText = theText.replace("2", "to");

		System.out.println("Grammar errors fixed: " + count);
		return theText;
	}
	public static void main(String[] args) {
		TScanner input = new TScanner("S03GrammarInput.txt");

		int NUMBER_OF_TEST_CASES = 3;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input);
		}
	}

}
