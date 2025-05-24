package week4.day1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseCollectionOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS}
		String arr[]={"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> list = new  ArrayList<>(Arrays.asList(arr));
		//System.out.println(list);
		Collections.sort(list);
		//System.out.println(list);
        for(int i=list.size()-1;i>=0;i--)
        {
        	System.out.println(list.get(i));
        }


		      
	
		
	}

}
