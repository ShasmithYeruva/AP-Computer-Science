/* TODO: 07A
The S07Rater class represents a rating system for a company. 
The company is rated on a scale of 1 - 5.

The toString representation changes based on how well rated the company is. 
Suppose we have a company called �Tina�s Tires�.

If its rating is less than two, toString would return 
�Not Recommended Company Tina�s Tires�

If its rating is over 3.5, toString would return 
�Gold Star Company Tina�s Tires�

Otherwise, toString would return 
�Well Rated Company Tina�s Tires�

Remember, once a return statement is executed, the rest of the method is 
skipped. Therefore, if you return a String in an if statement, the remaining 
if statements will not be tested.

The other method you need to fill in is setRating. The rating should only 
be changed if the new rating is 5 or less.

After you fill in Rating, main should produce the following output. Use 
"S07RatingInput.txt" to develop the test cases with the company name and
rating as input. Note that sufficient test cases must be defined in order 
to test all of your code. The xxxx and yyyy are inputs from your test code.
<a|b|c> represents one of three options a, b, or c depending on the rating.

What is the company name?
xxxx

What is the rating?
yyyy

<Well Rated Company |Gold Star Company |Not Recommended Company >xxxx
 */
public class S07Rating {
	public static void run(TScanner input, S07Rater rater) {
		// Insert code here..
		System.out.println("What is the company name?");
		String name = input.nextLine();
		System.out.println("What is the rating?");
		double rating = input.nextDouble();
		if(input.hasNextLine()) {
			input.nextLine();
		}

		S07Rater company = new S07Rater();
		company.setCompany(name);
		company.setRating(rating);
		System.out.println(company);
	}

	public static void main(String[] args) {

		TScanner input = new TScanner("S07RatingInput.txt");
		S07Rater rater = new S07Rater();

		/* TODO: 07B Modify the number of test cases to match your input */
		int NUMBER_OF_TEST_CASES = 4;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input,rater);
		}
	}
}
