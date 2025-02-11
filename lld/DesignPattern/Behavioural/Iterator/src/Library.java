import java.util.List;

public class Library implements Aggregator {
    private List<Book>booksList;

    public Library(List<Book> booksList) {
        this.booksList = booksList;
    }

    @Override
    public Iterator createIterator() {
        return (Iterator) new BookIterator(booksList);
    }
}
