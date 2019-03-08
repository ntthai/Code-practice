package StacknQueue;
import java.util.*;
/* Write a program to sort a stack such that the smallest items are on the top. You can use an additional 
temporary stack, but you may not copy the elements into any other data structure (such as an array). The 
stack supports the following operations: push, pop, peek, and isEmpty*/
public class SortStack {
	
	public static Stack<Integer> sortedStack(Stack<Integer>list) {
		Stack<Integer> s2 = new Stack<Integer>();
		while(!list.isEmpty()) {
			int temp = list.pop();
			
			while (!s2.isEmpty() && s2.peek() > temp) {
				list.push(s2.pop());
			}
			s2.push(temp);
		}
		return s2;
	}
	public static void main(String args[]) 
    { 
        Stack<Integer> list = new Stack<Integer>(); 
        list.push(13);
        list.push(20);
        list.push(70);
        list.push(16);
        list.push(100);
      
        
        Stack<Integer> s2=sortedStack(list); 
        System.out.print("Sorted numbers are: "); 
      
        while (!s2.isEmpty()) 
        { 
            System.out.print(s2.pop()+ " "); 
        }  
    } 
}
