import java.util.Scanner;

public class Lab7Task5{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a string: ");
	String message = input.nextLine();	

	String reverse = "";
	for (int i = message.length()-1; i >= 0; i--){
	  char ch = message.charAt(i);
	  reverse = reverse + ch;
	}

	System.out.println("Reversed string: " + reverse);
	
	if (reverse.equals(message)){
	  System.out.println(message + " is a palindrome");
	}
	else{
	  System.out.println(message + " is not a palindrome");
	}
	
	input.close();
	}
}


