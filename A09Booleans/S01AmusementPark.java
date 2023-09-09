/*
 TODO: 01
This program reads input from the user to determine if the user can ride 
the rollercoasters and swim in the pools at the amusement park.

The program computes 2 boolean expressions in order to determine what 
the user is allowed to do:

boolean cannotRide = !(oldEnough && tallEnough);
and

boolean cannotSwim = !(canSwim || hasLifeJacket);
Convert these two lines into their equivalent De Morgan style boolean 
expressions. Negate the AND in the first statement and negate the OR in 
the second statement using De Morgan�s Laws.

Your resulting boolean expression for cannotRide should include both 
oldEnough and tallEnough. Your resulting boolean expression for cannotSwim 
should include both canSwim and hasLifeJacket.

The resulting program should still be able to successfully determine if 
the user can ride the rides and swim in the pool. 
 */
public class S01AmusementPark {

	static int AGE_LIMIT = 12;
	static int HEIGHT_LIMIT = 48;

	public static void run(TScanner input)
	{

		System.out.println("Enter your age: "); 
		int age = input.nextInt();

		System.out.println("Enter your height in inches: ");
		int height = input.nextInt();

		boolean oldEnough = age >= AGE_LIMIT;
		boolean tallEnough = height >= HEIGHT_LIMIT;

		boolean cannotRide = !(oldEnough && tallEnough);

		// CHANGE THIS LINE
		// Convert this boolean expression into its De Morgan equivalent
		boolean cannotRideDeMorgan = !oldEnough || !tallEnough;


		if(cannotRideDeMorgan)
		{
			System.out.println("You may not ride the rollercoasters.");
		}
		else
		{
			System.out.println("You may ride the rollercoasters!");
		}

		if (cannotRide == cannotRideDeMorgan) {
			System.out.println("Correct implementation of DeMorgan");
		}

		System.out.println("Can you swim? Enter true or false.");
		boolean canSwim = input.nextBoolean();

		System.out.println("Do you have a life jacket? Enter true or false.");
		boolean hasLifeJacket = input.nextBoolean();

		boolean cannotSwim = !(canSwim || hasLifeJacket);

		// CHANGE THIS LINE
		// Convert this boolean expression into its De Morgan equivalent
		boolean cannotSwimDeMorgan = !canSwim && !hasLifeJacket;

		if(cannotSwimDeMorgan)
		{
			System.out.println("You may not swim in the pool.");
		}
		else
		{
			System.out.println("You may swim in the pool!");
		}

		if (cannotSwim == cannotSwimDeMorgan) {
			System.out.println("Correct implementation of DeMorgan");
		}

	}

	public static void main(String[] args) {
		TScanner input = new TScanner("S01AmusementParkInput.txt");

		int NUMBER_OF_TEST_CASES = 4;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input);
		}
	}

}
