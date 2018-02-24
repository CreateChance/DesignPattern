/*************************************************************************
	> File Name: Main.java
	> Author: CreateChance
	> Mail: createchance@163.com 
	> Created Time: Sat Feb 24 14:23:56 2018
 ************************************************************************/
public class Main {
	public static void main(String argvs[]) {
		BookShelf bookShelf = new BookShelf();
		
		bookShelf.append(new Book("Book 1"));
		bookShelf.append(new Book("Book 2"));
		bookShelf.append(new Book("Book 3"));
		bookShelf.append(new Book("Book 4"));
		bookShelf.append(new Book("Book 5"));
		bookShelf.append(new Book("Book 6"));
		bookShelf.append(new Book("Book 7"));
		bookShelf.append(new Book("Book 8"));
		bookShelf.append(new Book("Book 9"));

		Iterator shelfIterator = bookShelf.iterator();
		while (shelfIterator.hasNext()) {
			Book book = (Book) shelfIterator.next();

			System.out.println("Book name: " + book.getName());
		}
	}
}
