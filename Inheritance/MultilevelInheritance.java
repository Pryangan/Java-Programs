class Student
{
	int roll;
	String name;
	void getStudentDetails(int roll,String name)
	{
		this.roll = roll;
		this.name = name;
	}
}
class Test extends Student
{
	int mark1,mark2,mark3;
	void getMarks(int m1,int m2,int m3)
	{
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
	}
}
class Result extends Test
{
	int total;
	int TotalMarks()
	{
		total = mark1 + mark2 + mark3;
		return total;
	}
	void disp()
	{
		System.out.println("Mark1 is "+mark1);
		System.out.println("Mark2 is "+mark2);
		System.out.println("Mark3 is "+mark3);
		System.out.println("Total is "+TotalMarks());
	}
}
public class MultilevelInheritance
{
	public static void main(String args[])
	{
		Result ob = new Result();
		ob.getStudentDetails(11,"Pryangan");
		ob.getMarks(45,65,78);
		ob.disp();
	}
}