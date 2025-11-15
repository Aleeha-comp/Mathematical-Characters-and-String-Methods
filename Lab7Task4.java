import java.util.*;

public class Lab7Task4{
	public static char upperCaseLetter(int number){
	char ch = (char)(number);
	return ch;
}

	public static void main(String[] args){
	Scanner input = new Scanner (System.in);
	
	int digit;
	digit = (int)(65 + (Math.random() * 26));
	System.out.println("UpperCase Letter: " + upperCaseLetter(digit));
	input.close();
	}
}