package Aggregator;

import Iterator.Iterator;
import Iterator.LibraryIterator;
import Iterator.Book;
import java.util.List;

public class Library implements Aggregator {

    List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }
    public Iterator createIterator() {
        return new LibraryIterator(bookList);
    }
}
