package algos.codeprep01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem02Test {
    Problem02 problem02;

    @BeforeEach
    public void SetUp(){
        problem02 = new Problem02();
    }

    @Test
    public void challengeTest01(){
        ArrayList<String> cousins = new ArrayList<>(Arrays.asList("Hakim", "Greg", "Loki", "Frank", "Ed"));
        Integer startingIndex = 1;
        String name = "Hakim";
        Integer expected = 1;
        Integer actual = problem02.cousinTag(cousins,startingIndex,name);
        assertEquals(expected, actual);
    }

    @Test
    public void challengeTest02(){
        ArrayList<String> cousins = new ArrayList<>(Arrays.asList("Hakim", "Greg", "Loki", "Frank", "Ed", "Peter", "Victor"));
        Integer startingIndex = 5;
        String name = "Hakim";
        Integer expected = 2;
        Integer actual = problem02.cousinTag(cousins,startingIndex, name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void challengeTest03(){
        ArrayList<String> cousins = new ArrayList<>(Arrays.asList("Hakim", "Greg", "Loki", "Frank", "Ed", "Peter", "Victor"));
        Integer startingIndex = 4;
        String name = "Peter";
        Integer expected = 1;
        Integer actual = problem02.cousinTag(cousins,startingIndex, name);
        Assertions.assertEquals(expected, actual);
    }
}
