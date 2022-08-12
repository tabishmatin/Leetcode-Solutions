package com.algorithms;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	
	public static boolean containsDuplicate(int[] nums) {
        
        Set<Integer> numSet = new HashSet<>();
        
        for(int i : nums)
        {
            if(numSet.contains(i))
                return true;
            else
                numSet.add(i);
        }
        return false;
}

	public static void main(String[] args) {

		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(nums));
	}
}
