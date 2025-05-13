package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		//split the string
		String a[]=test.split(" ");
		//System.out.println(a[0]);
		//Traverse through each word using loop
		for(int i =0; i<a.length; i++)
		{
			//Find the odd index within the loop
			if(i%2==0)
			{
				System.out.println(a[i]);
				
			}
			else {
				//Convert the String array into a character array
				String reversed = "";
				char[] charArray = a[i].toCharArray(); 
				//System.out.println(charArray);
				for(int j =charArray.length-1 ;j>=0;j--)
				{
					reversed +=charArray[j];
				}
				System.out.println(reversed);
			    
			
				
		}

	}

	}
}


