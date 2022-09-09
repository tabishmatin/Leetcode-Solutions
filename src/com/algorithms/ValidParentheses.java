package com.algorithms;

import java.util.Stack;

public class ValidParentheses {
	
	public static boolean isValid(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(char ch : s.toCharArray())
		{
			if ((ch=='{' || ch=='[' || ch=='('))
				stack.push(ch);
			else if (stack.isEmpty())
				return false;
			else
			{
				char top = stack.peek();
				if ((ch=='}' && top=='{') || (ch==']' && top=='[') || (ch==')' && top=='('))
					stack.pop();
				else
					return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		
		String s = "()[]{}";
		System.out.println(isValid(s));
	}
}
