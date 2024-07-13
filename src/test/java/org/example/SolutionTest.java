package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionTest {

    @Test
    public void maxSubArrayTest() {
        Solution solution = new Solution();
        assertEquals(6, solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        assertEquals(1, solution.maxSubArray(new int[]{1}));
        assertEquals(23, solution.maxSubArray(new int[]{5,4,-1,7,8}));
        assertEquals(120, solution.maxSubArray(new int[]
                {-4, 6, -100, 0, 0, 5, 7 , -100, 30, 40, 50, -200, 40}));
        assertEquals(209, solution.maxSubArray(new int[]
                {-65, -45, 34, 55, -100, 45, 38, 96, -200, 55, 100, 34, 20, -30}));
        assertEquals(369, solution.maxSubArray(new int[]
                {10, 30, -40, -50, 39, 85, 200, 45, -300, 20, 75, 38}));
    }
}