package algos.codediffforever;

import algos.codedIffforever.Solution;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test // telling junit that this is the test case
    public void testOne() {
        Solution solution = new Solution(); // initialize the class

        String expected = "1\n2\nCode\n4\nDiff\n";
        String actual = solution.codeDiffForever(5);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTwo(){
        Solution solution = new Solution(); // initialize the class inorder to access the methods

        String expected = "1\n2\nCode\n4\nDiff\nCode\n7\n8\nCode\nDiff\n";
        String actual = solution.codeDiffForever(10);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThree(){
        Solution solution = new Solution();

        String expected = "1\n2\nCode\n4\nDiff\nCode\n7\n8\nCode\nDiff\n11\nCode\n13\n14\nCodeDiffForever\n16\n17\nCode\n19\nDiff\nCode\n22\n23\nCode\nDiff\n26\nCode\n28\n29\nCodeDiffForever\n31\n32\nCode\n34\nDiff\nCode\n37\n38\nCode\nDiff\n";
        String actual = solution.codeDiffForever(40);

        Assertions.assertEquals(expected, actual);
    }
}
