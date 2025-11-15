import java.util.Scanner;

public class Lab7Task8{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Input: ");
	String sentence = input.nextLine();
	
	int firstIndex = sentence.indexOf('h');
	int lastIndex = sentence.lastIndexOf('h');

	if (firstIndex != -1 && lastIndex != -1 && firstIndex != lastIndex){
	  System.out.print("Correct Answer: ");
	  System.out.println(sentence.substring(0,firstIndex) + sentence.substring(lastIndex + 1));
	}
	else{
	  System.out.println("String does not contain atleast two 'h' characters.");
	}
	
	input.close();
	}
}