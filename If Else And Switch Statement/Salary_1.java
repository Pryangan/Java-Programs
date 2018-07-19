import java.util.Scanner;
public class Salary_1
{
	public static void main(String args[])
	{
		int salary,bonus;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Salary : ");
		salary = scan.nextInt();
		if(salary>=10000)
		{
			bonus = (salary*10)/100;
			salary = salary + bonus;
			System.out.println("Your Salary with Bonus is "+salary);
		}
		else
		{
			System.out.print("Your Salary without Bonus is "+salary);
		}
	}
}