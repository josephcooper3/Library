import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;

    @Before
    public void before(){
        book1 = new Book("Pride and Prejudice", "Jane Austen", "Romance");
    }

    @Test
    public void hasTitle(){
        assertEquals("Pride and Prejudice", book1.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Jane Austen", book1.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Romance", book1.getGenre());
    }

}
