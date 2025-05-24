package week4.day1;

public class LoginPage extends BasePage {

	 public void performCommonTasks(String session)
	    {
		 //calls child method
			System.out.println("Perform base page task " + session);
			// to call parent method
			super.performCommonTasks("go and search session");
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     LoginPage obj =new LoginPage();
     obj.performCommonTasks("Check for home assignment");
     //super.performCommonTaks();
     
	}

}
