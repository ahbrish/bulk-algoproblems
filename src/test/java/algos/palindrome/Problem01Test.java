package algos.palindrome;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Problem01Test {

    @Test
    public void isPalindromeTest01(){
        int x = 121;
        Boolean actual = Problem01.isPalindrome(x);
        assertTrue(actual);
    }

    @Test
    public void isPalindromeTest02(){
        int x = -121;
        Boolean actual = Problem01.isPalindrome(x);
        assertFalse(actual);
    }

    @Test
    public void isPalindromeTest03(){
        int x = 10;
        Boolean actual = Problem01.isPalindrome(x);
        assertFalse(actual);
    }
}
