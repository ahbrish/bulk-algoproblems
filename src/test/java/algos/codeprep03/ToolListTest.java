package algos.codeprep03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToolListTest {
    ToolList toolList;

    @BeforeEach
    public void setup(){
        toolList = new ToolList();
    }

    @Test
    public void testOne(){
        List<String> tools = new ArrayList<>(Arrays.asList("ballendmill", "keywaycutter", "slotdrill", "facemill"));
        Integer startingIndex = 1;
        String name = "ballendmill";
        Integer expected = 1;
        Integer actual = toolList.toolchanger(tools,startingIndex,name);
        assertEquals(expected,actual);
    }

    @Test
    public void testTwo(){
        List<String> tools = new ArrayList<>(Arrays.asList("ballendmill", "keywaycutter", "slotdrill", "facemill","zip"));
        Integer startingIndex = 3;
        String name = "ballendmill";
        Integer expected = 2;
        Integer actual = toolList.toolchanger(tools,startingIndex,name);
        assertEquals(expected,actual);
    }
}
