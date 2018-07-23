public class NestedTryStatement
{
	public static void main(String args[])
	{
		int a,b;
		try
		{
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			try
			{
				int no = a/b;
				System.out.println("Division is "+no);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Division by Zero");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid Number");
		}
	}
}