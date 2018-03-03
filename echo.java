import java.util.Scanner;

class Echo
{
public static void main ( String[] args)
{
	Scanner scan = new Scanner( System.in );
	String line;

	System.out.println("Enter your input:");
	line = scan.nextLine();

	System.out.println("You typed: " + line );
	}
}
