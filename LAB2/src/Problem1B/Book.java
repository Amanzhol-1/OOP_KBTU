package Problem1B;

public class Book extends LibraryItem{
	Object numberOfPages;
	
	public Book() {
		super();
		this.numberOfPages = "unknown number of pages";
	}
	
	public Book(String title, String author, int publicationYear, int numberOfPages) {
		super(title, author, publicationYear);
		this.numberOfPages = numberOfPages;
	}
	
	@Override
	public String toString() {
		return title + ", " + author + ", " + publicationYear + ", " + numberOfPages;
	} 
}
