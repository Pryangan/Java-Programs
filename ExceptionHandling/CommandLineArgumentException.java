public class CommandLineArgumentException
{
	public static void main(String args[])
	{
		int valid=0,invalid=0;
		int no;
		for(int i=0;i<args.length;i++)
		{
			try{
				no = Integer.parseInt(args[i]);
				System.out.println("Valid Number "+args[i]);
				}
				catch(NumberFormatException e)
				{
					System.out.println("Invalid Number "+args[i]);
					invalid = invalid + 1;
					continue;
				}
				valid +=1;
		}
		System.out.println("\nTotal Valid number is "+valid);
		System.out.println("Total Invalid Number is "+invalid);
	}
}