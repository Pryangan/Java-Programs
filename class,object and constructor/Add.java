import java.util.Scanner;
public class Add
{
	int a;
	int b;
	int c;
	Scanner scan = new Scanner(System.in);
	Add()
	{
		System.out.print("Enter Fisrt Number : ");
		a = scan.nextInt();
		System.out.print("Enter Second Number : ");
		b = scan.nextInt();
	}
	Add(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	void add()
	{
		c = a + b;
	}
	void disp()
	{
		System.out.println("First value is "+a+"\nSecond Value is "+b);
		System.out.println("Sum is "+c);
	}
}