package javaInterviewQue;

import java.util.Random;

public class Randomno {

	public static void main(String[] args) {
		
		//Generate random number and strings
		//Approach 1- random
		Random r= new Random();
		int a=r.nextInt(100); 
		System.out.println(a);
		r.nextDouble();      //range 0.0 to less than 1.0

		//Approach 2- math class
		System.out.println(Math.random());
		
	}

}
