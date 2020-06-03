import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.Test;

class JunitStutterTest {

	@SuppressWarnings("static-access")
	@Test
	void test() {
		//fail("Not yet implemented");
		Stutter stu= new Stutter();
		Stack<Integer> s = new Stack<Integer>();
		assertTrue(s.isEmpty());
		
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(0);
		s.add(-1);
		
		assertTrue (s.peek() == -1);
		
		stu.stutter(s);
		
		assertEquals(14,s.size());
		System.out.println(s);
		
		while (!s.isEmpty()) {
			s.pop();
		}
	}

}
