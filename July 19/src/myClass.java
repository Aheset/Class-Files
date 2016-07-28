import java.util.Scanner;

public class myClass {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		int input;
		
		input = scan1.nextInt();
		scan1.nextLine();
		
//Switch is the exactly compare, only single value
		switch (input){
		case 1: //if you want you can do
			//case 1: case 0: it is like having or
			System.out.println("CEO");
			break;
			//if you forget a break it is going to print CEO and Manager--it is a bug, you don't want to do that.
			
		case 2:
			System.out.println("Manager");
			break;
			
		case 3:
			System.out.println("Employee");
			break;
					
		default://this is like the else case
			System.out.println("Wrong code!");
			break;
		}
		
		/*if (input <= 10000) 
		{
			System.out.println("Yay, you got an extra $1000!");
			System.out.println("Travel!");
		} 
		else 
		{
			System.out.println("You have more than ehough!");
		}
*/		
scan1.close();
	}
	
}
