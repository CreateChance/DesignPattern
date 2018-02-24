/*************************************************************************
	> File Name: BoolShelfIterator.java
	> Author: CreateChance
	> Mail: createchance@163.com 
	> Created Time: Sat Feb 24 14:11:10 2018
 ************************************************************************/
public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;

	private int index;

	public BookShelfIterator(BookShelf shelf) {
		this.bookShelf = shelf;
	}

	@Override
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		if (hasNext()) {
			return bookShelf.getBookAt(index++);
		} else {
			return null;
		}
	}
}
