
class S08GeoLocation {
	// Initializing the variables
	double latitude;
	double longitude;
	//The constructor that takes the latitude and longitude
	public S08GeoLocation(double lati, double longi) {
		latitude = lati;
		longitude = longi;
	}
	// This methods prints out a line so the data is easier to understand
	public String toString() {
		return  "latitude: " + latitude + ", longitude:" + longitude;
	}
	// This method finds out the distance between two object using 
	// latitude and longitude
	public double distanceTo(S08GeoLocation other) {
		double lat1  = Math.toRadians(latitude);       //this  object's lat
		double long1 = Math.toRadians(longitude);
		double lat2  = Math.toRadians(other.latitude); //other object's lat
		double long2 = Math.toRadians(other.longitude);

		//apply the spherical law of cosines
		double theCos = Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1)*
				Math.cos(lat2) * Math.cos(long1 - long2);

		double arcLength = Math.acos(theCos);

		return arcLength*3963.1676;//3963.1676 is ~ radius of Earth, in miles
	}
}
class S08Place{
	// Initializing the variables
	String name;
	String address;
	S08GeoLocation location;
	//The constructor that takes the name, address, latitude, and longitude
	public S08Place(String n, String a, double lati, double longi) {
		name = n;
		address = a;
		location = new S08GeoLocation(lati, longi);
	}
	// This constructor takes the name, address, and location
	public S08Place(String n, String a, S08GeoLocation loc) {
		name = n;
		address = a;
		location = loc;
	}
	// This method finds the distance from one location to another
	public double distanceTo(S08Place other) {
		return location.distanceTo(other.location);
	}
	// This methods prints out a line so the data is easier to understand
	public String toString() {
		return name + "\n" + address + "\n" + location;
	}
}