package javaInterviewQue;

public class ReverseString {

	public static void main(String[] args) {
		
		//1.for loop
		
		String a="ABCDE";
		String b="";
		String v="";
		for(int i=a.length()-1;i>=0;i--)
		{
		 b=b+a.charAt(i);
			
		}
           
		System.out.println(b);
		//2.using chararray
		
		a="asdf";
		char n[]=a.toCharArray();
		
		for(int j=a.length()-1;j>=0;j--)
		{
			
			v=v+n[j];
		}
		
		System.out.println(v);
		
		//3.StringBuffer class
		
		a="lkjh";
		StringBuffer abc=new StringBuffer(a);
		
		System.out.println(abc.reverse());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
