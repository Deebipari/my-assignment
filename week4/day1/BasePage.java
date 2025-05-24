package week4.day1;

public class BasePage {

	public void findElement(String element)
	{
		System.out.println("find the element " +element);
	}
	public void clickElement(String click)
	{
		System.out.println("click the " +click);
	}
	public void enterText(String Text) 
	{
		System.out.println("enter the text " +Text);

	}
    public void performCommonTasks(String session)
    {
		System.out.println("perform the task " +session);

    }
    public static void main(String[] args) {
		BasePage obj = new BasePage();
		obj.findElement("testleaf login page");
		obj.clickElement("sigin");
		obj.enterText("name & password");
		obj.performCommonTasks("go and search session");
	}
}
