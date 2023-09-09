import java.util.ArrayList;

public class S03RoadTrip
{
	ArrayList<S03GeoLocation> locations = new ArrayList<S03GeoLocation>();
	// Create a GeoLocation and add it to the road trip
	public void addStop(String name, double latitude, double longitude) {
		S03GeoLocation x = new S03GeoLocation(name,latitude, longitude);
		locations.add(x);
	}

	// Get the total number of stops in the trip
	public int getNumberOfStops() {
		return locations.size();
	}

	// Get the total miles of the trip
	public double getTripLength() {
		double total = 0;
		for (int i = 0; i < locations.size() - 1; i++) {
			total += locations.get(i).distanceFrom(locations.get(i + 1));
		}
		return total;
	}

	// Return a formatted toString of the trip
	public String toString() {
		String x = "";
		for (int i = 0; i < locations.size(); i ++) {
			x += (i + 1)+". "+locations.get(i).toString() + "\n";
		}
		return x;
	}
}