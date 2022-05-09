package algos.ultraEncryptor;
/* to increase the readability of the test and of the assertions itself,
 I chose to import statically the respective class. This was I can refer
 directly to the assertion method itself without the representing class as a prefix */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    // declare a Solution variable solution
    Solution solution;

    @BeforeEach
    public void Setup(){
        // creating a new object or instance of the Solution class
        solution = new Solution();
    }

    @Test
    public void testOne(){
        // expected outcome after string manipulation with method
        String expected = "Lipps, Asvph!";
        // what the method actually produced
        String actual = solution.greatEncrypt("Hello, World!", 4);
        // asserEquals is a method of the Assertions class that checks that the two objects are equal or not
        assertEquals(expected, actual);
    }

    @Test
    public void testTwo(){
        // expected outcome after String manipulation
        String expected = "Xlmw mw Efveleq!";
        // actual outcome when arguments are passed to the method
        String actual = solution.greatEncrypt("This is Abraham!", 4);
        // Assertions are utility methods to support asserting conditions in tests
        assertEquals(expected, actual);
    }

    @Test
    public void testThree(){
        String expected = "Rhsli Ibyk";
        String actual = solution.greatEncrypt("Kaleb Burd", 215);
        assertEquals(expected, actual);
    }



}
