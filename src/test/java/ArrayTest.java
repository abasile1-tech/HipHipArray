import org.example.Peacock;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArrayTest {
    Peacock peacock;
    @Before
    public void before() {
        peacock = new Peacock();
    }

    @Test
    public void hasFourColors(){
        assertEquals(4, peacock.getColors().length);
    }

    @Test
    public void hasBlueColorAtIndex3() {
        assertEquals("Blue", peacock.getColorFromIndex(3));
    }
}
