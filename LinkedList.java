package LL1;

public class LinkedList {
	static class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;	
		}
		public Node (char val) {
			this.val = val;
		}
	}
	static Node head;
	static Node head1;
	static Node head2;
	static Node head3;
	static Node temp;
	/*Write code to remove duplicates from an unsorted linked list. */
	public void removeDup () {
		Node temp1 = head;
		Node temp2 = null;
		Node temp3 = null;
		
		while (temp1 != null && temp2.next != null) {
			temp2 = temp1;
			while (temp2.next != null) {
				if (temp1.val == temp2.next.val) {
					temp3 = temp2.next;
					temp2.next = temp2.next.next;
				}
				else
					temp2 = temp2.next;
			}
			temp1=temp1.next;
		}
		
	}
	/*  Implement an algorithm to find the kth to last element of a singly linked list */
	public Node printKth(int k) { 
		Node curr = head;
		Node temp = head;
		
		for (int i = 0; i<k ; i++) {
			if (curr == null) 
				return null;
			curr = curr.next;
		}
		while (curr.next!= null) {
			curr = curr.next;
			temp = temp.next;
		}
		return temp;
		
	}
	/*
	Partition: Write code to partition a linked list around a value x, such that all nodes less than
 	x come before all nodes greater than or equal to x. lf x is contained within the list, the values 
 	of x only need to be after the elements less than x (see below).The partition element x can appear
  	anywhere in the "right partition"; it does not need to appear between the left and right partitions.  */
	public static Node Partition (Node head, int x) {
		// Create Node to find 2-sub array
		Node smallerX = null;
		Node smallerHead = null;
		Node ebX = null;
		Node ebHead = null;
		
		while (head != null) {
			if (head.val < x) {
				if (smallerHead == null) {
					smallerHead = smallerX = head;
				} else {
					smallerX.next = head;
					smallerX = head;
				}
			}
			if (head.val == x || head.val > x) {
				if (ebHead == null) {
					ebHead = ebX = head;
				} else {
					ebX.next = head;
					ebX = head;
				}
			}
			head = head.next;
		}
		ebX.next = null;
		smallerX.next = ebHead;
		
		return smallerHead;
	} 
	static Node reverse(Node node) { 
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
    } 
	public static void addTwoNumbers (Node n1, Node n2) {

		int list1 = 0;
		int list2 = 0;
		
		while (n1 != null) {
			list1 = list1 * 10 + n1.val;
			n1 = n1.next;
		}
		while (n2 != null) {
			list2 = list2 * 10 + n2.val;
			n2 = n2.next;
		}
		int sum = list1 + list2;
		System.out.println("Sum is: " + sum);
		
	}
	/* Implement a function to check if a linked list is a palindrome. */
	public static boolean checkPalin (Node n1, Node n2) {

		while (n1 != null && n2 != null) {
			if (n1.val != n2.val) {
				return false;
			}
			else {
				n1 = n1.next;
				n2 = n2.next;
			}
		}
		return true;
		
	}
	/*
	Intersection: Given two (singly) linked lists, determine if the two lists intersect. Return the inter- secting
 	node. Note that the intersection is defined based on reference, not value. That is, if the kth node of the first
  	linked list is the exact same node (by reference) as the jth node of the second linked list, then they are
   	intersecting. */
	public static int Intersection (Node n1, Node n2) {
		Node temp = n2;
		while (n1 != null) {
			while(temp!= null) {
				if (temp.val != temp.val) {
					temp = temp.next;
				}
				else {
					return temp.val;
				}
			}
			temp = n2;
			n1 = n1.next;
		}
		return -1;
	}
	static void printList(Node head)  {
	 
	    Node temp = head;  
	    while (temp != null)  
	    {  
	        System.out.print(temp.val + " ");  
	        temp = temp.next;  
	    }  
	} 
	public static void main(String[] args)  
	{  
		LinkedList list = new LinkedList();
	    Node head = new Node(12);  
	    head.next = new Node(6);  
	    head.next.next = new Node(4);  
	    head.next.next.next = new Node(2);  
	    head.next.next.next.next = new Node(4);  
	    head.next.next.next.next.next = new Node(10);  
	  
	    int x = 6;  
	    printList(head);
	    System.out.println("");
	    head = Partition(head, x);  
	    printList(head); 
	    
	    list.head1 = new Node(7); 
        list.head1.next = new Node(5); 
        list.head1.next.next = new Node(9); 
        list.head1.next.next.next = new Node(4); 
        list.head1.next.next.next.next = new Node(6);
        
        list.head2 = new Node(8); 
        list.head2.next = new Node(4);
        
        System.out.println("");
        
        head1 = list.reverse(head1);
        head2 = list.reverse(head2);
        addTwoNumbers(head1,head2);
        
        list.head3 = new Node('r'); 
        list.head3.next = new Node('a'); 
        list.head3.next.next = new Node('d'); 
        list.head3.next.next.next = new Node('a'); 
        list.head3.next.next.next.next = new Node('r');
        
        temp = list.reverse(head3);
        
        if (checkPalin(temp,head3) == true) {
        	System.out.println("It is palindrome");
        }
        else {
        	System.out.println("It's not palindrome");
        }
        
        System.out.println(Intersection(head1,head2));
	}
}

