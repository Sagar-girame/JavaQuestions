package javaInterviewQue;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		String a="Welcome to java";
		
		String b[] =a.split(" ");
		
		String rev="";
		
		for(String w:b)
		{
			String v="";
			for(int i=w.length()-1;i>=0;i--)
			{
				v=v+w.charAt(i);
			}
			
			rev=rev+v+" ";
	
		}
		System.out.println(rev);
		
		//using string builder class
		String ab="java Selenuim utils";
		String words[]=ab.split("\\s");      //split when space occurs
		
		String revs="";
		
		for(String h:words)
		{
			StringBuilder sb=new StringBuilder(h);
			sb.reverse();
			
			revs=revs+sb.toString()+" ";
		
		}
	
		System.out.println(revs);
		
		
		
		
	}

}
