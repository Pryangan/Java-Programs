abstract class A
{
	abstract public void disp();
	public void display()
	{
		System.out.println("Class A Display");
	}
}
class B extends A
{
	public void disp()
	{
		System.out.println("Class B Disp");
	}
}
public class Abstract
{
	public static void main(String args[])
	{
		B ob = new B();
		ob.display();
		ob.disp();
	}
}