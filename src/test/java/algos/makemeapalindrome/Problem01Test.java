package algos.makemeapalindrome;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Problem01Test {

//    @Test
//    public void makeMeAPalindrome01(){
//        assertEquals("aba", Problem01.makeMeAPalindrome("aab"));
//    }
//
//    @Test
//    public void makeMeAPalindrome02(){
//        assertEquals("nope", Problem01.makeMeAPalindrome("aaabbbb"));
//    }
//
//    @Test
//    public void makeMeAnPalindromeTest03(){
//        assertEquals("abccba", Problem01.makeMeAPalindrome("aabbcc"));
//    }
//
//    @Test
//    public void makeMeAnPalindromeTest04(){
//        assertEquals("nope", Problem01.makeMeAPalindrome("aabbbccc"));
//    }

        @Test
    public void makeMeAnPalindromeTest01(){
        String input = "aab";
        String expected = "aba";
        String actual = Problem01.makeMeAPalindrome(input);
        assertEquals(expected, actual);
    }

    @Test
    public void makeMeAnPalindromeTest02(){
        String input = "aaabbb";
        String expected = "nope";
        String actual = Problem01.makeMeAPalindrome(input);
        assertEquals(expected, actual);
    }

    @Test
    public void makeMeAnPalindromeTest03(){
        String input = "aabbcc";
        String expected = "abccba";
        String actual = Problem01.makeMeAPalindrome(input);
        assertEquals(expected, actual);
    }

    @Test
    public void makeMeAnPalindromeTest04(){
        String input = "aabbbccc";
        String expected = "nope";
        String actual = Problem01.makeMeAPalindrome(input);
        assertEquals(expected, actual);
    }
}

