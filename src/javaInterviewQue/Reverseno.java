package javaInterviewQue;

public class Reverseno {

	public static void main(String[] args) {
		
		int num=12345;
		
		//1.algorithm
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;   //12345%10=5
			num=num/10;           //12345/10=1234
			
		}
		System.out.println(rev);
		System.out.println("-------------------------");	
		
		//2.stringbuffer class
		
		int a=123456;
	
		StringBuffer sb=new StringBuffer(String.valueOf(a));
		StringBuffer c=sb.reverse();
		System.out.println(c);
		System.out.println("-------------------------");	
		
		//3.StringBuilder class
		
		int x=456789;
		StringBuilder sbl=new StringBuilder();
		
		sbl.append(x);
		
		StringBuilder z=sbl.reverse();
		System.out.println("-------------------------");	
		System.out.println(z);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
