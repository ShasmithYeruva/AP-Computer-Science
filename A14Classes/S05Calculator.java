
public class S05Calculator {
	private int total;
	private int value; // Value is the number stored in memory

	public S05Calculator(int startingValue){
		total = startingValue;
		value = 0;
	}

	public int add(int value){
		// Uncomment and fix
		total = total + value;
		return total;
	}

	/**
	 * Adds the instance variable value to the total
	 */
	public int add(){
		// Uncomment and fix
		total += value;
		return total;
	}

	public int multiple(int value){
		// Uncomment and fix
		total *= value;
		return total;
	}

	public void setValue(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}

}
