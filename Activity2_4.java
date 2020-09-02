package javaActivity2;

public class Activity2_4 {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		
		try {
			Activity2_4.exceptionTest("Will print to console");
			Activity2_4.exceptionTest(null);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			System.out.println("Inside catch block\n"+e.getMessage()); 
		}
		
	}
	
	public static void exceptionTest(String message) throws CustomException {
		if(message ==null) {
			throw new CustomException("String value is null");
		}
		else {
			System.out.println("Exception is :"+message);
		}
	}

}
