import java.util.Scanner;
public class Salary
{
	public static void main(String args[])
	{
		int salary,bonus;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your salary : ");
		salary = scan.nextInt();
		if(salary>=10000)
		{
			bonus = (salary*10)/100;
			salary = salary + bonus;
		}
		System.out.print("Salary is "+salary);
	}
}