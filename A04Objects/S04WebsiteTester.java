/* TODO: 04
Every webpage has an address. A web address is made up of a
couple of different pieces.

For example, consider https://codehs.com. https specifies
which protocol the webpage is using. codehs is known as the
domain, and com is called the top level domain.

We typically refer to specific website by their domain name,
such as Google or YouTube or Facebook. The top level
domain can be “com”, “gov”, “org”, “edu”, etc. It specifies what 
type of organization the website represents. For example, “edu” 
is an educational website while “gov” is a government website.


Your job is to implement a class that represents a webpage
address. It should have the following instance variables

domain (a String) representing the website’s name
topLevelDomain (a String) representing the top level domain without 
a period. 

numUsers (an int) representing the number of users the website has

The class also needs three constructors, whose signatures are
given below.

//Default constructor
public Website()

// Specify website URL
// Register a new website
public Website(String domainName, String topDomain)

// Specify website URL
// Register an old website
public Website(String domainName, String topDomain, int numPeople)

The default values should be “com” for topLevelDomain, an empty 
string (“”) for domain, and numUsers should be 0.


Test your class in WebsiteTester.

Create at least three objects - one to test each of the constructors. 
Then print them out. Your output should look something like

https://www..com has 0 users
https://www.goodSchool.edu has 0 users
https://www.codehs.com has 1000000 users
 */
public class S04WebsiteTester
{
	public static void main(String[] args)
	{
		// Start here!
		S04Website one = new S04Website();
		S04Website two = new S04Website("goodSchool", "edu");
		S04Website three = new S04Website("codehs", "com", 1000000);
		// Specify website URL
		// Register an old website
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);


	}
}