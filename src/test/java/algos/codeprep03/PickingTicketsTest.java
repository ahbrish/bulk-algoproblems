package algos.codeprep03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PickingTicketsTest {
    PickingTickets pickingTickets;

    @BeforeEach
    public void setup(){
        pickingTickets = new PickingTickets();
    }

    @Test
    public void testOne(){
        List<Integer> input = Arrays.asList(8, 5, 4, 8, 4);
        int expected = 3;
        int actual = pickingTickets.maxTickets(input);
        assertEquals(expected,actual);
    }

    @Test
    public void testTwo(){
        List<Integer> input = Arrays.asList(1,3,2,4,6,7,8); //1,2,3,4,6,7,8
        int expected = 4;
        int actual = pickingTickets.maxTickets(input);
        assertEquals(expected,actual);
    }

    @Test
    public void testThree(){
        List<Integer> input = Arrays.asList(9,5,6,4,8);
        int expected = 3;
        int actual = pickingTickets.maxTickets(input);
        assertEquals(expected,actual);
    }
}
