package algos.codeprep03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaxOccurringCharTest {
    MaxOccurringChar maxOccurringChar;

    @BeforeEach
    public void setup(){
        maxOccurringChar = new MaxOccurringChar();
    }

    @Test
    public void testOne(){
        char expected = 'a';
        String input = "abbbaacc";
        char actual = maxOccurringChar.maximumOccurringCharacter(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testTwo(){
        char expected = 's';
        String input = "gsfadsddss";
        char actual = maxOccurringChar.maximumOccurringCharacter(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testThree(){
        char expected = 'd';
        String input = "ddgdffhffd";
        char actual = maxOccurringChar.maximumOccurringCharacter(input);
        assertEquals(expected, actual);
    }
}
