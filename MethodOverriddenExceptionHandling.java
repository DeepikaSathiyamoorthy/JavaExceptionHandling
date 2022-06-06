package com.vstl.javaExceptionHandling;

public class MethodOverriddenExceptionHandling {

	public void sumofTestcases() throws ArithmeticException{
		
		System.out.println("ArithmeticException of Parent Class ");
		
	 int intTestScenarioOne = 10;
	 int intTestScenarioTwo = 5;
	 int intTotalTescases = intTestScenarioOne/intTestScenarioTwo;
	 
	 if (intTotalTescases<=10) {
		 System.out.println("Testcases are not completed.");
	 } 
	
	}
	
}
