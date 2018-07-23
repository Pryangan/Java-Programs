class A
{
	int a;
	A(int x)
	{
		a = x;
	}
}
class B extends A
{
	int b;
	B(int x,int y)
	{
		super(x);	
		b =y;
	}
	void disp()
	{
		System.out.println("A is "+a);
		System.out.println("B is "+b);
	}
}

public class SuperConstructor
{
	public static void main(String args[])
	{
		B ob = new B(2,3);
		ob.disp();
	}
}