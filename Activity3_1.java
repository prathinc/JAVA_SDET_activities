package javaActivity3;

import java.util.ArrayList;

public class Activity3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating arrayList variable
		ArrayList<String> myList = new ArrayList<String>();
		
		//Adding objects to arrayList
		
		myList.add("India");
		myList.add("America");
		myList.add("England");
		myList.add("China");
		myList.add(4, "Sweden");
		
		//Print ArrayList
		System.out.println(myList);
		
		//Printing arrayList using for loop
		for(String printList:myList) {
			System.out.println(printList);
		}
		
		//To get size of arrayList
		System.out.println("Size of myList :"+myList.size());
		
		//To get 3rd element
		System.out.println("Element at 3rd position in myList :"+myList.get(3));
		
		//To check if list contains England
		System.out.println("Does myList contains England :"+myList.contains("England"));
		
		//To remove element from arrayList
		myList.remove(2);
		
		//To know size of arrayList
		System.out.println("Size of myList after removing 2nd element :"+myList.size());
		
		
		
		
		
		
		
		
		

	}

}
