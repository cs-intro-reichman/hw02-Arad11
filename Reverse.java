/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args[0];
		int wordLength = word.length();
		char middleChar = (wordLength % 2 == 0 ) ? word.charAt((wordLength / 2) - 1) : word.charAt(wordLength / 2) ;
		String reversedWord = "";
		
		for(int i = wordLength -1; i >=  0; i--) {
			reversedWord += word.charAt(i);
		}

		System.out.println(reversedWord);
		System.out.println("The middle character is " + middleChar);		
	}
}
