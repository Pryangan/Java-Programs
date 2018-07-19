import java.util.Scanner;
public class Square
{
	public static void main(String args[])
	{
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a valuec: ");
		a = scan.nextInt();
		System.out.println("Square is "+(a*a));
	}
}