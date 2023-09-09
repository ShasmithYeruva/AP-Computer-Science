/* TODO: 08
Note: 30% assignment, no Tester check

Consider this implementation of the class S08Card, that stores information 
related to a cards monetary value, name, condition, and number in a set of 
collectible card.

A subsequent class S08CardCollection has been created with the instance 
variable ArrayList<S08Card> collection that stores a collection of cards. When 
instantiated, the S08CardCollection class takes an ArrayList<S08Card> as a 
parameter, and copies that ArrayList to the Collection instance variable.  
In this question, you will write three methods in the CardCollection class.

Write a public non static method getTotalValue() which returns the total value 
of all cards in a card collection.

Write a public non static method checkPerfect() that prints the name of the 
Cards in a collection that are in "perfect" condition.

Write a method orderNumerically() that reorders the ArrayList collection in 
numerical order by set number.

Write test code in main method to ensure your methods are coded properly. In
the test code after running oderNumerically(), again execute the checkPerfect()
method to ensure that the collection array list was indeed ordered numerically.

 *** Remember to stay within the constraints of the Java reference sheet ***
 */
import java.util.ArrayList;
import java.util.Random;

public class S08CardCollection {
	private ArrayList<S08Card> collection;

	private static final int TOTAL_CARDS = 105;

	public static void main(String[] args) {
		S08CardCollection cc = new S08CardCollection();
		cc.populateCardCollection();
		// Complete rest of the test code here..
		System.out.println("The total value of the cards are " 
				+ cc.getTotalValue());
		cc.checkPerfect();
		cc.orderNumerically();
		cc.checkPerfect();
	}
	public double getTotalValue() {
		double x = 0;
		for (int i = 0; i < collection.size(); i++) {
			x += collection.get(i).getValue();
		}
		return x;
	}


	public void checkPerfect() {
		System.out.println("Cards in perfect condition: ");
		for (int i = 0; i < collection.size(); i ++) {
			if (collection.get(i).getCondition().equals("perfect")) {
				System.out.println(collection.get(i).getName());
			}
		}
	}

	public void orderNumerically() {
		for (int i = 0; i < collection.size() - 1; i++) {
			int min = collection.get(i).getSetNum();
			int index = i;
			for (int j = i; j < collection.size(); j++) {
				if (min > collection.get(j).getSetNum()) {
					min = collection.get(j).getSetNum();
					index = j;
				}
			}
			S08Card temp = collection.get(i);
			collection.set(i, collection.get(index));
			collection.set(index, temp);
		}
	}



	public S08CardCollection() {
		collection = new ArrayList<S08Card>();
	}

	private void populateCardCollection() {
		// Populate card collection
		String baseName = "CARD";
		double baseValue = 10.0;
		String[] conditions = {"poor","fair","good","perfect"};
		int[] shuffledArray = computeRandomArray();
		Random r = new Random();
		for (int i = 0; i < TOTAL_CARDS; i++) {
			S08Card card = new S08Card(
					baseName+shuffledArray[i], 
					conditions[r.nextInt(conditions.length)], 
					baseValue+shuffledArray[i], 
					shuffledArray[i]);

			collection.add(card);
		}

	}

	private int[] computeRandomArray() {
		int[] cardArray = new int[TOTAL_CARDS];
		for (int i = 0; i < TOTAL_CARDS; i++) {
			cardArray[i] = i;
		}

		// Shuffle
		Random r = new Random();
		for (int i = 0; i < TOTAL_CARDS; i++) {
			int index1 = r.nextInt(TOTAL_CARDS);
			int index2 = r.nextInt(TOTAL_CARDS);
			int temp = cardArray[index1];
			cardArray[index1] = cardArray[index2];
			cardArray[index2] = temp;
		}
		return cardArray;
	}
}
