/* TODO: 04
For this exercise, you are going to complete the Dog class. The structure 
has been set up for you, but you will need to complete two constructors 
(overloaded).

The first will take three parameters and assign the values to the instance 
variables. The method signature should take the name, then breed, and 
finally if the dog has had all of its shots.

The second constructor will only take name then breed. For this one, you 
will assign hasShots to false.

Once complete, create and print two Dog objects in the DogTester class. The 
first should use three parameters and the second should only use two 
parameters.

Sample Output:
Name: Karel, Breed: Retriever, Up to date on shots!
Name: Clover, Breed: Corgi, Missing shots

 */
public class S04DogTester {

	public static void main(String[] args) {
		// Create 2 dog objects and then print them out
		S04Dog karel = new S04Dog("Karel", "Retriever", true);
		S04Dog clover = new S04Dog("Clover", "Corgi");

		System.out.println(karel);
		System.out.println(clover);
	}

}
