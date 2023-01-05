package javaInterviewQue;

public class CountCharOccurance {

	public static void main(String[] args) {
		
		String a="java programming and selenium";
		
		int b=a.length();
		
		int c=a.replace("e", "").length();
		
		System.out.println(b-c);
	}

}
