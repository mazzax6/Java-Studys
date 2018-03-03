import java.util.Scanner;

class MyIntegerCal
{
	public static void main (String[] args)
	{
	Scanner scan = new Scanner( System.in );
	int num, num2, square;	//declare two int variables

	System.out.println("Enter an integer:");
	num = scan.nextInt();

	System.out.println("And the next the other integer:");
	num2 = scan.nextInt();

	square = num / num2 ; // compute the square

	System.out.println("Your results are " + square);
	}
}
