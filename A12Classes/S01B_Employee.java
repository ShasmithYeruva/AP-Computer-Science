/* TODO: 01B
In this exercise, you are going to create the instance variables for an 
Employee class. The class needs to store the employee’s first name, 
last name, monthly salary, and the number of hours in their shift. 
You will need to give each instance variable an appropriate name, type, 
and privacy setting.

After defining the instance variables, create the structure for the 
constructor, similar to the previous exercise. Make sure you set the 
privacy settings on the constructor correctly.

Note: The order of the attributes in the constructor is critical for 
full credit.

Note: Because there is no main method, your code will not execute 
(that’s ok). Use the autograder to verify that you have the correct code.


 */
public class S01B_Employee {
	private String fName;
	private String lName;
	private double salery;
	private int hours;
	public S01B_Employee(String fName, String lName, double salery, int hours) {
		this.fName = fName;
		this.lName = lName;
		this.salery = salery;
		this.hours = hours;
	}
}
