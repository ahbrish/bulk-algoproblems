package algos.palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem03Test {

    @Test
    public void validPalindromeTest01(){
        String s = "aba";
        Assertions.assertTrue(Problem03.validPalindrome(s));
    }

    @Test
    public void validPalindromeTest02(){
        String s = "abca";
        Boolean actual = Problem03.validPalindrome(s);
        Assertions.assertTrue(actual);
    }

    @Test
    public void validPalindromeTest03(){
        String s = "abc";
        Boolean actual = Problem03.validPalindrome(s);
        Assertions.assertFalse(actual);
    }
}
