package ex1;

import java.util.Comparator;

public class SortBookByPages implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getPages().compareTo(o2.getPages());
	}

	

}
