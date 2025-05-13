package week3.day1;

public class StringToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String test= "changeme";
        //convert to character array
        char[] charArr= test.toCharArray();
        //loop to iterate the array
        for(int i =0 ; i<charArr.length; i++)
        {
        	if(i%2!=0)
        	{
        		charArr[i]=Character.toUpperCase(charArr[i]);
        	}
        }
        for(int j =0; j<charArr.length; j++)
        {
        	System.out.println(charArr[j]);
        }
	}

}
