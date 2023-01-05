package javaInterviewQue;

public class PalindromeNo {

	public static void main(String[] args) {
		//palindrom no is no which is equal to original no when reverse
		
		int a=12421; 
		int m=a;
		
       int rev=0;
		
		while(a!=0)
		{
			rev=rev*10+a%10;   
			a=a/10;           
			
		}
		if(m==rev)
		{
			System.out.print("no is palindrom no");
		}
		else
		{
			System.out.print("no is NOT palindrom no");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
