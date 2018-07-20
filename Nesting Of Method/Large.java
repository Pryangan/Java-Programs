public class Large
{
	int a,b;
	Large(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	int larger()
	{
		return (a>b)?a:b;
	}
	void disp()
	{
		System.out.print("Large value is "+larger());
	}
}