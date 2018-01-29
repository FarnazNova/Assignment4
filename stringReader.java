import java.util.Scanner;
public class stringReader {

	public static void main(String[] args) {
		// A program that prompts the user to enter a string and displays its length and its first character.
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any word you like:");
		String input = scan.nextLine();
		
		int inputLength = input.length();
		char firstCh = input.charAt(0);
		
		System.out.println("The length of your string is " + inputLength + ". \nThe first character of your string is " + firstCh + ".");
		
	}

}
