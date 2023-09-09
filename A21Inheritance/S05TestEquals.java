/* TODO 05A
For this exercise, you are given 3 Object class objects and 
3 Ball class objects. In theory, all three Objects are the 
same and all 3 Ball objects are the same, but based on the 
way they are created and the way that Java evaluates 
equality, not all three objects will be equal.

Your task is to start by printing out the 6 Object and Ball 
objects. Remember, the Object class has a toString and since 
a Ball object extends the Object class, we should see 
similarities between the Object and Ball class.

After printing them out, you should notice which objects are 
the same. Write two true and two false statements for each 
group, one using == and one using .equals. 
Will these be the same?
 */
public class S05TestEquals {

	public static void main(String[] args) {
		System.out.println("** Object **");
		/* Note for academic purposes, S05Object is identical 
		 * to Object. */
		S05Object first = new S05Object();
		S05Object second = first;
		S05Object third = new S05Object();

		/* TODO: 05B */
		// Print out all three objects
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);

		/* TODO: 05C */
		// Print a true statement using 2 objects and ==
		System.out.println(first == second);

		/* TODO: 05D */
		// Print a false statement using 2 objects and ==
		System.out.println(first == third);

		/* TODO: 05E */
		// Print a true statement using 2 objects and .equals()
		System.out.println(first.equals(second));

		/* TODO: 05F */
		// Print a false statement using 2 objects and .equals()
		System.out.println(first.equals(third));

		System.out.println("** Ball **");


		S05Ball golfball = new S05Ball(1.5);
		S05Ball minigolf = golfball;
		S05Ball largeGolf = new S05Ball(1.5);

		/* TODO: 05G */
		// Print out all three objects
		System.out.println(golfball);
		System.out.println(minigolf);
		System.out.println(largeGolf);

		/* TODO: 05H */
		// Print a true statement using 2 objects and ==
		System.out.println(golfball == minigolf);

		/* TODO: 05I */
		// Print a false statement using 2 objects and ==
		System.out.println(golfball == largeGolf);

		/* TODO: 05J */
		// Print a true statement using 2 objects and .equals()
		System.out.println(golfball.equals(minigolf));

		/* TODO: 05K */
		// Print a false statement using 2 objects and .equals()
		System.out.println(golfball.equals(largeGolf));

	}

}
