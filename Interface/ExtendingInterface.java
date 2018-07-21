interface A
{
	int A = 30; //this means public static final int A=10;
	void dispA();	//this means public abstract void disp();
}

interface B		
{
	int B =10;
	void dispB();
}

interface C extends A,B
{
	int C=20;
	void dispC();	
}

class Test implements C
{
	public void dispA()
	{
		System.out.println("Interface A and public static final value of A is "+A);
	}
	public void dispB()
	{
		System.out.println("Interface B and public static final value of B is "+B);
	}
	public void dispC()
	{
		System.out.println("Interface C and public static final value of C is "+C);
	}
}

public class ExtendingInterface
{
	public static void main(String args[])
	{
		Test ob = new Test();
		ob.dispA();
		ob.dispB();
		ob.dispC();
		System.out.println(A.A+" "+B.B+" "+C.C);
		System.out.println(Test.A+" "+Test.B+" "+Test.C);
	}
}  