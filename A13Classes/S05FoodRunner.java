/* TODO: 05
You have been hired by your favorite restaurant to create a food nutrition 
app for their customers to use.  Before you get too far, the owner wants you 
to create a quick prototype.

Your app should output a food name and the number of calories, then ask the 
customer how many they want. You need to ask them for 3 menu items. Once they 
tell you the quantity for the three menu items, you will output the meal�s 
total calories.

Behind the scenes, you are going to create a Food class. Your Food class 
should use name and calories in the constructor (in that order!). You should 
create getters and setters for these variables. You also need a toString 
method that will be used in the line before you ask for the quantity.

In addition to the Food class, you will have a FoodRunner class where you 
will have your main method. In here, you will create your three foods and ask 
for the quantities. After that, you can use the quantities to calculate and 
output the total.

Expected output:
Hamburgers have 600 calories.
How many would you like?
2
French Fries have 350 calories.
How many would you like?
1
Coke have 200 calories.
How many would you like?
2
Your meal will have a total of 1950 calories
 */
public class S05FoodRunner {
	// Start here!
	public static void run(TScanner input)
	{
		S05Food burger = new S05Food("Hamburgers", 600);
		System.out.println(burger);
		int num1 = input.nextInt();
		S05Food fries = new S05Food("French Fries", 350);
		System.out.println(fries);
		int num2 = input.nextInt();
		S05Food coke = new S05Food("Coke", 200);
		System.out.println(coke);
		int num3 = input.nextInt();
		System.out.println("Your meal will have a total of " + 
				(burger.total(num1) + fries.total(num2) + coke.total(num3) + " calories."));
	}
	public static void main(String[] args) {
		TScanner input = new TScanner("S05FoodRunner.txt");

		int NUMBER_OF_TEST_CASES = 1;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input);
		}
	}
}
