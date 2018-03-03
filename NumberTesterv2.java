import java.util.Scanner;

class NumberTesterv2
{
	public static void main (String[] args)
	{
	Scanner scan = new Scanner( System.in);
	int num;
	
	System.out.println("Enter an integer:");
	num = scan.nextInt();

	if ( num < 0 )
	{	
	System.out.println("The number " +
		num + " is negative");
	System.out.println("The negative numbers are super negative");
	}
	else
	{
	System.out.println("The number " +
		num + " is zero or positive");
	System.out.print("The number is super positive...ooooooookkkkkk?");
	}
	System.out.println("Good-bye for now");
	}
}
