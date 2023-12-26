/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int number = Integer.parseInt(args[0]);
		for(int i = 1; i <= number; i++) {
			if ((number % i) == 0 ) {
				 System.out.println(i);
			}
		}
	}
}
