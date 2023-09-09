import java.util.ArrayList;
public class S06Billboard {
	private ArrayList<S06Musician> top10 = new ArrayList<S06Musician>();






	//Don't make alterations to this method!
	public void printTop10()
	{
		System.out.println(top10);
	}






	public void add(S06Musician musician) {
		if (top10.size() < 10 && musician.getIsPlatinum()) {
			top10.add(musician);
		}
		else if (musician.getIsPlatinum()) {
			int min = top10.get(0).getWeeksInTop40();
			int index = 0;
			for (int i = 1; i < top10.size(); i++) {
				if (top10.get(i).getWeeksInTop40() < min) {
					min = top10.get(i).getWeeksInTop40();
					index = i;
				}
			}
			if (musician.getWeeksInTop40() > min) {
				System.out.println("The musician "
						+ top10.get(index).getName()
						+ " has been replaced by " 
						+ musician.getName() + ".");
				top10.set(index, musician);
			}
			else {
				System.out.println("Sorry, " + musician.getName() 
				+ " has less weeks in the "
				+ "Top 40 than the other musicians.");
			}
		}
		else {
			System.out.println("Sorry, " + musician.getName() 
			+ " does not qualify for Top 10");
		}

	}

}
