import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void GivenNumberSix_ShouldReturnEigt() {
        int expectedValue = 8;
        int givenInput = 6;

        Solution solution = new Solution();

        assertEquals(expectedValue, solution.getValue(givenInput));
    }
}