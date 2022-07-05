package algos.couldbeapalindrome;

import org.junit.jupiter.api.Test;

import static algos.couldbeapalindrome.Problem01.couldBeAPalindrome;
import static org.junit.jupiter.api.Assertions.*;

public class Problem01Test {

    @Test
    public void couldBeAPalindromeTest01(){
        String input = "kayak";
        assertTrue(couldBeAPalindrome(input));
    }

    @Test
    public void couldBeAPalindromeTest02(){
        String input = "bingo";
        assertFalse(couldBeAPalindrome(input));
    }

    @Test
    public void couldBeAPalindromeTest03(){
        String input = "rotator";
        assertTrue(couldBeAPalindrome(input));
    }

    @Test
    public void couldBeAPalindromeTest04(){
        String input = "rotater";
        assertFalse(couldBeAPalindrome(input));
    }

    @Test
    public void couldBeAPalindromeTest05(){
        String input = "deed";
        assertTrue(couldBeAPalindrome(input));
    }
}
