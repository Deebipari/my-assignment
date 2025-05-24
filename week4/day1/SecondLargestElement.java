package week4.day1;

import java.util.Arrays;
import java.util.List;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method 
        //Declare an array {3, 2, 11, 4, 6, 7}
		List<Integer> list = Arrays.asList(3, 2, 11, 4, 6, 7);
		//sorting using list
		list.sort(Integer::compareTo);
		System.out.println(list);
		//get second largest number
		System.out.println(list.get(list.size()-2));
		
		

	}

}
