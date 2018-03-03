import java.util.Scanner;

class BoxOffice
{
	public static void main (String[] args)
	{
	Scanner scan = new Scanner( System.in);
	int age;
	
	System.out.println("Enter you age:");
	age = scan.nextInt();

	if ( age < 15 )
	{
	System.out.println("Child Rate");
	}
	else
	{
	System.out.println("Adult rate");
	}
	
	System.out.println("Enjoy Pokemon the First Movie!!!");
	}
}
