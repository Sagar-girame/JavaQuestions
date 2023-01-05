package javaInterviewQue;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {
		
		System.out.println("Enter string");
		
		Scanner c= new Scanner(System.in);    //scanner class to input from user
		String s=c.nextLine();
		int con=1;
		for(int i=0;i<s.length();i++)
		{
			if( (s.charAt(i)==' ') &&( s.charAt(i+1)!=' '))
			{
				con++;
				
			}
		}
		
		System.out.println(con);
				
		
	}

}
