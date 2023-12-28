/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int totalBoys = 0, totalGirls = 0;
		int boysInFamily = 0, girlsInFamily = 0;
		int twoChildren = 0, threeChildren = 0, fourOrMoreChildren = 0;
		String childrenPerFamily = "";
		double avarageChildrenPerFamily;

		for (int i = 0; i < T; i++) {	
			
			if(Math.random() < 0.5) {
				boysInFamily++;
			}
			else {
				girlsInFamily++;
			}
			
			while (totalBoys == 0 || totalGirls == 0) {
				if(Math.random() < 0.5) {
					boysInFamily++;
				}
				else {
					girlsInFamily++;
				}
			}

			totalBoys += boysInFamily;
			totalGirls += girlsInFamily;
			childrenPerFamily += (totalBoys + totalGirls);
			boysInFamily = 0;
			girlsInFamily = 0;
		}

		avarageChildrenPerFamily = (totalBoys + totalGirls) / T;
		for(int i = 0; i< childrenPerFamily.length() - 1; i++) {
			if((int)childrenPerFamily.indexOf(i) == 2) {
				twoChildren++;
			}
			else if ((int)childrenPerFamily.indexOf(i) == 3) {
				threeChildren++;
			}
			else {
				fourOrMoreChildren++;
			}
		}

		System.out.println("Average: " + avarageChildrenPerFamily + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChildren);
		System.out.println("Number of families with 2 children: " + threeChildren);
		System.out.println("Number of families with 2 children: " + fourOrMoreChildren);
		
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
