package javaInterviewQue;

public class Swap2nos {

	public static void main(String[] args) {
		int a=10, b=20;
		//method 1-third variable
		
		int c=a;
		a=b;
		b=c;
		System.out.println(a);		
		System.out.println(b);	
		System.out.println("-------------------------");		
		//method 2-use + - operator
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);		
		System.out.println(b);	
		System.out.println("-------------------------");	
		
	//	method 3-use * / operator
		
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println(a);		
	System.out.println(b);	
	System.out.println("-------------------------");	
	
	//method 4- bitwise XOR
	
	a=a^b;
	b=a^b;
	a=a^b;
	
	System.out.println(a);		
	System.out.println(b);	
	System.out.println("-------------------------");	
	
	//method 5-single statement
	
	b=a+b-(a=b);
	System.out.println(a);		
	System.out.println(b);	
	System.out.println("-------------------------");	
	
		
		
		
		
		
		
	}

}
