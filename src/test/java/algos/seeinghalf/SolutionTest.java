package algos.seeinghalf;

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
        String actual = solution.seeHalf("Kaleb");
        assertEquals(expected, actual);
    }

    @Test
    public void testTwo(){
        String expected = "TTaarriiqq";
        String actual = solution.seeHalf("Tariq");
        assertEquals(expected, actual);
    }

    @Test
    public void testThree(){
        String expected = "TTiimmee  TToo  SSppeel";
        String actual = solution.seeHalf("Time To Spell");
        assertEquals(expected, actual);
    }

    @Test
    public void testFour(){
        String expected = "HHeeloo  WWoorrlldd";
        String actual = solution.seeHalf("Hello World");
        assertEquals(expected, actual);
    }
}
