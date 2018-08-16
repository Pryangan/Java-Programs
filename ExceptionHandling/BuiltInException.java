public class BuiltInException
{
	public static void main(String args[])
	{
		int a = 4;
		int b = 0;
		int arr[]={1,9};
		try{
			int c = a/b;
			arr[20] = 26;
			}
			catch(ArithmeticException ae)
			{
				System.out.println(ae);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
	}
}