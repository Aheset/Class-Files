

	import java.util.Scanner;

	public class factorial {
		public static void main(String[] args) {

			Scanner scan1 = new Scanner(System.in);
			
			System.out.println("Welcome to the Factorial Calculator!");
			
			String choice = "yes";
			
			while( choice.equalsIgnoreCase("yes"))
			{
				
				System.out.println("Enter an integer that's greater than 0 but less than 10; ");

				int input = scan1.nextInt();
				scan1.nextLine();
				
				while (input < 1 || input > 9) {
					System.out.println("Invalid number!");
					 input = scan1.nextInt();
					scan1.nextLine();
				}

				System.out.print("The factorial of " + input + " is: ");
				factorial(input);	
				
				System.out.println("Continue?");
				choice= scan1.nextLine();
			
			}
		}

		public static void factorial(int input) {
			long factorial = 1;
			for (int i = 1; i <= input; i++) {
				factorial = factorial * i;
				//factorial *=i;

			}
			System.out.println(factorial);

		}
	}
	
	
	
	
	

