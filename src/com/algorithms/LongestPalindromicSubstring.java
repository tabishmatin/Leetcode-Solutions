package com.algorithms;

/* Given a string s, return the longest palindromic substring in s. */

public class LongestPalindromicSubstring {

	public static String longestPalindrome(String s) {

		if (s.length() == 1)
			return s;

		if (s.length() == 2)
			return s.charAt(0) == s.charAt(1) ? s : s.substring(0, 1);

		int length = s.length();
		String maxStr = "";

		for (int i = 1; i < length - 1; i++) {
			int left = i;
			int right = i;

			while (left >= 1 && s.charAt(left - 1) == s.charAt(i))
				left--;

			while (right < length - 1 && s.charAt(right + 1) == s.charAt(i))
				right++;

			while (left >= 0 && right < length && s.charAt(left) == s.charAt(right)) {
				maxStr = maxStr.length() < (right - left + 1) ? s.substring(left, right + 1) : maxStr;
				left--;
				right++;
			}
		}
		return maxStr;
	}

	public static void main(String[] args) {

		String s = "babad";
		System.out.println(longestPalindrome(s));

	}

}
