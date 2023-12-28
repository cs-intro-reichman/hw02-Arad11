
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int someOfBoys = 0;
		int someOfGirls = 0;
		String childrenOrder = "";

		if(Math.random() < 0.5) {
			someOfBoys++;
			childrenOrder += "b";
		}
		else {
			someOfGirls++;
			childrenOrder += "g";
		}

		while(someOfBoys == 0 || someOfGirls == 0) {
			if(Math.random() < 0.5) {
				someOfBoys++;
				childrenOrder += " b";
			}
			else {
				someOfGirls++;
				childrenOrder += " g";
			}
		}
		System.out.println(childrenOrder);
		System.out.println("You made it... and you now have " + (someOfBoys + someOfGirls) + " children.");
	}
}
