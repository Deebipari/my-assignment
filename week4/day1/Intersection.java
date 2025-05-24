package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare an array for {3, 2, 11, 4, 6, 7} as list
		List<Integer> list1 = Arrays.asList(3, 2, 11, 4, 6, 7);
		// Declare another array for {1, 2, 8, 4, 9, 7} aslist 
		List<Integer> list2 = Arrays.asList(1, 2, 8, 4, 9, 7);
		System.out.println("The common elements are :");
	   for(Integer commonelement : list1)
	   {
		   if(list2.contains(commonelement))
		   {
			   System.out.println(commonelement);
			   
		   }
	   }
		
		
                                        
		
		
	}
}

