package codingbat.string2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CountHiTest {

    CountHi countHi;

    @BeforeEach
    public void setup(){
        countHi = new CountHi();
    }

    @Test
    public void testOne(){
        assertEquals(1, countHi.countHi("abc hi ho"));
    }

    @Test
    public void testTwo(){
        assertEquals(2, countHi.countHi("ABChi hi"));
    }
    @Test
    public void testThree(){
        assertEquals(2, countHi.countHi("hihi"));
    }


}
