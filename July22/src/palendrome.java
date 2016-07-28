
import java.util.Scanner;

public class palendrome {

	
	    public static void main(String[] args) {
	        String str,result;
	           
	       // Creates new scanner object
	       Scanner input = new Scanner(System.in);
	       
	       // Prompt user to enter a number
	       System.out.print("Enter a word: ");
	       
	       // Wait for user to enter number        
	       str = input.nextLine();

	       // Define reversed value of user input
	       result = new StringBuffer(str).reverse().toString();
	       
	       if(result.equalsIgnoreCase(str))
	               {
	               System.out.println("This is a palindrome");
	               }    
	               else {
	               System.out.println("This is not a palindrome");
	
	
	               }
	    }
}
