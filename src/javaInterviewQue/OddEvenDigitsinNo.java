package javaInterviewQue;

public class OddEvenDigitsinNo {

	public static void main(String[] args) {
		
		//Find even and odd digits.
		int a= 12345;
		int even=0 ;
		int odd=0;
		
		while(a>0)
		{
		int rem=a%10;
		
		if (rem%2==0)
		{
		even ++;
		}
		else
		{
		odd++;

		}
		}
		a=a/10;

		System.out.println(even);
		System.out.println(odd);

		
	}

}
