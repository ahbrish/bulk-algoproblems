package algos.countingsmiles;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SolutionTest {

    // declare an instance variable of Solution
    Solution solution;

    @BeforeEach // this annotation is saying before each test, run this setup method
    public void Setup(){
        solution = new Solution();
    }

    @Test
    public void testOne(){
        int expected = 3;
        int actual = solution.countingSmiles("(:(::)");
        assertEquals(expected, actual);
    }

    @Test
    public void testTwo(){
        int expected = 0;
        int actual = solution.countingSmiles("|::P:P:P:P):");
        assertEquals(expected, actual);
    }

    @Test
    public void testThree(){
        int expected = 11;
        int actual = solution.countingSmiles(":):D:D:):PO:|:)::P:P:D:):P):):O:O:O:|:O::P:DO::):PO:|:|:):)::P:))::):D|::P:P)::)");
        assertEquals(expected, actual);
    }

}
