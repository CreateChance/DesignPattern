/*************************************************************************
	> File Name: BookShelf.java
	> Author: CreateChance
	> Mail: createchance@163.com 
	> Created Time: Sat Feb 24 14:05:13 2018
 ************************************************************************/
import java.util.List;
import java.util.ArrayList;

public class BookShelf implements Aggregate {
	private List<Book> books = new ArrayList<>();

	public BookShelf() {
	}

	public Book getBookAt(int pos) {
		return books.get(pos);
	}

	public void append(Book book) {
		books.add(book);
	}

	public int getLength() {
		return books.size();
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
