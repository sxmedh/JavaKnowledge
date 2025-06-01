package questions.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dp {

    @Test
    void testClimbStairs() {
        ClimbingStairs cs = new ClimbingStairs();

        // Base cases
        assertEquals(1, cs.climbStairs(1), "There is only 1 way to climb 1 stair");
        assertEquals(2, cs.climbStairs(2), "There are 2 ways to climb 2 stairs");

        // Typical cases
        assertEquals(3, cs.climbStairs(3), "There are 3 ways to climb 3 stairs");
        assertEquals(5, cs.climbStairs(4), "There are 5 ways to climb 4 stairs");
        assertEquals(8, cs.climbStairs(5), "There are 8 ways to climb 5 stairs");

        // Larger case
        assertEquals(377, cs.climbStairs(13), "There are 233 ways to climb 13 stairs");
    }

}
