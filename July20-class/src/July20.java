public class July20 {

	public static void main(String[] args) {
		
		
	System.out.println(getPower(2,3));	
	
	
	/*	
		int x=0, y=0;
		int Result = 0;
		
		x = readInput();
	
		y = readInput();
				
		Result = addNumbers(x, y);
		
		System.out.println(Result);
		System.out.println();	
		
	}

//the following is method overloading, making a method with different parameter type
	public static int addNumbers(int x, int y) {
		int Result;
		Result = x+y;
		return Result;
	}
	
	public static double addNumbers(double x, double y) {
		double Result;
		Result = x+y;
		return Result;
	}
	
	
	

public static int readInput()//a method does only one thing at a time
{
	int input = 0;
	Scanner scan1 = new Scanner(System.in);
	System.out.println("Please enter a number:");
	input = scan1.nextInt();
	scan1.nextLine();
	
	return input;
	*/
}

public static double getPower(int x, int y)

{
	double result = 1;
	
	for (int i=1; i<=3; i++)
	{
		result = result * 2;
	}
	return result;
}

}





