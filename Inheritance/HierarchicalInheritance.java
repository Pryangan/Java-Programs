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
		System.out.println("Student Name is "+name);
		System.out.println("Student Roll is "+roll);
		System.out.println("Student Age is "+age);
		System.out.println("Student College is "+clg);
	}
}

class Employee extends Person
{
	int empId;
	String Company;
	void getEmployeeDetails(int empId,String Company)
	{
		this.empId = empId;
		this.Company = Company;
	}
	void disp()
	{
		System.out.println("Employee Name is "+name);
		System.out.println("Employee Id is "+empId);
		System.out.println("Employee Age is "+age);
		System.out.println("Employee Company is "+Company);
	}
}
public class HierarchicalInheritance
{
	public static void main(String args[])
	{
		Student st = new Student();
		st.getPersonDetails(24,"Pran");
		st.getStudentDetails(101,"BCIIT");
		st.disp();
		
		Employee emp = new Employee();
		emp.getPersonDetails(27,"Pryangan");
		emp.getEmployeeDetails(0120,"Raaj");
		emp.disp();
	}
}