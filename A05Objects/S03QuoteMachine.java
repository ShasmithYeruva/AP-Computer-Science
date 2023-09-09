/* TODO: 03
Write a program that asks the user for a quote and the author of the quote.

Print the quote in quotation marks followed by the author on the next line. 
Use the escape character �\n� to create the newline rather than using 
separate print statements.

Sample Output
Enter a quote: 
Oh the places you'll go!
Enter the author of the quote: 
Dr. Seuss
"Oh the places you'll go!"
Dr. Seuss
 */
public class S03QuoteMachine {

	public static void main(String[] args) {
		TScanner input = TScanner.inputFile("S03QuoteMachineInput.txt");
		// Ask for a quote
		System.out.println("Enter a quote: ");
		String quote = input.nextLine();
		// Ask for the author
		System.out.println("Enter the author of the quote: ");
		String author = input.nextLine();
		// Create a new String that has the quote in quotation marks
		String quoted = ('"' + quote + '"');
		// Don't forget to escape the quotation marks
		// Print the quote, then the author on the next line 
		// But you can only use ONE print statement!
		System.out.println(quoted + "\n" + author);
	}
}
