package algos.countingsmilesandfrowns;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    // declare an instance of the Solution class
    Solution solution;

    @BeforeEach
    public void Setup(){
        // initialize the instance
        solution = new Solution();
    }

    @Test
    public void testOne(){
        // set expected
        double expected = 2;
        double actual = solution.smileFrownRatio("(::P(::(");
        assertEquals(expected,actual, .001);
    }

    @Test
    public void testTwo(){
        double expected = 0;
        double actual = solution.smileFrownRatio("|::P:P:P:P):");
        assertEquals(expected, actual, .001);
    }

    @Test
    public void testThree(){
        double expected = .83333;
        double actual = solution.smileFrownRatio(":):D:D:):PO:|:)::P:P:D:):P):):O:O:O:|:O::P:DO::):PO:|:|:):)::P:))::):D|::P:P):");
        assertEquals(expected,actual, .001);
    }
}
