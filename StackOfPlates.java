package StacknQueue;
import java.util.*;
public class StackOfPlates {
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
