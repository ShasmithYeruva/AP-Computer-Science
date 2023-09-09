import java.util.ArrayList;

public class S07PhoneBook
{
	private ArrayList<S07Contact> contacts = new ArrayList<S07Contact>();

	public void addContact(S07Contact contact) {
		contacts.add(contact);
		sort(contacts);

	}







	public void sort(ArrayList<S07Contact> array) {
		for (int i = 0; i < array.size() -1; i ++) {
			int min = i;
			for (int j = i; j < array.size(); j++) {
				if (array.get(j).getName().compareTo
						(array.get(min).getName()) < 0) {
					min = j;
				}
			}
			S07Contact x = array.get(i);
			array.set(i, array.get(min));
			array.set(min, x);
		}
	}














	public void printPhonebook() {
		for (int i = 0; i < contacts.size(); i ++) {
			System.out.println(contacts.get(i).getName());
		}

	}


}

