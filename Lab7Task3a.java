import java.util.*;

public class Lab7Task3a{
	public static String displayHexValue(int number){
	String hexValue = Integer.toHexString(number).toUpperCase();
	return hexValue;
}

	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	while (true){
	System.out.print("Enter a decimal value (0 to 15): ");
	int decimalValue = input.nextInt();

	if (decimalValue >= 0 && decimalValue <= 15){
	  System.out.println("The hex value is " + displayHexValue(decimalValue));
	}

	else {
	  System.out.println(decimalValue + " is an invalid input");
	  break;
	}
}

	input.close();
	}
}
	  