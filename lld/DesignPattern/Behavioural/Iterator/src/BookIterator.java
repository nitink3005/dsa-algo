import java.util.List;

public class BookIterator implements  Iterator {
    private List<Book>books;
    private int index = 0;
    public BookIterator(List<Book> booksList) {
        this.books = booksList;
    }

    @Override
    public boolean hasNext() {
        if(index < books.size()) return true;
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()) {
            Book nextBook = books.get(index++);
            return nextBook;
        }
        return null;
    }
}
