import java.util.Scanner;
public class Switch
{	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int roll;
		System.out.print("Enter Roll Number : ");
		roll = scan.nextInt();
		switch(roll)
		{
			case 101 :
				System.out.print("Student name : Raj");
				break;
			case 102:
				System.out.print("Student name : Ramesh");
				break;
			case 103:
				System.out.print("Student name : Raja");
				break;
			default:
				System.out.print("Student name not Found!!");
		}
	}
}