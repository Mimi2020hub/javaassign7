import java.util.LinkedList;

import java.util.Queue;
import java.util.Stack;

public class Stutter {
	public static void main(String[] args) {
		Stack<Integer> s1= new Stack<Integer> ();
		s1.push(1);
		s1.push(3);
		s1.push(5);
		System.out.println(s1);
		stutter(s1);
		System.out.println(s1);
		
	}
	

	public static Stack<Integer> stutter(Stack<Integer> s){
		Queue<Integer> q = new LinkedList<Integer>();
		
		while (!s.isEmpty()){
			int num=s.pop();
			q.add(num);
			q.add(num);
		}
		
		while (!q.isEmpty()) {
			s.push(q.remove());
		}
		
		while (!s.isEmpty()) {
			q.add(s.pop());
		}
		while (!q.isEmpty()) {
			s.push(q.remove());
		}
		return s;
	}
}
