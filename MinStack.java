package StacknQueue;

public class MinStack {
	class Node {
		int val;
		int min;
		Node next;
		
		public Node (int val) {
			this.val = val;
			this.min = val;
		}
	}
	Node top;
	
	public void push (int val) {
		if (top == null) {
			top = new Node (val);
		} else {
			Node node = new Node(val);
			node.next = top;
			node.min = Math.min(top.min, val);
			top = node;
		} 
	}
	
	public void pop() {
		top = top.next;
	}
	
	public int top() {
		return top.val;
	}
	
	public int getMin() {
		if (top == null) {
			return Integer.MAX_VALUE;
		}
		return top.min;
	}
	public static void main(String args[])
	{
		MinStack mStack = new MinStack();
		mStack.push(7);
		mStack.push(8);
		mStack.push(3);
		mStack.push(9);
		mStack.push(5);
		mStack.push(2);
		System.out.println(mStack.getMin());
		mStack.pop();
		mStack.pop();
		System.out.println(mStack.getMin());
	}
}
