package JavaActivity3_3a;

import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3a {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0;i<5;i++) {
			q.add(i+1);
		}
		System.out.println("Elements in the queue are: " + q);
		System.out.println("Elements in the queue after head is removed: " + q.remove());
		System.out.println("Updated head of the queue is: " + q.peek());
		System.out.println("Size of the queue is: " + q.size());
	}
}
