import org.example.NumberList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberListTest {
    private NumberList myNumbers;

    @Before
    public void before() {
        this.myNumbers = new NumberList();
    }

    @Test
    public void hasNoNumbers() {
        assertEquals(0, this.myNumbers.getSize());
    }

    @Test
    public void canAddNumber() {
        this.myNumbers.addNumber(7);
        assertEquals(1, this.myNumbers.getSize());
    }

    @Test
    public void canFindAtIndex() {
        this.myNumbers.addNumber(15);
        assertEquals(15, this.myNumbers.getNumberAtIndex(0));
    }
}
