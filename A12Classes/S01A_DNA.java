
/* TODO: 01A
For this exercise, you are going to create 2 instance variables and the 
structure of the constructor for the DNA class.

DNA objects contain two strings, a rsid and a genotype. Create the instance 
variables with the appropriate privacy settings. Then create the structure of 
the constructor to take two parameters to match the instance variables. Make 
sure you set the privacy settings on the constructor correctly. (You do not 
need to complete the constructor). 

Note: Because there is no main method, your code will not execute (that’s ok). 
Use the autograder to verify that you have the correct code.
 */
public class S01A_DNA {
	private String rsid;
	private String genotype;
	public S01A_DNA(String rsid, String genotype) {
		this.rsid = rsid;
		this.genotype = genotype;
	}
}
