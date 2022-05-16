package algos.codeprep02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem02Test {
    Problem02 problem02;

    @BeforeEach
    public void Setup(){
        problem02 = new Problem02();
    }

    @Test
    public void testOne(){
        int[] input = {1,2,2,1};
        boolean actual = problem02.solution(input);
        assertTrue(actual);
    }

    @Test
    public void testTwo(){
        int[] input = {7,7,7};
        boolean actual = problem02.solution(input);
        assertFalse(actual);
    }

    @Test
    public void testThree(){
        int[] input = {1,2,2,3};
        boolean actual = problem02.solution(input);
        assertFalse(actual);
    }
}
