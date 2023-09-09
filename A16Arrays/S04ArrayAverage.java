public class S04ArrayAverage
{
	private int[] values;

	public S04ArrayAverage(int[] theValues)
	{
		values = theValues;
	}

	public double getAverage()
	{
		// your code goes here and replace return value!
		double total = 0;
		for (int i : values) {
			total += i;
		}
		return (total / values.length);
	}
}