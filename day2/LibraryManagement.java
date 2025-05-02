package week1.day2;

public class LibraryManagement {
	public static void main(String[] args) {
		Library lib = new Library();
		System.out.println(lib.addBook("The Secret"));
		lib.issuebook();
	}

}
