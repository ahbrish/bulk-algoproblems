package algos.seeingdouble;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution solution;

    @BeforeEach
    public void Setup(){
        solution = new Solution();
    }

    @Test
    public void testOne(){
        String expected = "KKaalleebb";
        String actual = solution.seeingDouble("Kaleb");
        assertEquals(expected, actual);
    }

    @Test
    public void testTwo(){
        String expected = "TTaarriiqq";
        String actual = solution.seeingDouble("Tariq");
        assertEquals(expected, actual);
    }

    @Test
    public void testThree(){
        String expected = "HHeelllloo  WWoorrlldd";
        String actual = solution.seeingDouble("Hello World");
        assertEquals(expected, actual);
    }
}
