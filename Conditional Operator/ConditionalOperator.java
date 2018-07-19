import java.util.Scanner;
public class ConditionalOperator
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter first Value : ");
		a = scan.nextInt();
		System.out.print("Enter second Value : ");
		b = scan.nextInt();
		c = (a>b)?a:b;
		System.out.print("Greater Value is "+c);
	}
}