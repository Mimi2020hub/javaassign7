/*
* Write a method isPalindrome that takes a queue of integers as a parameter
* and returns true if the numbers in the queue represent a palindrome (and 
* false otherwise). A sequence of numbers is considered a palindrome if it 
* is the same in reverse order. 
*/
import java.util.LinkedList;


import java.util.Queue;
import java.util.Stack;
public class isPalindrome {
	public static void main(String[] args) {
		Queue<Integer> q1=new LinkedList<Integer>();
		q1.add(1);
		q1.add(3);
		q1.add(2);
		q1.add(3);
		q1.add(1);
		System.out.println(isPalindrome(q1));
	}

	public static boolean isPalindrome(Queue<Integer> q) {
	    Stack<Integer> s = new Stack<Integer>();
	    
	    for (int i = 0; i < q.size(); i++) {
	        int num1 = q.remove();
	        q.add(num1);
	        s.push(num1);
	    }
	    
	    boolean b = true;
	    
	    for (int i = 0; i < q.size(); i++) {
	        int num1 = q.remove();
	        int num2 = s.pop();
	        if (num1 != num2) {
	            b = false;
	        }
	        q.add(num1);
	    }
	    
	    return b;
	}
}
