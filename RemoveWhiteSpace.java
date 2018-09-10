import java.io.*;
class test
{
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	String str;String str1="";
	String[] words;
	public test()
	{
		try{
			str = buf.readLine();
			words = str.split(" ");
			for(String s : words)
			{
				str1 = str1+s;
			}
			System.out.print(str1);
			}
			catch(IOException e)
			{
				System.out.println("Please Enter Right Value!");
			}
	}
}

public class RemoveWhiteSpace
{
	public static void main(String[] args)
	{
		test ob = new test();
	}
}