import java.util.Scanner;

public class Lab7Task2a{
	public static char displayCharacter(int asciiCode){
	char character = (char)(asciiCode);
	return character;
}

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an ASCII code: ");
	int asciiCode = input.nextInt();

	if (asciiCode >= 0 && asciiCode <= 127){
	  char ch = displayCharacter(asciiCode);
	  System.out.println("The character for ASCII code " + asciiCode + " is " + ch);
	}

	else{
	  System.out.println("Invalid ASCII code.");
	}
	
	input.close();
	}
}
	