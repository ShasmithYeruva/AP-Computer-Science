/* TODO: 05 
 * For this activity, you are going to refactor the S05Athlete superclass 
 * and the S05SoccerPlayer and S05Gymnast subclasses.
 * 
 * Right now, the S05Athlete class is empty and the S05SoccerPlayer and 
 * S05Gymnast classes have instance variables and getter and setter 
 * methods. Your task is to move common attributes and methods to the 
 * S05Athlete superclass and remove them from the subclasses.
 * 
 * Note: DO NOT modify the constructor in any class.
 * 
 */
public class S05AthleteTester {

	public static void main(String[] args) {

		String name = new String("Simone Biles");
		String category = new String("Gymnast");
		int allTimeRanking = 1;
		int numberOfMedals = 7;

		S05Gymnast simone = new S05Gymnast();

		simone.setName(name);
		simone.setCategory(category);
		simone.setAllTimeRanking(allTimeRanking);
		simone.setNumberOfMedals(numberOfMedals);
		System.out.println(simone.getName());
		System.out.println(simone.getCategory());
		System.out.println(simone.getAllTimeRanking());
		System.out.println(simone.getNumberOfMedals());

		S05SoccerPlayer  abby = new S05SoccerPlayer();
		name = new String("Abby Wambach");
		category = new String("Soccer");
		allTimeRanking = 1;
		int numberOfAthleteOfYear = 6;

		abby.setName(name);
		abby.setCategory(category);
		abby.setAllTimeRanking(allTimeRanking);
		abby.setNumberOfAthleteOfYear(numberOfAthleteOfYear);
		System.out.println(abby.getName());
		System.out.println(abby.getCategory());
		System.out.println(abby.getAllTimeRanking());
		System.out.println(abby.getNumberOfAthleteOfYear());
	}
}
