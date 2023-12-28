/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int boardLength = Integer.parseInt(args[0]);
		for (int i = 0; i < boardLength; i++) {
			if ( i % 2 == 1 ) {
				System.out.print(" ");
			}
			for (int j = 0; j < boardLength; j++) {
				if (i % 2 == 1 && j == boardLength - 1) {
					 System.out.print("*");
				 }
				 else {
					 System.out.print("* ");
				 }
			}
			// delete the space in the end when i is odd
			System.out.println();
		}
	}
}
