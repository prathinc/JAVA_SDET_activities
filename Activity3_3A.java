package javaActivity3;

import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		//Add Element
		for(int i=1; i<6; i++) {
			q.add(i);
		}
		
		//Display Q
		System.out.println("Q Contains :"+q);
		
		//Remove a number in the Queue using the remove() method
		System.out.println("Removed Element :"+q.remove(1));
		
		//Peek() at the first number in the Queue after removal
		System.out.println("1st num of Q :"+q.peek());
		
		//Print the size of the Queue using the size() method.
		System.out.println("Size of Q :"+q.size());
		
		//Print the updated Queue
		System.out.println("Update Q :"+q);

	}

}
