import java.util.Scanner;

public class Lab7Task10{
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
	System.out.print("Input: ");
        String message = input.nextLine();
        
        System.out.println(message.charAt(2));
        
        System.out.println(message.charAt(message.length() - 2));
        
        System.out.println(message.substring(0, 5));
        
        System.out.println(message.substring(0, message.length() - 2));
        
        for (int i = 0; i < message.length(); i += 2) {
            System.out.print(message.charAt(i));
        }
        System.out.println();
        
        for (int i = 1; i < message.length(); i += 2) {
            System.out.print(message.charAt(i));
        }
        System.out.println();
        
        for (int i = message.length() - 1; i >= 0; i--) {
            System.out.print(message.charAt(i));
        }
        System.out.println();
        
        for (int i = message.length() - 1; i >= 0; i -= 2) {
            System.out.print(message.charAt(i));
        }
        System.out.println();
        
        System.out.println(message.length());
        
        input.close();
    }
}

	