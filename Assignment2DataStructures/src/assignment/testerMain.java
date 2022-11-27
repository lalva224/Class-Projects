package assignment;
import assignment.Deque;
public class testerMain {

	public static void main(String[] args) {
		Deque dq = new Deque();
		dq.addToFront(2);
		dq.addToFront(3);
		dq.addToBack(5);
		System.out.println(dq);
		
		
		System.out.println(dq.getFront());

	}

}
