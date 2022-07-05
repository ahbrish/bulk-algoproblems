package codingbat.string2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GetSandwichTest {

    private GetSandwich getSandwich;

    @BeforeEach
    public void setup(){
        getSandwich = new GetSandwich();
    }

    @Test
    public void testOne(){
        assertEquals("jam", getSandwich.getSandwich("breadjambread"));
    }

    @Test
    public void testTwo() {
        assertEquals("jam", getSandwich.getSandwich("xxbreadjambreadyy"));
    }

    @Test
    public void testThree() {
        assertEquals("", getSandwich.getSandwich("xxbreadyy"));
    }
}
