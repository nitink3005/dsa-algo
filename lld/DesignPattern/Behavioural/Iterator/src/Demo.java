import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        System.out.println("--- Iterator Design Pattern ----");
        Book b1 = new Book(200, "Five Point Someone");
        Book b2 = new Book(599, "Atomic Habits");
        Library schoolLibrary = new Library(Arrays.asList(b1, b2));
        Iterator iterator = schoolLibrary.createIterator();
        System.out.println("Iterating over Books present in Library...");
        while(iterator.hasNext()) {
            Book book = (Book)iterator.next();
            System.out.println("Book => " + book.getBookName() + " available at price of RS. "+ book.getPrice());
        }
    }
}
