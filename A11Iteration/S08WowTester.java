/* TODO: 08
S08WowTester Class

This assignment challenge criteria for the WowTester.
1) An overall description on what you are attempting to accomplish
2) A description of each method stating its functional purpose.
3) The output should be message based, not just raw numbers.
4) Methods and variables are formatted with the proper lower camel case.
5) Classes are formatted with upper camel case. 
6) Code is properly indented <Ctrl><a> followed by <Ctrl><i>
7) Comments and code should not exceed 80 columns. 

Specific to this assignment:
Back to our palindrome. However, this time with an added twist. Find the
longest palidrom within a string. For this exercise, I don't mind if you 
use a google search to find an appropriate algorithm. I've done that at 
Boeing on many occassions. However, if you use a source, please site the 
source in APA or MLA format in the comments in your code.  Copied code 
without citing the source is a conduct violation.

I also encourage you to try an create this algorithm on your own.

Source:
Palindrome Examples: Fun Forward and Backward Words. 
examples.yourdictionary.com/palindrome-examples.html. 
Accessed 27 Oct. 2022.

Use the following sequences as input using the S08WowTesterInput.txt file.
baseballtacocatfootball 
sugarnolemonnomelonatall
topspotfortoday
thisisneveroddoreven

Should output
tacocat
nolemonnomelon
topspot
neveroddoreven

====================================
The WowTester code is designed as a freelance learning assignment required for 
all students to experience the joy of testing.

WowTester code cannot not be embedded inside an assignment class.  

If the WOW code requires input prompts, the input prompts must come from 
either the randomizer class utility or use a text file input.

The test code must be placed in the S08WowTester.java file.  If you decide 
to add unique files as part of this exercise, include those files in the 
archive by adding a zc.addEntry("<filename.ext>"); line to the Tester.java 
main method for each new file.

 */
public class S08WowTester 
{
	/*
	 * This code takes in a String with and then 
	 * finds the longest palindrome in the String
	 */
	/*
	 * Sources:
	 * Become a Software Engineer at a Product-Based Company, 
	 * https://workat.tech/problem-solving/approach/lp/longest-palindrome.
	 * and “Longest Palindromic Substring.” Wikipedia, Wikimedia Foundation, 12
	 *  Oct. 2022, https://en.wikipedia.org/wiki/Longest_palindromic_substring.
	 */
	static String longestPalindrome(String str) 
	{
		int length = str.length();
		int index  = -1;
		int palindromeLength = 0;
		/*
		 * the first 2 for loops are for iterating through the string and
		 * find the palindrome, then once it is done iterating it used the
		 * second while to find the longest palindrome which is what the 
		 * test cases are looking for
		 */
		for (int i = 0; i < length; i++) 
		{
			for (int j = i; j < length; j++) 
			{
				int isPalindrome = 1;
				// The last two for loop puts the characters 
				// together and returns the palindrome
				for (int k = i; k <= j; k++) 
				{
					if (str.charAt(k) != str.charAt(j - (k - i))) 
					{
						isPalindrome = 0;
					}
				}
				if (isPalindrome == 1 && j - i + 1 > palindromeLength) 
				{
					index = i;
					palindromeLength = j - i + 1;
				}
			}
		}
		String end = "";
		for (int i = index; i < index + palindromeLength; i++) 
		{
			end += str.charAt(i);
		}
		return end;
	}
	// Testing out the code using the S08WowTesterInput
	public static void main(String[] args) {
		TScanner input = new TScanner("S08WowTesterInput.txt");
		int NUMBER_OF_TEST_CASES = 4;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			System.out.println("What palendrome would you like "
					+ "to find the word's longest palendrone for? ");
			String y = input.nextLine();
			System.out.println(longestPalindrome(y));
		}
	}

}
