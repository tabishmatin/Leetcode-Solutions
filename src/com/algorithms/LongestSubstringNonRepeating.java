package com.algorithms;

import java.util.HashSet;

/* Given a string s, find the length of the longest substring
 * without repeating characters.
 */

public class LongestSubstringNonRepeating {
	
	public static int lengthOfLongestSubstring(String s) {
        
        char[] array = s.toCharArray();
        HashSet<Character> hashSet = new HashSet<>();
        
        int length = 0;
        int start = 0;
        int end = 0;
        
        while(end < array.length)
        {
            if(hashSet.add(array[end])) {
                end += 1;
                length = Math.max(length, hashSet.size());
            }
            else {
                hashSet.remove(array[start]);
                start += 1;
            }
        }
        return length;
    }

	public static void main(String[] args) {

		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}
}
