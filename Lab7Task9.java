import java.util.Scanner;

public class Lab7Task9 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input: ");
        String str = input.nextLine();
        
        int firstH = str.indexOf('h');
        int lastH = str.lastIndexOf('h');
        
        if (firstH != lastH) { 
            String beforeFirst = str.substring(0, firstH + 1);
            String middle = str.substring(firstH + 1, lastH).replace('h', 'H');
            String afterLast = str.substring(lastH);
            
            String result = beforeFirst + middle + afterLast;
            System.out.println("Correct Answer: " + result);
        } 
	else {
            System.out.println("Correct Answer: " + str);
        }
    }
}