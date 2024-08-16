package Iterator;

import java.util.ArrayList;
import java.util.List;

public class LibraryIterator implements Iterator{

    List<Book> bookList = new ArrayList<>();

    public LibraryIterator(List<Book> bookList) {
        this.bookList = bookList;
    }
    int index = 0;

    public boolean hasNext() {
        return index < bookList.size();
    }

    public Object next() {
        if (hasNext()) {
            return bookList.get(index++);
        }
        return null;
    }
}
