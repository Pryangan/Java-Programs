public class ExceptionHandling_1
{
	public static void main(String args[])
	{
		int a=20,b=10,c=10;
		try
		{
			int x = a/(b-c);
		System.out.println("X is "+x);	
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero");
		}
		int y = a/(b+c);
		System.out.println("Y is "+y);
	}
}