package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn Java basics as part of java sessions in java week1";
		//initialize count
		int count =0;
        String a[] = text.split(" ");
       // System.out.println(a[11]);
        for(int i =0 ; i<a.length; i++)
        {
        	for(int j=i+1 ; j<a.length; j++)
        	{
        		//ignore case sensitive 
        		if(a[i].equalsIgnoreCase(a[j]))
        		{
        			a[j]= " ";
        			count++;
        			//System.out.println(a[j]);
        		}
        	}
        }
        if(count!=0) {
        	System.out.println("the modified words array where duplicates have been replaced with empty strings");
        
        		
         for( int i =0; i <a.length; i++)
        	{
        		System.out.println(a[i]);
        	}
        
        
	}

	}

}