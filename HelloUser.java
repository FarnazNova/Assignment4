import java.util.Scanner;
public class HelloUser {

	public static void main(String[] args) {
		// a program that prompt the user to enter their full name -print out: "Hello Mr./Mrs. <last/family name>"

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your fullname: ");
		
		String userInput = scan.nextLine();
				
		String lastname = "";
		
		lastname = userInput.substring(userInput.lastIndexOf(' ')+1);
		
		System.out.println("Hello Mr./Ms. " + lastname);
		
	}

}
