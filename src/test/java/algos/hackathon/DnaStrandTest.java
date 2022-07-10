package algos.hackathon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DnaStrandTest {

    @Test
    public void test01(){
        String input = "GTCAG";
        String expected = "CTGAC";
        String actual = DnaStrand.dnaComplement(input);
        Assertions.assertEquals(expected,actual);

    }
}
