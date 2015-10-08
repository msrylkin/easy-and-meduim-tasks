package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 09.10.2015.
 */
public class MediumSolutionTest {

    @Test
    public void testReturnSelect() throws Exception {
        MediumSolution mediumSolution = new MediumSolution();
        assertEquals(8,mediumSolution.returnSelect(new int[]{3,3,4,1,9,8,10},4));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testReturnSelectException() throws Exception {
        MediumSolution mediumSolution = new MediumSolution();
        mediumSolution.returnSelect(new int[]{3, 3, 4, 1, 9, 8, 10}, 7);
    }

    @Test
    public void testRunLengthEncoding() throws Exception {
        MediumSolution mediumSolution = new MediumSolution();
        assertEquals("3a1b2c2d",mediumSolution.runLengthEncoding("aaabccdd"));
    }

    @Test
    public void testRunLengthDecoding() throws Exception {
        MediumSolution mediumSolution = new MediumSolution();
        assertEquals("aaabccdd",mediumSolution.runLengthDecoding("3a1b2c2d"));
    }
}