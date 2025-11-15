import java.util.*;

public class Lab7Task3b{
	public static String displayBinaryNumber(char hexDigit){
	  int decimal = Character.digit(hexDigit, 16);
	  if (decimal == -1){
	    return null;
	  }

	  return String.format("%4s", Integer.toBinaryString(decimal).replace(' ', '0'));
}

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	while (true){
	  System.out.print("Enter a hex digit: ");
	  String hexDigit = input.next().toUpperCase().trim();
	  
	  if (hexDigit.length() == 1 && "0123456789ABCDEF".contains(hexDigit)){
	    String binary = displayBinaryNumber(hexDigit.charAt(0));
	    System.out.println("The binary value is " + binary);
	  }
	
	  else{
	    System.out.println(hexDigit + " is an invalid input");
	    break;
	  }
	}
	
	input.close();
	}
}
	  
	