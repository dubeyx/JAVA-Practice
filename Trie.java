package New;
import java.util.*;
public class Trie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(90);
		pq.add(1);
		pq.add(7);
		pq.add(56);
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		System.out.println("hello");

	}

}
