//Example of a limit while loop
public class LimitLoop
{
	public static void main (String[] args )
	{
	
	int count = 0;
	int limit = 5;
	
	while ( count < limit )
	{
	System.out.println( "count is:" + count );
	
	// add one to count
	count = count + 1;
	}
	System.out.println( "Done with the loop" );
	}
}
