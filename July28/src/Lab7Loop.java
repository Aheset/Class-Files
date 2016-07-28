
import java.util.*;

public class Lab7Loop {
	
	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		String choice = "yes";
		System.out.println("Welcome to our Java class.  Which student would you like to learn more about?");
		int userInput = scan1.nextInt();
		scan1.nextLine();	
		
		while (choice.equalsIgnoreCase("yes"))
		{
			//System.out.println("the first loop works");
			
			String [][] student = {{"Lily", "Anna", "Kim"},{"Commerce", "Southfield", "Detroit"}, {"Steak", "Salad", "Hummus"}};
			
			System.out.println("Student " + userInput + " is " + student[0][userInput + 1] + ".  What would you like to know about " + student[0][userInput + 1] + "?" );
		    System.out.println("Enter \"hometown\" or \"favorite food\":");
		
			String favFood = "favorite food";
			favFood = scan1.nextLine();
			System.out.println(student[0][userInput+1] + " is from " + student[1][userInput] + ".  Would you like to know more? Enter \"yes\" or \"no\":");
			
			
			while (favFood.equalsIgnoreCase("favorite food"))
			{
				System.out.println("the inside loop works");
				System.out.print("2nd loop, Continue? (yes/no): ");
				choice = scan1.nextLine();
			}
			
			System.out.print("Continue? (yes/no): ");
			choice = scan1.nextLine();

			
			//System.out.println("Bye from the inside loop");
		}
		System.out.println("Bye from loop 1");
	}

}

/*
String choice = "yes";
while (choice.equalsIgnoreCase("yes")) {
	// get input from the user, process it, and display output here

	// see if the user wants to continue
	System.out.print("Continue? (yes/no): ");
	choice = scan1.nextLine();
	System.out.println();
}
*/