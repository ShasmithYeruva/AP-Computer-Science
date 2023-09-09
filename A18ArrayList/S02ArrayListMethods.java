import java.util.ArrayList;

public class S02ArrayListMethods {

	public static void print(ArrayList<Double> prices) {
		for (double x: prices) {
			System.out.println(x);
		}

	}

	public static void condense(ArrayList<Double> prices) {
		for (int i = 0; i < prices.size(); i ++) {
			double x = prices.get(i) * (prices.get(i + 1));
			prices.set(i, x);
			prices.remove(i + 1);
		}

	}

	public static void duplicate(ArrayList<Double> prices) {
		int x = prices.size();
		for (int i = 0; i < x; i++) {
			prices.add(prices.get(i));
		}

	}

}
