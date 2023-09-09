public class S08RayMostFreq
{
	/* This method go will return the value 
	 * that appears the most in the array and
	 * if several numbers all appear
	 * the same number of times
	 * return the first high frequent number found
	 */
	public static int go(int[] ray)
	{
		int total = 0;
		int most = 0;
		for (int i = 0; i < ray.length; i++) {
			int count = 0;
			for (int j = 0; j < ray.length; j++) {
				if (ray[i] == ray[j])
					count++;
			}

			if (count > total) {
				total = count;
				most = ray[i];
			}
		}

		return most;
	}
}
