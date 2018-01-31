import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		// find the square root of the number
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your number: ");
		double input = scan.nextDouble();
		// get the square root from the user input
		double squareRoot = Math.sqrt(input);
		//print the output
		System.out.println("The square root of " + input + " is " + squareRoot);
		
		
	}

}

