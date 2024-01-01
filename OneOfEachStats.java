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
		double totalBoys = 0, totalGirls = 0;
		double boysInFamily = 0, girlsInFamily = 0;
		double twoChildren = 0, threeChildren = 0, fourOrMoreChildren = 0;
		String childrenPerFamily = "";
		double avarageChildrenPerFamily;
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.

		for (int i = 0; i < T; i++) {	
			if(generator.nextDouble() < 0.5) {
				boysInFamily++;
			}
			else {
				girlsInFamily++;
			}
			
			while (boysInFamily == 0 || girlsInFamily == 0) {
				if(generator.nextDouble() < 0.5) {
					boysInFamily++;
				}
				else {
					girlsInFamily++;
				}
			}
			totalBoys += boysInFamily;
			totalGirls += girlsInFamily;

			childrenPerFamily += (boysInFamily + girlsInFamily);
			boysInFamily = 0;
			girlsInFamily = 0;
		}

		avarageChildrenPerFamily = (totalBoys + totalGirls) / T;
		for(int i = 0; i < T ; i++) {
			int children = Character.getNumericValue(childrenPerFamily.charAt(i));
			if(children == 2) {
				twoChildren++;
			}
			else if (children == 3) {
				threeChildren++;
			}
			else {
				fourOrMoreChildren++;
			}
		}

		System.out.println("Average: " + avarageChildrenPerFamily + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + (int)twoChildren);
		System.out.println("Number of families with 3 children: " + (int)threeChildren);
		System.out.println("Number of families with 4 or more children: " + (int)fourOrMoreChildren);
		
		if (twoChildren > threeChildren && twoChildren > fourOrMoreChildren) {
			System.out.println("The most common number of children is 2");	
		}
		else if (threeChildren > twoChildren && threeChildren > fourOrMoreChildren) {
			System.out.println("The most common number of children is 3");
		}
		else {
			System.out.println("The most common number of children is 4 or more.");
		}
	}    
}
