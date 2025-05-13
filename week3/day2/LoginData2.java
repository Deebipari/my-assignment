package week3.day2;

public class LoginData2 extends TestData{
	
	public void enterUsername() {

	System.out.println("logindata2 username");
           }
    public void enterPassword()
    {
	System.out.println("logindata2 password");

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginData2 obj = new LoginData2();
		obj.enterCredentials();
		obj.navigateToHomePage();
		obj.enterUsername();
		obj.enterPassword();
	
	
	}

}
