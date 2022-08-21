package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays
 * and you may return the result in any order. */

public class IntersectionOfTwoArraysII {

	public static int[] intersect(int[] nums1, int[] nums2) {

		// swap arrays
		int[] temp = null;

		if (nums1.length > nums2.length) {
			temp = nums1;
			nums1 = nums2;
			nums2 = temp;
		}

		List<Integer> list1 = IntStream.of(nums1).boxed().collect(Collectors.toList());

		List<Integer> list2 = IntStream.of(nums2).boxed().collect(Collectors.toList());

		List<Integer> result = new ArrayList<>();

		for (Integer i : list1) {
			if (list2.contains(i)) {
				result.add(i);
				list2.remove(Integer.valueOf(i));
			}
		}

		return result.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {

		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };

		System.out.println(Arrays.toString(intersect(nums1, nums2)));
	}
}
