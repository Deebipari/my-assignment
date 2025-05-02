package week1.day2;

public class Library{
	
	String addBook(String bookTitle){
		System.out.println("Book added successfully");
		return bookTitle;
		}
	void issuebook()
	{
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		Library lib = new Library();
		System.out.println(lib.addBook("The Secret"));
		lib.issuebook();
	
	}
}
