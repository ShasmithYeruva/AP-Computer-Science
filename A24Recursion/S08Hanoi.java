/* 
 * The following assignment implements the towers of hanoi problem
 * Move a stack of unequal size disks on rod A to rod C, largest on 
 * the bottom and smallest on the top, from one stack to another 
 * without ever stacking a larger disk on top of a smaller one.
 * The middle rod B is used as go between to allow as a placeholder 
 * to store disks.
 */
import java.util.Stack;

public class S08Hanoi {

	private static Stack<Integer> rodA = new Stack<Integer>();
	private static Stack<Integer> rodB = new Stack<Integer>();
	private static Stack<Integer> rodC = new Stack<Integer>();
	public static void main(String[] args) {

		// Populates Rod A
		int size = 4;
		for (int i = size; i >= 1; i--) {
			rodA.push(i);
		}

		// Prints results
		printIt();

		// TODO 1: Make call to hanoi with arguments size, 'A', 'B', 'C
		hanoi(size, 'A', 'B', 'C');
	}

	private static void moveDisk(char rodFrom, char rodTo) {
		if ((rodFrom == 'A') && (rodTo == 'B')) 
			rodB.push(rodA.pop());
		else if ((rodFrom == 'A') && (rodTo == 'C'))
			rodC.push(rodA.pop());
		else if ((rodFrom == 'B') && (rodTo == 'A'))
			rodA.push(rodB.pop());
		else if ((rodFrom == 'B') && (rodTo == 'C'))
			rodC.push(rodB.pop());
		else if ((rodFrom == 'C') && (rodTo == 'A'))
			rodA.push(rodC.pop());
		else
			rodB.push(rodC.pop());
		printIt();
	}

	private static void printIt() {
		// TODO 2: Print the three towers on the screen
		System.out.println(rodA);
		System.out.println(rodB);
		System.out.println(rodC);
	}

	private static void hanoi(int n, char rodFrom, char rodMiddle, char rodTo) {

		// TODO 3: Implement Part 1
		// Begin with exit condition, when n equals 1, a disk moves rodFrom to
		// toRod resulting in the final stacked rod
		if (n == 1) {
			moveDisk(rodFrom, rodTo);
			return;
		}

		// TODO 4: Implement Part 2
		// The next block in the program is recursive method with arguments
		// (1) decrements n (as in n-1) and arguments (2) and (3) that 
		// switches rodMiddle with rodTo
		hanoi(n - 1, rodFrom, rodTo, rodMiddle);
		// TODO 5: Implement Part 3
		// After returning from the recursive call (part 2), move disk rodFrom 
		// to rodTo
		moveDisk(rodFrom, rodTo);
		// TODO 6: Implement Part 4
		// After returning from Part 3 make another recursive call with arguments
		// n - 1, rodMiddle, rodFrom, rodTo
		hanoi(n -1,rodMiddle, rodFrom, rodTo);
	}
}