package test;

import model.ArrayStack;

public class MainApp {

	public static void main(String[] args) {
		ArrayStack<Integer> stack = new ArrayStack<Integer>();
		stack.push(2);
		stack.push(4);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		stack.push(7);
		stack.push(10);
		System.out.println(stack.peek());

		System.out.println("Size: " + stack.size());
	}

}
