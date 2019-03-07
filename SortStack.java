package StacknQueue;
import java.util.*;
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
