package javaInterviewQue;

public class BinaryArraySearch {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};    //should be in sorted order
		
		boolean b=false;
		
		int key=30;
		
		int l=0;
		int h=a.length-1;
		
		while(l<=h)
		{
			int m=(l+h)/2;
			
			if(a[m]==key)
			{
				System.out.println("Element found");
				b=true;
				break;
				
			}
			if(a[m]<key)
			{
				l=m+1;
				
			}
			if(a[m]>key)
			{
				h=m-1;
				
			}
		}
		if(b==false)
		{
			System.out.println("Element not found");
			
		}
		

	}

}
