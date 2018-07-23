class A
{
	int a;
	void disp()
	{
		System.out.println("Class A is "+a);
	}
}
class B extends A
{
	int a;
	void get(int x,int y)
	{
		super.a = x;
		a =y;
	}
	void disp()
	{
		super.disp();
		System.out.println("Class B is "+a);
	}
}
public class SuperVariableAndMethod
{
	public static void main(String args[])
	{
		B o = new B();
		o.get(10,20);
		o.disp();
	}
}