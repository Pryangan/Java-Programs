import java.lang.Thread;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread A "+i);
		}
		System.out.println("Exit from Thread A");
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread B "+i);
		}
		System.out.println("Exit from Thread B");
	}
}

public class ThreadByExtendThreadClass
{
	public static void main(String args[])
	{
		A obA = new A();
		B obB = new B();
		obA.start();
		obB.start();
		System.out.println("Exit from Main");
	}
}