// Rental car Checker
//
import java.util.Scanner;
class RenterChecker
{
	public static void main (String[] args)
	{
	// Declare a Scanner and two integer variables
	Scanner scan = new Scanner ( System.in );
	int age, credit;

	// get the number of cups of flour
	System.out.println("What is your age?");
	age = scan.nextInt();

	// get the number of cups of sugar
	System.out.println("How much you money you have");
	credit = scan.nextInt();

	// check that there are enough of both ingredients

	if ( age >= 21 || credit >= 10000 )
		System.out.println("Lets rule the roads!!!" );
		else
		System.out.println("sorry.......you thought about a bike?");
	}
}
