public class DoWhile
{
	public static void main(String args[])
	{
		int no=1;
		do
		{
			if(no%2==1)
			{
				System.out.print(no+" ");
			}
			no++;
		}while(no<=100);
	}
}