import java.io.*;
public class ReciPrime
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		char ch;
		int num = 0;
		boolean flag = false;
		
		// Check Correct Input Value Or Not
		do
		{
			ch = 'N';
			System.out.print("Enter a Number for check it is Voodoo Prime Number or Not : ");
			try{
				 num = Integer.parseInt(buf.readLine());
				}
			catch(NumberFormatException e)
			{
				System.out.println("You Entered Wrong Value!!!\nDo you want to Enter the value Again?(Y/N) : ");
				String val = buf.readLine();
				ch = val.charAt(0);
			}
		}while(ch=='Y' || ch=='y');
		
		// Check Prime Number Or Not
		for(int i = 2;i<=num/2;i++)
		{
			if(num % 2 == 0)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(num+" is not Prime Number, so it is also not Voodoo Prime.");
		}
		else
		{
		
		// Check Voodoo Prime Or Not
			double x = 1/(double)num;
			String s = String.valueOf(x);
			String str="";
			for(int i = 0;i<s.length();i++)
			{
				if(s.charAt(i)!='.')
				{
					str = str + String.valueOf(s.charAt(i));
				}
			}
			if(str.contains(String.valueOf(num)))
			{
				System.out.println(num+" is a Voodoo Prime!!");
			}
			else
			{
				System.out.println(num+" is a Prime Number But Not Voodoo Number!!");
			}
		}	
	}
}