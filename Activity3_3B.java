package javaActivity3;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Activity3_3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating Deque type obj
		Deque<String> dq = new LinkedList<String>();
		
		//add elements to dq
		dq.add("Tiger");
		dq.addFirst("Lion");
		dq.addLast("Wolf");
		
		//add element using offer
		dq.offer("Monkey");
		dq.offerFirst("Hyena");
		dq.offerLast("Leopard");
		
		//Print elements using Iterator
		Iterator<String> iterator = dq.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Peek Elements
		System.out.println("First Element in DQ :"+dq.peekFirst());
		System.out.println("Last Element in DQ :"+dq.peekLast());
		
		//Print Element after peek
		System.out.println("Elements after Peek :"+dq);
		
		//Remove first and Last Element
		dq.removeFirst();
		dq.removeLast();
		
		//Check if DQ contains Wolf
		System.out.println("Does DQ contains Wolf :"+dq.contains("Wolf"));
		
		//Print Elements after removing
		System.out.println("Updated DQ :"+dq);
		System.out.println("Size of DQ after removing elements :"+dq.size());
		
	}

}
