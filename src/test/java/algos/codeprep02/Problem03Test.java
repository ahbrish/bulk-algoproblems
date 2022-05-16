package algos.codeprep02;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Problem03Test {
    Problem03 problem03;

    @BeforeEach
    public void Setup(){
        problem03 = new Problem03();
    }

    @Test
    public void testOne(){
        String expected = "B";
        String actual = problem03.solution("aaBabcDaA");
        assertEquals(expected,actual);
    }

    @Test
    public void testTwo(){
        String expected = "NO";
        String actual = problem03.solution("Codility");
        assertEquals(expected,actual);
    }

    @Test
    public void testThree(){
        String expected = "T";
        String actual = problem03.solution("WeTestCodErszz");
        assertEquals(expected,actual);
    }
}
