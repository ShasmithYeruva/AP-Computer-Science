import java.util.Scanner;

/* TODO: 06
In this exercise, you are going to make a sample bot conversation. At this 
point, we don't have too much that we can do, but you are going to ask the 
user for their name and then use that in the constructor for the bot.

Note: The input is from the file S06BotTesterInput.txt

After that, you are going to simulate a conversation. You will print 
questions to the console and answer them by calling methods from the Bot 
class. (You don't actually prompt the user for any information other then 
their name).

When you are finished, your output should match the output below (with the 
exception of your name).

Make sure you call the following methods at least once, with goodbye() as
your last command.

greeting()
help()
weather()
feetInMile()
goodbye()


Sample Output:

Hello. What is your name?
Kiara
Hello Kiara! My name is Hal!
How are you today!
You can ask me about the weather,
or how many feet are in a mile.
I can even convert feet to meters!
What's the weather like?
Its always warm and dry inside your computer!
How many feet in a mile?
There are 5280 feet in a mile.
It was nice talking with you!

Have a great day!

 */
public class S06BotTester {

	public static void main(String[] args) {
		// Create and assign a Scanner object
		Scanner input = TesterHelper.inputFile("S06BotTesterInput.txt");
		//Put your code here
		S06Bot bot = new S06Bot(input.nextLine());
		bot.greeting();
		bot.help();
		bot.weather();
		bot.feetInMile();
		bot.goodbye();
	}

}
