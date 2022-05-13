package algos.codeprep02;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Problem01Test {

        Problem01 problem01;

        @BeforeEach
        public void Setup(){
            problem01 = new Problem01();
        }

        @Test
        public void testOne(){
            int expected = 2;
            int actual = problem01.Solution("^vv<v");
            assertEquals(expected, actual);
        }

    @Test
    public void testTwo(){
        int expected = 1;
        int actual = problem01.Solution("^^^^v");
        assertEquals(expected, actual);
    }

    @Test
    public void testThree(){
        int expected = 3;
        int actual = problem01.Solution("v>>>vv");
        assertEquals(expected, actual);
    }

    @Test
    public void testFour(){
        int expected = 0;
        int actual = problem01.Solution("<<<");
        assertEquals(expected, actual);
    }
}
