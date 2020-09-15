package javaActivity4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity4_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner newScanner = new Scanner(System.in);
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		Random randumNum = new Random();
		
		System.out.println("Enter list of integer values :");
		System.out.println("Enter non Interger value to terminate");
		while(newScanner.hasNextInt()) {
		    newArray.add(newScanner.nextInt());
		}
		Integer num[] = newArray.toArray(new Integer[0]);
		System.out.println("Printing Array...");
		for(int printArray : newArray) {
			System.out.print(printArray+" , ");
		}
		System.out.println();
		
		int index = randumNum.nextInt(newArray.size());
		System.out.println("Integer at position "+index+" is "
				+num[index]);
		
		newScanner.close();

	}

}
