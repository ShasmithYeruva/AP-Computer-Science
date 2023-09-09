public class S04Website
{
	// Put your code here
	String topLevelDomain;
	String domain;
	int numUsers;


	public S04Website() {
		topLevelDomain =  "com";
		domain = "";
		numUsers = 0;
	}
	public S04Website(String domainName, String topDomain) {
		this.domain = domainName;
		this.topLevelDomain = topDomain;
		numUsers = 0;
	}

	public S04Website(String domainName, String topDomain, int numPeople) {
		this.domain = domainName;
		this.topLevelDomain = topDomain;
		this.numUsers = numPeople;
	}

	// String representation for printing
	// Do not modify this method except to remove the comments
	public String toString()
	{
		String res =  "https://www." +  domain +  "." + topLevelDomain ;
		res += " has "  + numUsers + " users";

		return res;
	}
}