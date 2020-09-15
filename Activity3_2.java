package javaActivity3;

import java.util.HashSet;

public class Activity3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating new hashSet
		HashSet<String> hs = new HashSet<String>();
		
		//adding 6 objects to hashSet
		hs.add("Delhi");
		hs.add("Mumbai");
		hs.add("Kolkata");
		hs.add("Bangalore");
		hs.add("Chennai");
		hs.add("Kochi");
		
		//printing hashSet
		System.out.println("Hash Set");
		System.out.println(hs);
		
		//size of hashSet
		System.out.println("Size of hash set :"+hs.size());
		
		//Remove an element using the remove() method
		hs.remove("Kolkata");
		
		//Also try to remove an element that is not present in the Set.
		if(hs.remove("Hyderabad")) {
			System.out.println("Hyderabad removed from set");
		}
		else {
			System.out.println("Hyderabad not found in set");
		}
		
		//Use the contains() method to check if an item is in the Set or not.
		System.out.println("Set conatins Kochi :"+hs.contains("Kochi"));
		
		//Print the updated set
		System.out.println("Update set ");
		for(String newSet : hs) {
			System.out.println(newSet);
		}
		
		
		
		
		

	}

}
