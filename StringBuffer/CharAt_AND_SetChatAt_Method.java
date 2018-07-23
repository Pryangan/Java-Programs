public class CharAt_AND_SetChatAt_Method
{
	public static void main(String args[])
	{
		StringBuffer str =new StringBuffer("Java Programming");
		System.out.println("String is "+str);
		System.out.println("Character at index 2 is "+str.charAt(2));	// char charAt(int index)
		str.setCharAt(2,'f');	// void setCharAt(int index,char ch)
		System.out.println("Now after using setCharAt() method String is "+str);
	}
}