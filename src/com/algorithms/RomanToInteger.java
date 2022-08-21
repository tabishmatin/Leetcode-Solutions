package com.algorithms;

/* Given a roman numeral, convert it to an integer. */

public class RomanToInteger {

	public static int romanToInt(String s) {

		int result = 0;

		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'I':
				result = result + 1;
				break;

			case 'V':
				if (i == 0)
					result = result + 5;
				if (i > 0) {
					if (s.charAt(i - 1) == 'I')
						result = result + 5 - 1 - 1;
					else
						result = result + 5;
				}
				break;

			case 'X':
				if (i == 0)
					result = result + 10;
				if (i > 0) {
					if (s.charAt(i - 1) == 'I')
						result = result + 10 - 1 - 1;
					else
						result = result + 10;
				}
				break;

			case 'L':
				if (i == 0)
					result = result + 50;
				if (i > 0) {
					if (s.charAt(i - 1) == 'X')
						result = result + 50 - 10 - 10;
					else
						result = result + 50;
				}
				break;

			case 'C':
				if (i == 0)
					result = result + 100;
				if (i > 0) {
					if (s.charAt(i - 1) == 'X')
						result = result + 100 - 10 - 10;
					else
						result = result + 100;
				}
				break;

			case 'D':
				if (i == 0)
					result = result + 500;
				if (i > 0) {
					if (s.charAt(i - 1) == 'C')
						result = result + 500 - 100 - 100;
					else
						result = result + 500;
				}
				break;

			case 'M':
				if (i == 0)
					result = result + 1000;
				if (i > 0) {
					if (s.charAt(i - 1) == 'C')
						result = result + 1000 - 100 - 100;
					else
						result = result + 1000;
				}
				break;
				
			default: System.out.println("Invalid Roman Numeral."); return 0;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		String s = "ZZZ";
		System.out.println(romanToInt(s));
	}
}
