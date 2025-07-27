package ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Book implements Comparable<Book>{
	
	private String title; 
	
	private String author; 
	
	private Integer pages; 
	
	private Double price;

	public Book(String title, String author, int pages, double price) {
		super();
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	

	public Integer getPages() {
		return pages;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pages=" + pages + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book o) {		
		return this.title.compareToIgnoreCase(o.getTitle());
	}
	
	
	
	

	public static void main(String[] args) {
		
		List<Book> books  = new ArrayList<Book>(); 
		
		books.add(new Book("The pciture of Dorian Gray", "Oscar Wilde", 256, 6.5));
		books.add(new Book("Perfume", "Peter Suskind", 272, 10));
		books.add(new Book("Cien anos de Soledad", "Gabriel Garcia Marquez", 496, 8));
		
		System.out.println("book list");
		System.out.println(books);
		System.out.println("*******************************************************\n");
		
		Collections.sort(books);
		System.out.println("************ book list - natural order ************");
		System.out.println(books);
		
		System.out.println("*******************************************************\n");
		
		Comparator<Book> c = new SortBookByAuthor();
		
		Collections.sort(books, c);
		System.out.println("************ book list - sorted by author ************");
		System.out.println(books);
		
		System.out.println("******************************************************\n");
		
		c = new SortBookByPages();
		Collections.sort(books, c);
		System.out.println("************ book list - sorted by pages ************");
		System.out.println(books);
		
		System.out.println("*****************************************************\n");
		
		c = new SortBookByPrice();
		Collections.sort(books, c);
		System.out.println("************ book list - sorted by price ************");
		System.out.println(books);
		System.out.println("*****************************************************\n");
	}
	

}
