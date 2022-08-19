package com.algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class MedianOfTwoSortedArrays {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		ArrayList<Integer> list1 = new ArrayList<>();

		for (int i = 0; i < nums1.length; i++) {
			list1.add(Integer.valueOf(nums1[i]));
		}

		ArrayList<Integer> list2 = new ArrayList<>();

		for (int i = 0; i < nums2.length; i++) {
			list2.add(Integer.valueOf(nums2[i]));
		}

		list1.addAll(list2);

		Collections.sort(list1);

		int size = list1.size();

		if (size % 2 == 0) {
			return ((double) list1.get((size / 2) - 1) + (double) list1.get(size / 2)) / 2;
		}

		else {
			return list1.get(size / 2);
		}
	}

	public static void main(String[] args) {

		int[] nums1 = { 1, 2 };
		int[] nums2 = { 3, 4 };

		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
}
