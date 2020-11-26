import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void GivenInputIs6_ShouldReturn8() {
        int expectedValue = 8;
        int givenInput = 6;

        Solution solution = new Solution();

        assertEquals(expectedValue, solution.getValue(givenInput));
    }

    @Test
    public void GivenInputIsOneOrLess_ShouldReturn1() {
        int expectedValue = 1;
        int givenInput = 1;

        Solution solution = new Solution();

        assertEquals(expectedValue, solution.getValue(givenInput));
    }
}