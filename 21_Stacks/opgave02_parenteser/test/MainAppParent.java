package test;

import model.ArrayStack;

public class MainAppParent {

	public static void main(String[] args) {
		String string = "(3+{5{99{*}}[23[{67}67]]})";
		String string2 = "((3+{5{99{*}}[23[{67}67]]})";
		System.out.println(checkParenteses(string));
		System.out.println(checkParenteses(string2));
	}

	public static boolean checkParenteses(String s) {

		ArrayStack<Character> stackChar = new ArrayStack<Character>();
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '(':
				stackChar.push(s.charAt(i));
				break;
			case '{':
				stackChar.push(s.charAt(i));
				break;
			case '[':
				stackChar.push(s.charAt(i));
				break;

			case ')':
				if (stackChar.peek() == '(') {
					stackChar.pop();
				}
				break;
			case '}':
				if (stackChar.peek() == '{') {
					stackChar.pop();
				}
				break;
			case ']':
				if (stackChar.peek() == '[') {
					stackChar.pop();
				}
				break;
			}
		}
		if (stackChar.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
