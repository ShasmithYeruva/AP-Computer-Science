/* TODO: 01
Create 3 arrays as described below:

A String array to hold the names of the following cities: Las Vegas, Minsk, 
and Sao Paulo

An int array that holds the population of each city:
-Las Vegas: 667,501
-Minsk: 2,038,822
-Sao Paulo: 12,330,000

A double array that holds the average minimum amount of sunshine the city 
gets:
-Las Vegas: 8.11 hrs/day
-Minsk: 1.36 hrs/day
-Sao Paulo: 6.05 hrs/day

Make sure you keep the array elements in the same order so that the same 
index can be used to get corresponding cities, population, and hours of 
sunshine. These are called parallel arrays.

Then print out the information for each city. Your output will look like 
the example below.

OUTPUT:
Las Vegas's population is 667501.
Minsk's population is 2038822.
Sao Paulo's population is 12330000.

The least amount of sunshine Las Vegas gets is 8.11 hours a day.
The least amount of sunshine Minsk gets is 1.36 hours a day.
The least amount of sunshine Sao Paulo gets is 6.05 hours a day.
 */
public class S01FirstArray {

	public static void main(String[] args) {
		// Create the 3 arrays here
		String[] name = {"Las Vegas", "Minsk", "Sao Paulo"};
		int[] pop = {667501, 2038822, 12330000};
		double[] sunshine = {8.11, 1.36, 6.05};
		// Print all 3 arrays according to the output in the description
		System.out.println(name[0] + " population is " + pop[0]);
		System.out.println(name[1] + " population is " + pop[1]);
		System.out.println(name[2] + " population is " + pop[2] + "\n");
		System.out.println("The least amount of sunshine " + name[0] 
				+ " gets is " +  sunshine[0] +  " hours a day.");
		System.out.println("The least amount of sunshine " + name[1] 
				+ " gets is " +  sunshine[1] +  " hours a day.");
		System.out.println("The least amount of sunshine " + name[2] 
				+ " gets is " +  sunshine[2] +  " hours a day.");
	}
}
