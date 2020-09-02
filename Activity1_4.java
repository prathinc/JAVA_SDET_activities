package javaActivity1;

public class Activity1_4 {
	
	public static void printArray(int[] printArray) {
		System.out.println("Array Printing.....");
		for(int i=0;i<printArray.length;i++) {
			System.out.print(printArray[i]+" ");
		}
		System.out.println();
	}
	
	public static void sortArray(int[] sortArray) {
		for(int i =0;i<sortArray.length;i++) {
			
			for(int j=0;j<sortArray.length;j++) {
				int temp = sortArray[j];
				
				if(sortArray[j]>sortArray[i]) {
					sortArray[j]=sortArray[i];
					sortArray[i]=temp;
				}
			}
		}
		
		System.out.println("Sorted Array in Ascending order");
			for(int i=0;i<sortArray.length;i++) {
				System.out.print(sortArray[i]+" ");
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = new int[20];
		for(int i=0;i<intArray.length;i++)
		{
			intArray[i] = (int) (Math.random()*20);
		}
		printArray(intArray);
		sortArray(intArray);
		
		
		

	}
	
	

}
