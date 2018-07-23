public class StringBuffer1
{
	public static void main(String args[])
	{
		StringBuffer str = new StringBuffer();	// String is immutable but StringBuffer is mutable so we can edit string by using String/Buffer
		System.out.println("str : "+str);		// output will be nothing
		System.out.println("Length of str is "+str.length());	// length of str will be 0
		System.out.println("Capacity of str is "+str.capacity());	// capacity of str will be 16
		
		StringBuffer str1 = new StringBuffer(10);		// now its capacity is 10 not 16
		System.out.println("str1 : "+str1);		// output will be nothing
		System.out.println("Length of str1 is "+str.length());	// length will be 0
		System.out.println("Capacity of st1 is "+str.capacity());	// capacity will be 10
		
		StringBuffer str2 = new StringBuffer("Java");
		System.out.println("str2 : "+str2);		// output will be Java
		System.out.println("Length of str2 is "+str2.length());		// Length will be 4
		System.out.println("Capacity of str2 is "+str2.capacity());	// Capacity will be 4 + 16 = 20
	}
}