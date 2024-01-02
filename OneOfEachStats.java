import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		double T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		int totalBoys = 0, totalGirls = 0;
		int twoChildren = 0, threeChildren = 0, fourOrMoreChildren = 0;
		String childrenPerFamily = "";
		double avarageChildrenPerFamily;
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  

		for (int i = 0; i < T; i++) {   
			int currentBoysInFamily = 0, currentGirlsInFamily = 0;
		
			while (currentBoysInFamily == 0 || currentGirlsInFamily == 0) {
				if (generator.nextDouble() < 0.5) {
					currentBoysInFamily++;
				} else {
					currentGirlsInFamily++;
				}
			}
			totalBoys += currentBoysInFamily;
			totalGirls += currentGirlsInFamily;
			int totalKidsPerFamily = currentBoysInFamily + currentGirlsInFamily;
			childrenPerFamily += totalKidsPerFamily;
		}

		avarageChildrenPerFamily = (totalBoys + totalGirls) / (double)T;

		for (int i = 0; i < childrenPerFamily.length(); i++) {
			int children = Character.getNumericValue(childrenPerFamily.charAt(i));
			if (children == 2) {
				twoChildren++;
			} else if (children == 3) {
				threeChildren++;
			} else {
				fourOrMoreChildren++;
			}
		}
		
		System.out.println("Average: " + avarageChildrenPerFamily + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChildren);
		System.out.println("Number of families with 3 children: " + threeChildren);
		System.out.println("Number of families with 4 or more children: " + fourOrMoreChildren);
		
		if (twoChildren > threeChildren && twoChildren > fourOrMoreChildren) {
			System.out.println("The most common number of children is 2.");	
		}
		else if (threeChildren > twoChildren && threeChildren > fourOrMoreChildren) {
			System.out.println("The most common number of children is 3.");
		}
		else {
			System.out.println("The most common number of children is 4 or more.");
		}
	}    
}
