public class LabeledLoop
{
	public static void main(String args[])
	{
		loop1:
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==6)
				{
					break loop1;
				}
				if(j>i)
				{
					System.out.println();
					continue loop1;
				}
				System.out.print(" * ");
			}
		}
	}
}