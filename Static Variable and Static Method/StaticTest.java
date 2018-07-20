public class StaticTest
{
	static int c;
	static void count()
	{
		System.out.print("Number of object is "+StaticTest.c);
	}
	StaticTest()
	{
		StaticTest.c++;
	}
}