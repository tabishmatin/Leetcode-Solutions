package com.algorithms;

public class PalindromeNumber {
	
    public static boolean isPalindrome(int x) {
        
        int rev = 0;
        
        for(int i=x; i>0; i/=10)
            rev = rev * 10 + (i%10);
        
        return rev==x ? true : false;
    }

	public static void main(String[] args) {
		
		int x = 121;
		System.out.println(isPalindrome(x));
	}
}