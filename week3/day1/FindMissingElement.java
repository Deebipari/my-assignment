package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array declaration
		int a[]={1, 4,3,2,8, 6, 7};
		Arrays.sort(a);
		//System.out.println(a[6]);
      for(int i =0; i<a.length;i++)
      {
    	  
    	  if(a[i+1]!=a[i]+1)
    	  {
    		System.out.println(a[i]+1);
    		  break;
    	  }
    		  
      }
	}

}
