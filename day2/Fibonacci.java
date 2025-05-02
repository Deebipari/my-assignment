package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int n=8;
		for(int i=0; i<n; i++)
		{
			System.out.println(a);
			int c = a+b;
			a=b;
			b=c;
		}
	}
}
