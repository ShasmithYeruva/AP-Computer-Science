/* TODO: 04
Write a program called Teen that takes a sentence and returns a new sentence 
based on how a teenager might text the sentence. The method that creates the 
new string should be called teenTalk and should have the signature shown in 
the starter code.

The way to do that is to replace all the following punctuation symbols in the 
original sentence with �!!�. The symbols to replace are �.� and �!�.

For example, teenTalk(�That is so funny.�) would return �That is so funny!!�

Your output should look like the following.
Sonequa Martin-Green is in grade 10 and wants to send this text.
Enter a text: That is so funny.
Modified text: That is so funny!!
 ************************************************************************
Sonequa Martin-Green is in grade 10 and wants to send this text.
Enter a text: Hello World. Wouldn't it be cool to visit outer space!?
Modified text: Hello World!! Wouldn't it be cool to visit outer space!!?
 ************************************************************************
Sonequa Martin-Green is in grade 10 and wants to send this text.
Enter a text: I like coffee ice cream. Do you like Pizza?
Modified text: I like coffee ice cream!! Do you like Pizza?
 ************************************************************************
 */
public class S04TeenTester {

	public static void run(TScanner input) {
		// Create a new Teen object and print it out; see the Teen class file
		// to see how the constructor and toString method work.
		S04Teen myFriend = new S04Teen("Sonequa", "Martin-Green", 10);
		System.out.println(myFriend);
		// Start code here
		// Ask the user to input a text message
		System.out.print("Enter a text: ");
		String text = input.nextLine();

		//Call teenTalk method to translate the message to teen talk
		System.out.println("Modified text: " + myFriend.teenTalk(text));
		// End code here
		System.out.print("**************************************");
		System.out.println("**********************************");
	}
	public static void main(String[] args) {
		TScanner input = new TScanner("S04TeenTesterInput.txt");

		int NUMBER_OF_TEST_CASES = 3;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input);
		}
	}

}
