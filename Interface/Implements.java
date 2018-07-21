interface Animal
{
	public static final int AGE =10;		// we don't need to write public static final keywords, int AGE = 10 is enough
	public abstract void eat();			// we can swap public and abstract keywords
	abstract public void move();		// In interface abstract and public keyword in mandatory
	void sleep();									// if we don't put abstract and public keyword. then by default it added
}

class Dog implements Animal
{
	String name;
	Dog(String nm)
	{
		name =nm;
	}
	void bark()
	{
		System.out.println(name+" is barking!");
	}
	public void eat()
	{
		System.out.println(name+" is eating!");
	}
	public void move()
	{
		System.out.println(name + " is moving!");
	}
	public void sleep()
	{
		System.out.println(name+" is sleeping!");
	}
	void age()
	{
		System.out.println(name + " is "+AGE+ " years old!");
	}
}

public class Implements
{
	public static void main(String args[])
	{
		Dog ob = new Dog("Ronie");
		ob.eat();
		ob.bark();
		ob.sleep();
		ob.move();
		ob.age();
	}
}