public class S07PrePostCondition {

	public void printAsterisks(int k) {
		/* In this block write precondition 
		 * k needs to be less than 0
		 */
		while (k < 0) {
			System.out.print("*");
			k++;
		}
	}

	public String getChar(String str, int n) {
		/* In this block write precondition 
		 * str needs to contain and String and not be equal to null
		 * n needs to be at least 1 less than length however it 
		 * also needs to be greater than or equal to 0
		 */
		return str.substring(n, n + 1);
	}

	public int threeTimesDiff (int num1, int num2) {
		/* In this block write precondition 
		 * Num1 needs to be larger than num2
		 */
		return 3 * (num1 - num2);
	}

}
