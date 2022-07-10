package algos.distinctelements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DistinctElementsTest {

    private DistinctElements distinctElements;

    @BeforeEach
    public void setup(){
        distinctElements = new DistinctElements();
    }

    @Test
    public void test01(){
        int[] nums = {1,2,5,56,7,4,3,3,4,3,2};

        int remove = 3;

        int result = distinctElements.distinctIds(nums, remove);
        assertEquals(4,result);
    }

    @Test
    public void test02(){
        int[] nums = {1,2,3,4,5,6,7,8,9,0,10,1,2,3,4,5};
                  //0,1,2,3,4,5
        int remove = 6;

        int result = distinctElements.distinctIds(nums, remove);
        assertEquals(5, result);
    }

    @Test
    public void test03(){
        int[] nums = {1,2,5,56,7,4,3,3,4,3,2};
        int remove = 3;

        int result = distinctElements.distinctIds(nums, remove);
        assertEquals(4, result);
    }

    @Test
    public void test04(){
        int[] nums = {101,102,10,10,13,13,13,5,11,48,32,12,};
        int remove = 8;

        int result = distinctElements.distinctIds(nums, remove);
        assertEquals(2, result);
    }
}
