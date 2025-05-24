package week4.day1;

import java.util.Arrays;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //- Declare an array {1, 2, 3, 4, 10, 6, 8}. 
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 10, 6, 8);
		//sorting using list
		list.sort(Integer::compareTo);
		for(int i =0; i<list.size()-1;i++)
		{
			if(!(list.get(i+1).equals(list.get(i)+1)))
					{
				   System.out.println(list.get(i)+1);
					}
		}


}
}