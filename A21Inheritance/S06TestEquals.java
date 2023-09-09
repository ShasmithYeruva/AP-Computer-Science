/* TODO 06A
n this second exercise, we are going to look at the impact of overriding 
the equals and toString methods.

Start by copying over your TestEquals class from the previous exercise. 
You will not need to make any changes to this code.

Instead, you are going to add the following methods to your Ball class:

public String toString()
public boolean equals(Ball other) 
 */

public class S06TestEquals {

	public static void main(String[] args) {
		System.out.println("** Object **");
		/* Note for academic purposes, S05Object is identical 
		 * to Object. */
		S05Object first = new S05Object();
		S05Object second = first;
		S05Object third = new S05Object();

		/* TODO: 06B */
		// Copy the code from the S05TestEquals class.

		System.out.println(first);
		System.out.println(second);
		System.out.println(third);


		System.out.println(first == second);


		System.out.println(first == third);


		System.out.println(first.equals(second));


		System.out.println(first.equals(third));

		System.out.println("** Ball **");


		S06Ball golfball = new S06Ball(1.5);
		S06Ball minigolf = golfball;
		S06Ball largeGolf = new S06Ball(1.5);


		System.out.println(golfball);
		System.out.println(minigolf);
		System.out.println(largeGolf);


		System.out.println(golfball == minigolf);


		System.out.println(golfball == largeGolf);


		System.out.println(golfball.equals(minigolf));


		System.out.println(golfball.equals(largeGolf));

	}

}
