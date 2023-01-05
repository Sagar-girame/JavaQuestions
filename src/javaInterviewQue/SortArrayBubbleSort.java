package javaInterviewQue;

import java.util.Arrays;

public class SortArrayBubbleSort {

	public static void main(String[] args) {
		
		int a[]= {4,50,3,12,2,24};
		
		System.out.println(Arrays.toString(a));
		
		int n=a.length;
		for(int i=0;i<n-1;i++)     //no of passes=n-1
		{
			for(int j=0;j<n-1;j++)   //iteration in each pass
			{
				if(a[j]>a[j+1])
				{
					a[j+1]=a[j]+a[j+1]-(a[j]=a[j+1]);                   //swap no b=a+b-(a=b);
				}
			}
			
		}
		System.out.println(Arrays.toString(a));
		
	}

}
