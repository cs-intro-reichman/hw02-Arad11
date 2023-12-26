import java.util.Random;

/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		Random rnd = new Random();
		int someNumber = -1;
		int nextNumber = rnd.nextInt(0,10);
		while(someNumber <= nextNumber) {
			System.out.print(nextNumber + " ");
			someNumber = nextNumber;
			nextNumber = rnd.nextInt(0,10);
		}
	}
}
