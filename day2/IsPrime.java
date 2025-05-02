package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		
	int num =17;
	int count = 0;
		for(int i =2; i <num-1; i++)
		{
			if (num % i ==0)
				count++;
			    break;
		}
		if(count!=0)
			System.out.println("It is not a prime number");
		else
			System.out.println("It is a prime number");

	}
}
