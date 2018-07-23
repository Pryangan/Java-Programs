public class Append_AND_Insert_Method
{
	public static void main(String args[])
	{
		StringBuffer str = new StringBuffer("Java ");
		System.out.println("String is "+str);
		str.append("Programming"); // StringBuffer append(String str);
		System.out.println("String after append() method is "+str);
		
		StringBuffer str1 = new StringBuffer("I Java Programming");
		System.out.println("String is "+str1);
		str1.insert(2,"like ");		// StringBuffer insert(int index,String str)
		System.out.println("String after insert() method is "+str1);
	}
}