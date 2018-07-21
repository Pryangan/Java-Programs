interface Sport
{
	public abstract void sportMark(int a);
}
interface ClassTest
{
    abstract public void testMark(int a,int b); 
}
class Person
{
	int age;
	String name;
	void getPerson(int a,String s)
	{
		age =a;
		name =s;
	}
}
class Student extends Person implements Sport,ClassTest
{
	int roll;
	String clg;
	int sport,mark1,mark2;
	void getStudent(int r,String c)
	{
		roll = r;
		clg = c;
	}
	public void sportMark(int s)
	{
		sport = s;
	}
	public void testMark(int m1,int m2)
	{
		mark1 = m1;
		mark2 = m2;
	}
	int total()
	{
		return mark1+mark2+sport;
	}
	void details()
	{
		System.out.println("Student name : "+name);
		System.out.println("Student age : "+age);
		System.out.println("Student mark 1 : "+mark1);
		System.out.println("Student mark 2 : "+mark2);
		System.out.println("Student Sport Mark : "+sport);
		System.out.println("Student Total marks : "+total());
	}
}
public class MultipleInheritance
{
	public static void main(String args[])
	{
		Student o = new Student();
		o.getPerson(23,"Raaj");
		o.getStudent(101,"BCIIT");
		o.sportMark(34);
		o.testMark(46,98);
		o.details();
	}
}