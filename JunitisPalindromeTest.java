import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Test;

class JunitisPalindromeTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		isPalindrome i=new isPalindrome();
		Queue<Integer> q2=new LinkedList<Integer>();
		q2.add(-1);
		q2.add(3);
		q2.add(2);
		q2.add(3);
		q2.add(-1);
		
		
		assertTrue (q2.peek() == -1);
		i.isPalindrome(q2);
		
		assertEquals(5,q2.size());
		System.out.println(q2);
		
		while (!q2.isEmpty()) {
			q2.remove();
		}
	}

}
