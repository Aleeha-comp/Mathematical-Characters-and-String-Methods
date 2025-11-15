import java.util.Scanner;

public class Lab7Task7{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Input: ");
	String string = input.nextLine();
	
	int firstIndex = string.indexOf('f');
	int lastIndex = string.lastIndexOf('f');
	
	if (firstIndex != -1){
	  if (firstIndex == lastIndex){
	  System.out.print("Correct Answer: ");
	  System.out.println(firstIndex);
	  }
	  else{
	  System.out.print("Correct Answer: ");
	  System.out.println(firstIndex + " " + lastIndex);
	  }
	}

	input.close();
	}
}