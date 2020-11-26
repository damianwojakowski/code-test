import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution;

    @BeforeEach
    public void init() {
        solution = new Solution();
    }

    @Test
    public void GivenInputIsSix_ShouldReturnEight() {
        int expectedValue = 8;
        int givenInput = 6;

        assertEquals(expectedValue, solution.getValue(givenInput));
    }

    @Test
    public void GivenInputIsOneOrLess_ShouldReturnOne() {
        int expectedValue = 1;
        int givenInput = 1;

        assertEquals(expectedValue, solution.getValue(givenInput));
    }

    @Test
    public void GivenInputIsEight_ShouldReturnTwentyOne() {
        int expectedValue = 21;
        int givenInput = 8;

        assertEquals(expectedValue, solution.getValue(givenInput));
    }
}