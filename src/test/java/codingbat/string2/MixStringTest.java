package codingbat.string2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MixStringTest {

    private MixString mixString;

    @BeforeEach
    public void setup(){
        mixString = new MixString();
    }

    @Test
    public void testOne(){
        String expected = "axbycz";
        String actual = mixString.mixString("abc","xyz");
        assertEquals(expected, actual);
    }

    @Test
    public void testTwo(){
        assertEquals("HTihere", mixString.mixString("Hi", "There"));
    }

    @Test
    public void testThree(){
        assertEquals("xTxhxexre", "xxxx", "There");
    }
}
