package Encapsulation;

public class Library {
	private int RollNo;
	private int borrowed_books;
	final private int MAX_BORROW=5;
	
	public void Borrowed_book() {
		if(borrowed_books<MAX_BORROW) {
			borrowed_books++;
			System.out.println("The book has borrowed and total book is"+" "+borrowed_books);
		}else {
			System.out.print("Can not borrow the book more than 5");
		}
	}
	public void returnBook() {
		if(borrowed_books>0){
				borrowed_books--;
			System.out.print("The book has been returned");
		}else {
			System.out.print("No book available to return");
		}
	}
	public int getborrowed_books() {
		return borrowed_books;
	}
}