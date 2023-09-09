/* TODO: 06
S06Racecar
Most of the S06Racecar class has been completed for you, but you will need to 
complete the computeAcceleration method and the computeTime method.

computeAcceleration - Uses Math.random to randomly choose the car�s 
acceleration. The acceleration should be greater than one. You can use a 
combination of Math.random and Math.round, or use the equation given in 
the slides. To make the minimum value 1 using the equation, just add 1 
to the final answer.

computeTime � takes one parameter, a double, which is the length of the 
course. Returns how long it will take the racecar to complete the course in 
seconds, rounded to two decimal places. See the explanation below for 
instructions on how to compute the time.

Main Method
In main, you should create two S06Racecar objects to represent two cars on the 
race track. Compute how long each car takes to complete the race. Print out 
each car�s time. There are comments in main to help you with the algorithm.

For the Racecar objects, make up a driver�s name for each car. 

Computing the finishing time
From physics, the kinematic equations tell us that

d = v0 * t + 0.5*a*t2

where d is distance in meters, v0 is the starting velocity in m/s, t is the 
time in seconds, and a is acceleration in m/s2.

Since the car starts from rest, v0 = 0. This means that

t = sqrt(2*d/a)

The value of t will generally be a number with a long decimal value. Make 
sure to use Math.round to round the value of t to the second decimal place.

Example Output
First car finished in 262.62 seconds
Second car finished in 120.96 seconds
 */
public class S06RaceMain
{
	public static void main(String[] args)
	{
		// Length of the course in meters
		double distance = 2414; // ~ 1.5 miles

		// Create two S06Racecar objects        
		S06Racecar one = new S06Racecar("Harshboss");
		S06Racecar two = new S06Racecar("Noah");
		// Compute a random acceleration for each car using the 
		// computeAcceleration method of the S06Racecar.		
		one.computeAcceleration();
		two.computeAcceleration();
		// Output the acceleration of each car to ensure that it is in 
		// between 1.0 and 1.99 inclusive.
		// Compute the finishing times for both cars		
		// Print times of each car
		System.out.print(one + "'s");
		System.out.print(" acceleration was " + one.getAcceleration());
		System.out.println(" and they took " + one.computeTime(distance)
		+ " to finish.");



		System.out.print(two + "'s");
		System.out.print(" acceleration was " + two.getAcceleration());
		System.out.println(" and they took " + two.computeTime(distance)
		+ " to finish.");

	}
}
