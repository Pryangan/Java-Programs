public class Delete_AND_DeleteCharAt_Method
{
	public static void main(String args[])
	{
		StringBuffer str = new StringBuffer("Java Programming");
		System.out.println("String is "+str);
		str.delete(2,6);		// StringBuffer delete(int start_Index,int end_Index)
		System.out.println("String after using delete() method is "+str);
		
		StringBuffer str1 = new StringBuffer("Java");
		System.out.println("String is "+str1);	
		str1.deleteCharAt(2);	// StringBuffer deleteCharAt(int index)
		System.out.println("String after deleteCharAt() method is "+str1);
	}
}