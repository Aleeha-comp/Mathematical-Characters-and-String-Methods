import java.util.Scanner;

public class Lab7Task6{
	public static void reverseString(String message){
	int spaceIndex = message.indexOf(" ");
	String firstWord = message.substring(0, spaceIndex);
	String secondWord = message.substring(spaceIndex + 1);	System.out.println(secondWord + " " + firstWord);
}

	public static void main(String[] args){
	Scanner input = new Scanner (System.in);
	System.out.print("Input: ");
	String message = input.nextLine();
	reverseString(message);

	input.close();
	}
}
	
	