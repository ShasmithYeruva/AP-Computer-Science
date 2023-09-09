/* TODO: 06 
 * For this exercise, you are going to design 3 classes:
 * 
 * S06Resturant - Superclass
 * S06FastFood - Subclass
 * S06HighClass - Subclass
 * You will design these classes to optimize the superclass/subclass 
 * relationship by creating instance variables and getter/setter methods.
 * 
 * Include the following instance variables:
 * 
 * String name - nameOfResturant;
 * int starRating - one to five star rating;
 * double volume - cars per day only applicable to the fast food industry.
 * 
 * You are strongly encourage to only uncomment one line at a time and test.
 * At the end the Tester class should execute without error.
 * 
 * Note: Be sure to use the set and get methods provided, those will be 
 * tested for correct implementation.

 * */

public class S06RestaurantTester {
	public static void main(String[] args)
	{

		S06Restaurant restaurant = new S06Restaurant();
		restaurant.setName("theOliveGarden");    	
		restaurant.setStarRating(4);

		S06FastFood inAndOut = new S06FastFood();
		inAndOut.setName("theInAndOut");    	
		inAndOut.setVolume(400);

		S06HighClass nyBistro = new S06HighClass();
		nyBistro.setName("theNY_Bistro");    	
		nyBistro.setStarRating(5);


		System.out.println(inAndOut.getName());
		System.out.println(inAndOut.getVolume());
		System.out.println(nyBistro.getName());
		System.out.println(nyBistro.getStarRating());
		System.out.println(restaurant.getName());
		System.out.println(restaurant.getStarRating());
	}

}
