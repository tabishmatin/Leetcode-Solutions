package com.algorithms;

public class MaximumSubarray {
	
	public static int maxSubArray(int[] nums) {
        
        int maxSubArray = nums[0];
        int currentSum = 0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(currentSum < 0)
                currentSum = 0;
            currentSum = currentSum + nums[i];
            maxSubArray = Math.max(maxSubArray, currentSum);
        }
        return maxSubArray;
    }

	public static void main(String[] args) {

		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
}
