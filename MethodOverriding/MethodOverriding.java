class A
{
	int a;
	void getA(int a)
	{
		this.a = a;
	}
	void disp()
	{
		System.out.println("A is "+a);
	}
}
class B extends A
{
	int b;
	void getB(int b)
	{
		this.b = b;
	}
	void disp()
	{
		System.out.println("A is "+a);
		System.out.println("B is "+b);
	}
}
public class MethodOverriding
{
	public static void main(String args[])
	{
		B ob = new B();
		ob.getA(2);
		ob.getB(3);
		ob.disp();
	}
}