import java.util.Scanner;
class Raintester
{
	public static void main (String[] args)
	{
	Scanner scan = new Scanner( System.in );
	String answer;

	System.out.print("Is it raining? (Y or N): ");
	answer = scan.nextLine();

	if ( answer.equals("Y") )
	System.out.println("Wipers on");
	else
	System.out.println("Wipers off");
	}
}
