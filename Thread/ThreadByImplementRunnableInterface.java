class A implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Class A Thread "+i);
		}
		System.out.println("Exit from Thread A");
	}
}

class B implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Class B Thread "+i);
		}
		System.out.println("Exit from Thread B");
	}
}

public class ThreadByImplementRunnableInterface
{
	public static void main(String args[])
	{
		A obA = new A();
		B obB = new B();
		Thread t1 = new Thread(obA);
		Thread t2 = new Thread(obB);
		t1.start();
		t2.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main Class "+i);
		}
		System.out.println("Exit from Main");
	}
}