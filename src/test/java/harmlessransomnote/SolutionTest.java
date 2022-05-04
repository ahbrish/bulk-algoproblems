package harmlessransomnote;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    // bring in the solution class by declaring it because it has the method we want to test
    private Solution solution;
    private String magazineText;

    @Before
    public void setup(){
        // initialize the class variable declared above
        solution = new Solution();
        magazineText = "puerto rico is a great place you must hike far from town to find a secret "+
                "waterfall that i am an admirer of but note that it is not as hard as it seems "+
                "this is my advice for you";
    }

    @Test
    public void harmlessRansomNoteTestFail(){
        String noteText = "this is a secret note for you from a secret admirer";
        Boolean actual = solution.harmlessRansomNote(noteText,magazineText);
        Assert.assertFalse(actual);
    }

    @Test
    public void harmlessRansomNoteTestPass(){
        String noteText = "this is a note for you from a secret admirer";
        Boolean actual = solution.harmlessRansomNote(noteText,magazineText);
        Assert.assertTrue(actual);
    }
}
