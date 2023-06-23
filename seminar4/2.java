//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

class Solution {
    public boolean isValid(String s) {
		Stack<Character> St = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '[')
				St.push(']');
			else if (c == '{')
				St.push('}');
			else if (c == '(')
				St.push(')');
			else if (St.isEmpty() || St.pop() != c)
				return false;
		}
		return St.isEmpty();
	}
}
