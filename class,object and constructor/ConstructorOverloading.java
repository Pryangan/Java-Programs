import java.util.Scanner;
public class ConstructorOverloading
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Add ob = new Add();
		System.out.print("Enter first Number : ");
		int x = scan.nextInt();
		System.out.print("Enter second Number : ");
		int y = scan.nextInt();
		Add ob1 = new Add(x,y);
		ob.add();
		ob.disp();
		ob1.add();
		ob1.disp();
	}
}