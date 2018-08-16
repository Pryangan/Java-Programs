import java.io.*;
class Person
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int age;
	public void setAge() throws NumberFormatException,IOException
	{
		System.out.println("Enter Age : ");
		age = Integer.parseInt(br.readLine());
	}
	public int getAge()
	{
		return age;
	}
}

public class HandleException
{
	public static void main(String args[]) throws IOException
	{
		Person a = new Person();
		try
		{
			a.setAge();
		}
		catch(NumberFormatException e)
		{
			System.out.println("You Entered Invalid Age");
		}
		System.out.println(a.getAge());
	}
}