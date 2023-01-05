package javaInterviewQue;

public class PalindromString {

	public static void main(String[] args) {
		
		String a="MADAM";
		String b="";
		String v=a;
		for(int i=a.length()-1;i>=0;i--)
		{
		 b=b+a.charAt(i);
			
		}
		if(v.equals(b))
		{
			System.out.print("String is palindrom string");
		}
		else
		{
			System.out.print("String is NOT palindrom string");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
