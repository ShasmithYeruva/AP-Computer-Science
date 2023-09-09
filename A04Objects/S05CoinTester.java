/* TODO: 05
The Coins class was created to hold all your loose change, kind of like a 
piggy bank! For this exercise, you are going to simulate starting a bank 
with a specific number of coins, then adding to your piggy bank to bring 
your total to $2.12.

What you need to do:
Create a Coins object that initially has 4 quarters, 3 dimes, 2 nickels, 
and 1 penny.

After you create the initial object, print out the total, then add coins 
to your bank until you have a total of 15 coins totaling 2.12.

You will need to figure out which combination gets you to the correct 
total with the correct number of coins!

When you are finished, call the method to print the bank count then the 
bank total to verify that you got the correct values.

Hint: Print out your value after you create your bank and before you add 
anything. You should have 1.41. Remember that Java rounds a little, so 
your value may vary slightly (but less than a penny).
 */
public class S05CoinTester {

	public static void main(String[] args) {
		// Create your program here
		S05Coins piggyBank = new S05Coins(4,3,2,1);
		piggyBank.addQuarter();
		piggyBank.addQuarter();
		piggyBank.addDime();
		piggyBank.addDime();
		piggyBank.addPenny();
		piggyBank.bankCount();
		piggyBank.bankValue();

	}

}
