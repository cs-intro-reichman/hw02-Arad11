import java.util.Random;

/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int someNumber = -1;
		int nextNumber = (int)(Math.random() * 10);;
		while(someNumber <= nextNumber) {
			System.out.print(nextNumber + " ");
			someNumber = nextNumber;
			nextNumber = (int)(Math.random() * 10);;
		}
	}
}
