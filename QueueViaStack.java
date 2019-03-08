package StacknQueue;
import java.util.*;
/* Write a program to sort a stack such that the smallest items are on the top. You can use an additional 
temporary stack, but you may not copy the elements into any other data structure (such as an array). The 
stack supports the following operations: push, pop, peek, and isEmpty*/
public class QueueViaStack {
	static class Queue { 
		static Stack<Integer> s1 = new Stack<Integer>();  
	    static Stack<Integer> s2 = new Stack<Integer>(); 
	    
	    public void enQueue (int x) {
	    	s1.push(x);
	    }
	    
	    public int deQueue () {
	    	int x;
	    	if (s2.isEmpty()) { 
	            while (!s1.isEmpty()) { 
	                s2.push(s1.pop()); 
	            } 
	        } 
	        x = s2.pop(); 
	        return x; 
	    }
	}
	public static void main(String[] args)  {  
	    Queue q = new Queue();  
	    q.enQueue(1);  
	    q.enQueue(2);  
	    q.enQueue(3);  
	  
	    System.out.println(q.deQueue());  
	    System.out.println(q.deQueue()); 
	    System.out.println(q.deQueue()); 
		}  
	


	
 }
