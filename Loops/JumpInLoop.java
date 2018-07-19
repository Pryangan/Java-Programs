public class JumpInLoop
{
	public static void main(String args[])
	{
		for(int i=1;i<=10;i++)
		{
			if(i==8)
			{
				break;
			}
			if(i%2==0)
			{
				continue;
			}
			System.out.print(" "+i+" ");
		}
	}
}