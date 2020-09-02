package javaActivity1;

public class Activity1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = {10, 77, 10, 54, -11, 10};
		int sum =0;
		
		for(int i =0; i<intArray.length;i++) {
			
			if(intArray[i] ==10)
			{
				sum = sum+intArray[i];
			}
		}
		if (sum==30) {
			System.out.println("Sum of 10's in integer array ="+sum);
		}
		else {
			System.out.println("Sum is not 30");
		}

	}

}
