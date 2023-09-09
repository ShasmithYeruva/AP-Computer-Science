// TODO: 06 
/*
You are a scientist collecting data on the mars surface in an area called 
the Valles Marineris.
You measure the length to be 4805 kilometers.
Use your computational skills to calculate the results also in miles.
You measure the longest width at 202 miles
Use your computational skills to calculate the results also in kilometers.
You measure the temperature on the north side at 11 degrees fahrenheit.
Use your computational skills to calculate the results also in degrees celsius.
You measure the temperature on the south side at -101 degrees celsius.
Use your computational skills to calculate the results also in degrees fahrenheit.

Use the following formulas for your calculation.
kilometers = 1.609344 * miles
celsius = 5/9 * (fahrenheit - 32)

Your output should look something like the following.  Please note the at the 
colon ": " is essential since it is being used as a delimiter for the results.
The ordering of the messages is also critical.  The XXXX are your computations.

Valles Marineris Length (miles): XXXX 
Valles Marineris Length (kilometers): 4805.0
Valles Marineris Width (miles): 202.0 
Valles Marineris Width (kilometers): XXXX
Valles Marineris Temperature North (fahrenhiet): 11.0
Valles Marineris Temperature North (celsius): XXXX
Valles Marineris Temperature South (fahrenhiet): XXXX
Valles Marineris Temperature South (celsius): -101.0

Represent all values, including the given ones in the form of descriptive 
variables. Points will be deducted for magic numbers.
 *
 *
 */
public class S06MarsData {

	public static void main(String[] args) {
		// Your code goes here.
		double kiloMiles = 1.60934;
		double x = 0;
		x = 4805;
		System.out.println("valles Marineris Length (miles): " + x / kiloMiles);
		System.out.println("Valles Marineris Length (kilometers): " + x);
		x = 202;
		System.out.println("Valles Marineris Width (miles): " + x);
		System.out.println("Valles Marineris Width (kilometers): "+ x * kiloMiles);
		x = 11;
		double celsius = 5.0/9.0 * (x - 32.0);
		System.out.println("Valles Marineris Temperature North (fahrenheit): " + x);
		System.out.println("Valles Marineris Temperature North (celsius): " + celsius);
		x = -101;
		double fahrenheit = (x * 9.0/5.0) + 32.0;
		System.out.println("Valles Marineris Temperature South (fahrenheit): " + fahrenheit);
		System.out.println("Valles Marineris Temperature South (celsius): " + x);


	}

}
