package javaInterviewQue;

public class SearchElementInArray {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50,60,70};
		int b=65;
		
		boolean c=false;
		
		for(int d:a)
		{
			if(b==d)
			{
				System.out.println("Element found");
				c=true;
				break;
				
			}
		}
		if(c==false)
		{
			System.out.println("Element not found");
		}
	}

}
