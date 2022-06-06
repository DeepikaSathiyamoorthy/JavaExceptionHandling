package com.vstl.javaExceptionHandling;

public class TestMethodOverridingException {

	public static void main(String[] args) {
		
		MethodOverriddenExceptionHandling objTestCases = new MethodOverriddenTestcaseExcecution();
		
		try {
			objTestCases.sumofTestcases();
			//System.out.println("Arithmetic Exception is exist ");
			
			
		} catch (ArithmeticException arithmeticException) {
			
			System.out.println("Exception in Subclass ");
			System.out.println(arithmeticException.getMessage());
			
		}
		
	}

}
