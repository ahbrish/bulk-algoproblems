package algos.multiplesoften;

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
        int[] expected = {10,30,10,30};
        int[] input = {10,3,5,6};
        int[] actual = solution.multipleOfTens(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTwo(){
        int[] expected = {70,10,10,90};
        int[] input = {7,2,10,9};
        int[] actual = solution.multipleOfTens(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testThree(){
        int[] expected = {10};
        int[] input = {2};
        int[] actual = solution.multipleOfTens(input);
        assertArrayEquals(expected, actual);
    }
}
