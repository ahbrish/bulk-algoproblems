package codingbat.string2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatEndTest {

    private RepeatEnd repeatEnd;

    @BeforeEach
    public void setup(){
        repeatEnd = new RepeatEnd();
    }

    @Test
    public void testOne(){
        assertEquals("llollollo",repeatEnd.repeatEnd("Hello", 3));
    }

    @Test
    public void testTwo(){
        assertEquals("lolo",repeatEnd.repeatEnd("Hello", 2));
    }

    @Test
    public void testThree(){
        assertEquals("o",repeatEnd.repeatEnd("Hello", 1));
    }

}
