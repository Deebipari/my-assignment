package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int input = 121;
		int output =0;
		
		for(int i=input; i>0; i=i/10)
		{
			output = output*10 + i%10 ;
		}
		
		if(input ==output)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
			
			
	}
}
