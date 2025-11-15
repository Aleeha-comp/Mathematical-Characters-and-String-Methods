import java.util.*;

public class Lab7Task2b{
	public static int displayUnicode(char ch){
	int unicode = (int)(ch);
	return unicode;
}

	public static void main(String[] args){
	Scanner console = new Scanner(System.in);
	
	System.out.print("Enter a character: ");
	char ch = console.next().charAt(0);
	System.out.println("The Unicode for the character " + ch + " is " + displayUnicode(ch));
	
	console.close();
	}
} 