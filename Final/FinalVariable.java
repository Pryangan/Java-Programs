class Test
{
	static final int COUNT;
	static
	{
		COUNT = 10;
	}
	final int ROLL;
	Test(int roll)
	{
		ROLL = roll;
		System.out.println("Final Instance variable (ROLL) is "+ROLL);
	}
	public void check(int a)
	{
		final int X;
		X = a;
		System.out.println("Final Local Variable (X) is "+X);
	}
	public void otherCheck(final int A)
	{
		System.out.println("Value is "+A);
	}
}

public class FinalVariable
{
	public static void main(String args[])
	{
		System.out.println("Static final count value is "+Test.COUNT);
		Test ob = new Test(4);
		ob.check(5);
		ob.otherCheck(6);
	}
}