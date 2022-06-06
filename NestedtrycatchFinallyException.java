package com.vstl.javaExceptionHandling;

public class NestedtrycatchFinallyException {

	
	//Nested try-catch and Finally
	@SuppressWarnings("null")
	public void nestedTryCatchException() {
		
		int intAge = 25;
		String strFirstName= "Siva";
		String strLastName = null;
		int intNameLength;
		
		try {
			//int intName = Integer.parseInt(strFirstName);
			//System.out.println(intName);
			if(strFirstName!=null)
			System.out.println(strFirstName);
			try {
				//intNameLength = (strFirstName.length()+strLastName.length());
				//System.out.println(intNameLength);
					intNameLength = (strFirstName.length());
					System.out.println("Length of Name: "+intNameLength);
				try {
					int intYearsOfExperience =0;
					int intAgewhenstartedWork = intAge/intYearsOfExperience;
					intNameLength = (strFirstName.length()+strLastName.length());
					System.out.println("Name Length : " +intNameLength + intAgewhenstartedWork);
				} catch (ArithmeticException arithmeticExcp) {
					System.out.println("Arithmetic Inner Block : "+arithmeticExcp.getMessage());
				} 
				finally {
					System.out.println("Employee : " +strFirstName+ " is "+intAge+ " years Now" );
				}
			} catch (NullPointerException nullPtrException) {
				System.out.println("NullPointer Exception : " +nullPtrException.getMessage());
			}
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			System.out.println(strFirstName+ " is eligible for work");
		}
	}
	
}
