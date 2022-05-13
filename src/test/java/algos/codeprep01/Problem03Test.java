package algos.codeprep01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Problem03Test {
    Problem03 problem03;

    @BeforeEach
    public void SetUp(){
        problem03 = new Problem03();
    }

    @Test
    public void numberFamily01(){
        Integer number = 4;
        Integer[] possibleFamilyMembers = new Integer[]{3,2,1,6,8,4};
        Integer[] expected = new Integer[]{1,2,3,4};
        Integer[] actual = problem03.numberFamily(number, possibleFamilyMembers);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void numberFamily02(){
        Problem03 solution = new Problem03();
        Integer number = 8;
        Integer[] possibleFamilyMembers = new Integer[]{3,7,10,6,8,9,2,1};
        Integer[] expected = new Integer[]{6,7,8,9,10};
        Integer[] actual = solution.numberFamily(number, possibleFamilyMembers);
        Assertions.assertArrayEquals(expected,actual);
    }
}
