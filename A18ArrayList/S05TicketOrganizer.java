import java.util.ArrayList;

public class S05TicketOrganizer
{
	private ArrayList<S05AirlineTicket> tickets;
	public S05TicketOrganizer(ArrayList<S05AirlineTicket> tickets2) {
		tickets = tickets2;
	}

	public void printPassengersByBoardingGroup() {
		int max = 0;
		for (int i = 0; i < tickets.size(); i ++) {
			if (max < tickets.get(i).getBoardingGroup()) {
				max = tickets.get(i).getBoardingGroup();
			}
		}
		for (int i = 1; i <= max; i++) {
			System.out.println("Boarding Group " + i + ":");
			for (int j = 0; j < tickets.size(); j ++) {
				if (tickets.get(j).getBoardingGroup() == i) {
					System.out.println("Passenger " + (j + 1));
				}
			}
		}
	}



	public void canBoardTogether() {
		String x = "";
		for (int i = 0; i < tickets.size(); i++) {
			for (int j = (i + 1); j < tickets.size(); j ++) {
				if(tickets.get(i).getRow()==tickets.get(j).getRow()
						&& tickets.get(i).getBoardingGroup() 
						== tickets.get(j).getBoardingGroup()) {
					x = ("Passenger " + (i + 1) 
							+ " can board with Passenger " + (j + 1));
				}
			}
		}
		if (x.equals("")) {
			System.out.println("No passengers can board together");
		}
		else {
			System.out.println(x);
		}

	}
}