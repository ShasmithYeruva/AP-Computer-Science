/* TODO: 02
Write a program with a method called passwordCheck to return if the string 
is a valid password. The method should have the signature shown in the 
starter code.

The password must be at least 8 characters long and may only consist of 
letters and digits.

In your main method, prompt the user for a password and then report back 
as to whether the password is valid. To pass the autograder, you will need 
to print the boolean return value from the passwordCheck method.

Your output should look like the following.
Enter your password: alpha Dog32
Password check: false
 *********************
Enter your password: 1alphaDog
Password check: true
 *********************
Enter your password: alpha$Dog32
Password check: false
 *********************
Enter your password: 1alpha2Dog3
Password check: true
 *********************
Enter your password: alphaDog32#
Password check: false
 *********************
Enter your password: alpha12
Password check: false
 *********************
Enter your password: alphaDog
Password check: true
 *********************
Enter your password: alphaDog32
Password check: true
 *********************



Hint: Consider creating a String that contains all the letters in the 
alphabet and a String that contains all digits. If the password has a 
character that isn�t in one of those Strings, then it�s an illegitimate 
password!


 */
public class S02Password {
	public static void run(TScanner input)
	{
		// Prompt the user to enter their password and pass their string
		// to the passwordCheck method to determine if it is valid.
		// Start coding
		System.out.print("Enter you password: ");
		String password = input.nextLine();
		System.out.println("Password check: " + passwordCheck(password));
		// End coding
		System.out.println("*********************");
	}

	public static boolean passwordCheck(String password)
	{
		// Create this method so that it checks to see that the password
		// is at least 8 characters long and only contains letters 
		// and numbers.
		// Add code here
		boolean output = true;
		String allValid = ("abcdefghijklmnopqrstuvwxyzABCDEFGHI"
				+ "JKLMNOPQRSTUVWXYZ1234567890");
		if (password.length() >= 8) {
			for (int i = 0; i < password.length(); i++) {
				if (allValid.indexOf(password.charAt(i)) == -1) {
					output = false;
					break;
				}
			}
		}
		return output;
	}
	public static void main(String[] args) {
		TScanner input = new TScanner("S02PasswordInput.txt");

		int NUMBER_OF_TEST_CASES = 8;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input);
		}
	}
}
