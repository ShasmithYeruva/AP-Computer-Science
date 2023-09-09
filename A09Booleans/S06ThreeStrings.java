/* TODO: 06
To help verify the user�s identity, a program takes a password 
(set by the user) and a secret code (set by the company). You can 
see the variable storing the secret code in the program.

Write a program that asks the user for their password and the secret code.

Create a String that concatenates the user�s password with the secret code 
given in the variable companyCode.
Create another String that concatenates the user�s password with the secret 
code the user provided.

Then, print out whether the strings match.
If they do match, print �Access granted�
If they don�t match, print the result of concatenating the user�s input, 
then �is denied�.

Expected program output:
Enter your password: 
baseBall
Enter the company's secret code: 
1234
baseBall1234 is denied
Enter your password: 
footBall1298
Enter the company's secret code: 
1234
footBall12981234 is denied
Enter your password: 
soccer
Enter the company's secret code: 
1298
Access granted
Enter your password: 
hockey1298
Enter the company's secret code: 

 */

public class S06ThreeStrings {

	public static void run(TScanner input) {
		// The company's secret code
		// DO NOT change this value
		String companyCode = "1298";


		// Use comments to organize your logic before you start coding
		//getting the password
		System.out.println("Enter your password: ");
		String secretCode = input.nextLine();
		//getting the companies secret code
		System.out.println("Enter the company's secret code:  ");
		String passCode = input.nextLine();
		//Concatenating the strings
		String x = secretCode + companyCode;
		String y = secretCode + passCode;
		//Finding out if the password and company code is valid and 
		//them printing out a statement biased on that information
		if (x.equals(y)) {
			System.out.println("Access granted");
		}
		else {
			System.out.println(x + " is denied");
		}
	}

	public static void main(String[] args) {
		TScanner input = new TScanner("S06ThreeStringsInput.txt");

		int NUMBER_OF_TEST_CASES = 4;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input);
		}
	}

}
