/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int sum = 0;
		String divisors = " = ";
		int number = Integer.parseInt(args[0]);
		for(int i = 1; i < number; i++) {
			if ((number % i) == 0 ) {
				 sum += i;
				 divisors += i + " + ";
			}
		}

		if (sum == number) {
			 divisors = divisors.substring(0,divisors.length() - 2);
			 System.out.println(number + " is a perfect number since " + number + divisors);
		}
		else {
			System.out.println(number + " is not a perfect number");
		}
	}
}
