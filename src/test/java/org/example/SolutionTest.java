package org.example;

import org.junit.Assert;
import org.junit.Test;


public class SolutionTest {

    @Test
    public void maxSubArrayTest() {
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        Assert.assertEquals(1, solution.maxSubArray(new int[]{1}));
        Assert.assertEquals(23, solution.maxSubArray(new int[]{5,4,-1,7,8}));
    }
}