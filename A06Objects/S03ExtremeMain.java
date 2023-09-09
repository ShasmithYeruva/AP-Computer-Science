/* TODO: 03
The Extremes class represents the range of Integer values.

Fill in the Extremes methods. In the constructor, set min and max to the 
minimum and maximum value of Integer. Use Integer.MIN_VALUE and 
Integer.MAX_VALUE. Also fill in the minQuotient and maxQuotient methods to 
return the quotient of the min/max value of Integer and the user’s guess.

Recall from math, the result of a division is the quotient (c in the formula 
below).

a / b = c
This means that

a = b * c
This will help you figure out what to print in main!

Main
In main, use the comments as a guide to ask the user to guess the maximum and 
minimum values. Compute the quotient of the values and the guess, then print 
out what the user would have to multiply their number by to get the actual 
min/max value.

Be aware that if you choose a number too big or too small, it will cause an 
error since the number cannot be stored.

The results in main should look something like this:

What do you think the maximum integer value is? 
999999
You'd need to multiply your number by 2147 to reach the max value!
What do you think the minimum integer value is? 
-5647382
You'd need to multiply your number by 392 to reach the min value!
 */
public class S03ExtremeMain
{
	public static void main(String[] args)
	{
		// Scanner object
		TScanner input = TScanner.inputFile("S03ExtremeMain.txt");


		// Create an Extremes object

		S03Extremes x = new S03Extremes();
		// Ask the user to guess the maximum value of an Integer
		System.out.println("Guess the maximum value of an Integer");
		int userInput = input.nextInt();
		// Compute and display what they'd need to multiply by
		// to reach the maximum number
		System.out.println("You'd need to multiply your number by " + x.maxQuotient((userInput)) + " to reach the max value!");
		System.out.println("Guess the minimum value of an Integer");
		userInput = input.nextInt();
		// Ask the user to guess the minimum value of an Integer
		System.out.println("You'd need to multiply your number by " + x.minQuotient((userInput)) + " to reach the min value!");

		// Compute and display what they'd need to multiply by
		// to reach the minimum number


	}
}
