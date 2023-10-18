package Problem1B;

public abstract class LibraryItem {
	String title;
	String author;
	Object publicationYear;
	
	public abstract String toString();
	
	public LibraryItem() {
		this.title = "unknown title";
		this.author = "unknown author";
		this.publicationYear = "unknown publication year";
	}
	
	public LibraryItem(String title, String author, int publicationYear) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}
}
