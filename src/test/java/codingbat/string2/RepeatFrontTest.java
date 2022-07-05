package codingbat.string2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RepeatFrontTest {

    private RepeatFront repeatFront;

    @BeforeEach
    public void setup(){
        repeatFront = new RepeatFront();
    }

    @Test
    public void testOne(){
        assertEquals("ChocChoChC",repeatFront.repeatFront("Chocolate", 4));
    }

    @Test
    public void testTwo(){
        assertEquals("ChoChC",repeatFront.repeatFront("Chocolate", 3));
    }

    @Test
    public void testThree(){
        assertEquals("IcI",repeatFront.repeatFront("Ice Cream", 2));
    }

}
