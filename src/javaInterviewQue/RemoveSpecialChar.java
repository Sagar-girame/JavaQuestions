package javaInterviewQue;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		
		String a="adkijd 12444 LANHA @#%*&(*)&";
		
		String b=a.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(b);
		
			
		
		
		
	}

}
