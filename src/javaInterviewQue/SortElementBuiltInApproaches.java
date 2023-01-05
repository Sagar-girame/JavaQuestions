package javaInterviewQue;

import java.util.Arrays;
import java.util.Collections;

public class SortElementBuiltInApproaches {

	public static void main(String[] args) {
		
		//1-parallel sort
		
		int a[]= {2,6,75,8,1,9,10};
		System.out.println("array before sorting:"+Arrays.toString(a));
		
		Arrays.parallelSort(a);
		
		System.out.println("array after sorting:"+Arrays.toString(a));
		
		//2-
		
		Integer b[]	= {2,365,1,4,3,5,15};
		Arrays.sort(b);
		System.out.println("array after sorting:"+Arrays.toString(b));
		
		Arrays.sort(b,Collections.reverseOrder());        //descending order
		
		System.out.println("array in descending order:"+Arrays.toString(b));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
