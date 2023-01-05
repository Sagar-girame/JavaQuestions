package javaInterviewQue;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
	
		String a="jav program one two";
		
		String b=a.replaceAll("\\s", "");
		System.out.println(b);
		
	}

}
