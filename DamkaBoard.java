/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int boardLength = Integer.parseInt(args[0]);
		for (int i = 0; i < boardLength; i++) {
			for (int j = 0; j < boardLength; j++) {
				if ( i % 2 == 1 ) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
