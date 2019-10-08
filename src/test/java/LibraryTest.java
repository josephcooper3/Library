import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;

    @Before
    public void before(){
        library = new Library(1);
        book1 = new Book("Pride and Prejudice", "Jane Austen", "Romance");
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void cannotAddBooksOverCapacity(){
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

}
