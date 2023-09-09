/* TODO: 07
Write a class called S07Salutations that prints various greetings and salutations.

The class should have one instance variable, a String called name to represent 
the person to whom the salutations are directed.

The class should have the following methods

A constructor that takes a String to initialize name with
public void addressLetter()
public void signLetter()
public void addressMemo()
public void signMemo()


addressLetter should print “Dear name“, where name is replaced by the value of 
the instance variable name

signLetter() should print
”Sincerely,
name”
where name is replaced by the value of the instance variable name

addressMemo should print “To whom it may concern”

signMemo should print
”Best,
name
where name is replaced by the value of the instance variable name
 */

public class S07SalutationsTester {

	public static void main(String[] args) {
		// Test your class here
		S07Salutations noah = new S07Salutations("Noah");
		noah.addressLetter();
		noah.signLetter();
		noah.addressMemo();
		noah.signMemo();
	}

}
