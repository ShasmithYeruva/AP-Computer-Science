/* TODO: 01
A programmer has written a method called replaceLetter that counts the 
amount of times a letter is present in a word. Your job is to modify 
this existing method to fulfill a new purpose.

Rather than count the instances of a letter in a String, write a program 
that replaces all except the first instance of one letter with another. 
You should directly modify replaceLetter to get this program to work. In 
the starter code, replaceLetter only has two parameter values. Your new 
version should have a third parameter to indicate which String value is 
replacing the existing letter.

Your output should be as follows:
Enter a word: hello 
Enter the letter to be replaced: l
Enter the new letter: y
Result: helyo 
 ********************
Enter a word: puppy
Enter the letter to be replaced: p
Enter the new letter: d
Result: puddy
 ********************
Enter a word: mississippi
Enter the letter to be replaced: s
Enter the new letter: t
Result: mistittippi
 ********************



Hint: The letters will be assigned from the user as String values. Make 
sure to use String methods to compare them!


 */
public class S01Letter {

	public static void run(TScanner input)
	{
		// Ask the user for 3 things: their word, letter they want to replace,
		// and replacing letter.
		// Start coding
		System.out.print("Enter your word: ");
		String word = input.nextLine();
		System.out.print("Enter the letter to be replaced: ");
		String letter = input.nextLine();
		System.out.print("Enter the new letter: ");
		String replace = input.nextLine();
		// Call the method replaceLetter and pass all 3 of these items to it for 
		// string processing.
		// End coding
		System.out.println("Result: "+replaceLetter(word, letter, replace));
		System.out.println("********************");

	}

	// Modify this method so that it will take a third parameter from a user --
	// the String with which they want to replace letterToReplace 
	// 
	// This method should replace all BUT the first occurence of letterToReplace
	// You may find .indexOf to be useful, though there are several ways to solve this problem.
	// This method should return the modified String.
	public static String replaceLetter(String word, String letterToReplace, String replace)
	{

		int count = 0;
		String s = "";
		for(int i = 0; i < word.length(); i++)
		{
			if(word.substring(i, i + 1).equals(letterToReplace))
			{
				if(count != 0) {
					s += replace;
					
					continue;
				}
				count++;
			}
			s += word.substring(i, i+1);
		}
		return s;
	}

	public static void main(String[] args) {
		TScanner input = new TScanner("S01LetterInput.txt");

		int NUMBER_OF_TEST_CASES = 3;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input);
		}
	}

}
