import java.util.Scanner;
/* TODO: 06
You and a friend are going out for the night. You have decided to treat your 
friend, so you�re paying for the whole night. However, since you have a 
fixed amount of money to spend on fun things, you need to track how much the 
outing will cost so you can update your budget.

Write a program to help yourself estimate what the total cost of the night 
will be. Your program will estimate the cost by taking the cost of the 
activities for one person and estimating how much it will cost for two 
people.

Here�s what you know about your activities:

Dinner - you know you typically get cheap dinners, so you expect that your 
friend�s dinner will be twice as expensive as yours

Laser Tag - since laser tag is charged per person, you and your friend will 
cost the same

Ice-cream - you like the triple scoop, but your friend likes a single scoop. 
Your friend�s ice-cream will cost 1/3 as much as yours.

Your program should ask how much YOUR dinner cost, how much laser tag costs 
per person, and how much YOUR ice-cream costs. It should then compute how 
much your friend�s costs will be based on the information above. Be sure 
your program takes the input in this exact order.

Then print how much dinner will cost (for both of you), how much laser tag 
will cost (for both of you), and how much the ice-cream will cost (for both 
of you). Then print the grand total for the evening.

Your output should look something like this:

How much does dinner usually cost? 
How much is laser tag for one person? 
How much does a triple scoop cost? 

Dinner: $37.89
Laser Tag: $35.0    
Ice-cream: $36.0
Grand Total: $108.89

Note: Instead of 
Scanner input = new Scanner(System.in);
use instead
Scanner input = TesterHelper.inputFile("S06NightOut.txt");
 */
public class S06NightOut {

	public static void main(String[] args) {
		// Start here!

		Scanner input = TesterHelper.inputFile("S06NightOut.txt");
		System.out.println("How much does dinner usually cost? ");
		double dinnerCost = input.nextDouble();


		System.out.println("How much is laser tag for one person? ");
		double laserTag = input.nextDouble();


		System.out.println("How much does a triple scoop cost? ");
		double tripleScoop = input.nextDouble();



		System.out.println("Dinner: $" + (dinnerCost + (dinnerCost * 2)));
		System.out.println("laserTag: $" + (laserTag + laserTag));
		System.out.println("tripleScoop: $" + (tripleScoop + (tripleScoop / 3)));
		System.out.println("Grand Total: $" + ((dinnerCost + (dinnerCost * 2)) + (laserTag + laserTag) + (tripleScoop + (tripleScoop / 3))));
	}

}
