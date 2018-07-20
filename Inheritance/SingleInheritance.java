class Person
{
	int age;
	String name;
	void getPersonDetails(int age,String name)
	{
		this.age = age;
		this.name = name;
	}
} 
class Student extends Person
{
	int roll;
	String clg;
	void getStudentDetails(int roll,String clg)
	{
		this.roll = roll;
		this.clg = clg;
	}
	void disp()
	{
		System.out.println("Roll no : "+roll);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("College : "+clg);
	}
} 
public class SingleInheritance
{
	public static void main(String args[])
	{
		Student ob = new Student();
		ob.getPersonDetails(24,"Pran");
		ob.getStudentDetails(101,"BCIIT");
		ob.disp();
	}
}