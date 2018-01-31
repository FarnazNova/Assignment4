import java.util.Scanner;
public class Convertor {

	public static void main(String[] args) {
		//Prompt the user to enter a number or a character & convert that number or character to Binary or Hexadecimal
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number or a character:");
		String input = keyboard.next();
		
		if((input.charAt(0) >=65 && input.charAt(0)<= 90)|| (input.charAt(0) >=97 && input.charAt(0)<= 122))
		{
			System.out.println("The letter " + input.charAt(0) + " in binary is " + Integer.toBinaryString((int)input.charAt(0)));
			System.out.println("The letter " + input.charAt(0) + " in hexadecimal is " + Integer.toHexString((int)input.charAt(0)));			
		}
		else 
		{
			System.out.println("The number " + input + " in binary is " + Integer.toBinaryString(Integer.parseInt(input)));
			System.out.println("The number " + input + " in hexadecimal is " + Integer.toHexString(Integer.parseInt(input)));					
		}

	}

}
