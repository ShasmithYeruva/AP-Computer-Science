import java.util.ArrayList;

public class S07DataPurge
{

	public static String correctlyFormatted(ArrayList<String> members) {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		boolean y = true;
		for (String x: members) {
			if (!(x.substring(0, 2).contains(upper) && x.substring(2).contains(upper) && x.contains(" "))) {
				y = false;
			}
		}
		return "" + y;
	}

	public static void removeName(ArrayList<String> members, String string) {
		System.out.println("Removing " + string);
		for (int i = 0; i < members.size(); i ++) {
			if (members.get(i).equals(string)) {
				members.remove(i);
			}
		}

	}

	public static void removeDuplicates(ArrayList<String> members) {
		for (int i = 0; i < members.size(); i ++) {
			String x = members.get(i);
			for (int j = (i + 1); j < members.size(); j ++) {
				if (members.get(j).equals(x)) {
					System.out.println("Duplicate " + members.get(j) + " removed");
					members.remove(j);
				}
			}
		}

	}

}