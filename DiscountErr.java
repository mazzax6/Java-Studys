import java.util.Scanner;
class DiscountErr
{
	public static void main ( String[] args )
{
	int listPrice;
	int discount;
	int discountPrice;

	Scanner scan = new Scanner( System.in );

	System.err.print("Enter list price in cents: ");
	listPrice = scan.nextInt();
	System.out.println("Price in cents: " + listPrice);

	System.err.print("Enter discount in percent: ");
	discount = scan.nextInt();
	System.out.println("Discount: " + discount);

	discountPrice = listPrice - (listPrice*discount)/100 ;

	System.out.println( "Discount Price: " + discountPrice );
	System.err.println( "Discount Price: " + discountPrice );
	}
}
