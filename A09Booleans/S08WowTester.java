import java.util.Scanner;
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
8) 
Develop a method public String decode(String key, String code), 
that will decode a "secret message" given the key.  

The message has been encoded in the following manner: each integer in 
code represents an index pointing to a location in the key String.  
Example, given key = "hello world" and code = "6 4 0 5 3 7 2":
Should return: "woh lol"

To decode the message, simply output the character in key at the 
corresponding index.  

Try this input:
decode("six perfect quality black jewels amazed the governor", 
   "35 10 10 33 9 24 3 17 41 8 3 20 51 16 38 44 47 32 33 10 19 38 35 28 49")

You must use a Scanner object to parse the String (rather than split() 
and Integer.parseInt()).  

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




	/* This class decodes a message and returns a 
	 *  string from a "key" String and a "code" String
	 */
public class S08WowTester 
{
/* The method below takes a key and ints in 
 * the code to use as a index finder which is then outputed
 *  in order to crack the code
 */
	public String decode(String key, String code)
	{
		int index;
		String x = "";
		Scanner object = new Scanner(code);
		while (object.hasNext()) {
			index = object.nextInt();
			x = x + key.charAt(index);
		}
		
		object.close();
		return x;
	}
	
	public static void main(String[] args) 
	{
		// This creates a new S08WowTester object
		S08WowTester y = new S08WowTester();
		// This line prints out the y object
		System.out.println(y.decode("six perfect quality black "
				+ "jewels amazed the governor", 
				"35 10 10 33 9 24 3 17 41 8 3 20 51 16 "
						+ "38 44 47 32 33 10 19 38 35 28 49"));
	}

}
