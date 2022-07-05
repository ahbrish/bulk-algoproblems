package codingbat.string2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ZipZapTest {

    private ZipZap zipZap;

    @BeforeEach
    public void setup(){
        zipZap = new ZipZap();
    }

    @Test
    public void testOne(){
        assertEquals("zpXzp", zipZap.zipZap("zipXzap"));
    }

    @Test
    public void testTwo(){
        assertEquals("zpzp", zipZap.zipZap("zopzop"));
    }

    @Test
    public void testThree(){
        assertEquals("zzzpzp", zipZap.zipZap("zzzopzop"));
    }

}
