import java.util.Scanner;

public class DiceRolling {

	public static void main(String[] args) {
			
		Scanner scan1 = new Scanner(System.in);
		
		String choice = "yes";
		
		System.out.println("Welcome to the Grand Circus Casino!");
		
		System.out.println("Roll the dice? (yes/no):");
		choice = scan1.nextLine();
		
		
		int roll;
		
		System.out.println("Enter the number of sides:");
		roll = scan1.nextInt();
		scan1.nextLine();
		
		while (choice.equalsIgnoreCase("yes"))
		{
			System.out.println("Roll the dice? (yes/no):");
				
			System.out.println("Roll:" + roll);
			randomOneToSix(roll);
			randomOneToSix(roll);
			
			System.out.println("Roll again? (yes/no):");
			choice = scan1.nextLine();
			
		}
	scan1.close();
	}


	public static void randomOneToSix(int input) {
		// number one added to avoid zero, therefore it starts with one
		double x = 1 + Math.random() * input;
		// (long) to cast the variable x a double type to the long type
		long result = (long) x;
		System.out.println(result);
	}
}
