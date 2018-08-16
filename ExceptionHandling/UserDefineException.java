class MyException extends Exception
{
	int detail;
	MyException(int x)
	{
		detail = x;
	}
	public String toString()
	{
		return "MyException["+detail+"]";
	}
}

public class UserDefineException
{
	public static void conduct(int x) throws MyException
	{
		System.out.println("conduct["+x+"]");
		if(x>10)
		{
			throw new MyException(x);
		}
		System.out.println("Normal");
	}
	
	public static void main1(String args[])
	{
		try{
			conduct(1);
			conduct(20);
			}
			catch(MyException e)
			{
				System.out.println("Error: "+e);
			}
	}
}