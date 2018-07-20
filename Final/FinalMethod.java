class A
{
	final void disp(){
		
	}
}
class B extends A
{
	void disp()		// we can't override this method because of final keyword in super class
	{
		
	}
}
public class FinalMethod
{
	B ob = new B();
}