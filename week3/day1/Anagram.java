package week3.day1;

import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="stops";
		String text2="potss";
		//check if string length is equal
    		   text1.length();
		if(text1.length()== text2.length())
		{
			System.out.println("Strings are anagram");
			//convert both string to char
			char[] charArray = text1.toCharArray();
			char[] charArray1 =text2.toCharArray();
			// sort both array
			Arrays.sort(charArray);
			Arrays.sort(charArray1);
			if(Arrays.equals(charArray ,charArray1))
			{
				System.out.println("The given strings are Anagram");
			}
			else 
			{
				System.out.println("The given Strings are not Anagram");
				System.out.println(charArray1);
				System.out.println(charArray);

			}
			
		}
		else 
		{
			System.out.println("Length Mismatch, therefore strings are not an Anagram");
		}
	}

}
