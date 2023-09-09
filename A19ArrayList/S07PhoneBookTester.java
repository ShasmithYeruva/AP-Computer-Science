/* TODO: 07
When you add a contact to your phone, it automatically sorts those names 
alphabetically. In this exercise, we are going to create a phonebook that 
automatically sorts everytime a new contact is added to the phonebook.

A Contact class has been created already that has the instance variables 
name, method, and handle. Since different people prefer to be contacted in 
different ways, method specifies where to reach them (phone, text, social 
media, etc) and handle gives the contact information for that method (phone 
number, username, etc).

Your job is to create the Phonebook class that will store an ArrayList of 
Contact objects.

The Phonebook class does not have a constructor - it only contains an 
ArrayList that can store the contacts that are added to it.

There should be three methods in the Phonebook class:

addContact- This method takes a Contact and adds it to the list of contacts. 
Once the contact has been added, the sort method is called to sort that new 
contact into the phone book.

sort- This method sorts the contact list by name in alphabetical order A-Z.
a. Remember that in order to compare Strings, we can use the compareTo() 
method. This returns an integer that indicates whether a String�s characters 
are higher or lower in order than the other String. If the value is -, then 
it means the String is alphabetically higher. For example "S".compareTo("T") 
will return -1, indicating that S is 1 spot higher than T. Use this to help 
sort your phonebook.
b. If the phonebook sorts after each add, then the list will be sorted 
completely except for new entry - which sorting method should you use?

printPhonebook - This prints each name in the phonebook to the console. Use 
this to help you debug your program!
 */
public class S07PhoneBookTester {
	public static void main(String[] args)
	{
		S07PhoneBook test = new S07PhoneBook();
		test.addContact(new S07Contact("Sherry", "Facebook", "sherrygold"));
		test.addContact(new S07Contact("Dylan", "Snap", "@d_oaktree"));
		test.addContact(new S07Contact("Kevin", "phone", "12312312"));
		test.addContact(new S07Contact("Bob", "phone", "12312312"));
		test.addContact(new S07Contact("Alex", "Tweeeter", "@alexxx"));
		test.printPhonebook();
	}

}
