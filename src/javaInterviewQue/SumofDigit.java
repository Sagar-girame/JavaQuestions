package javaInterviewQue;

public class SumofDigit {

	public static void main(String[] args) {
		
		//Sum of digit in no

		int a =12345;
		int b=0;
		while(a>0)
		{
		b=b+a%10;
		a=a/10;
		}
		System.out.println(b);

	}

}
