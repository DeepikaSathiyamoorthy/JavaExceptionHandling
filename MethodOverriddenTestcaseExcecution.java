package com.vstl.javaExceptionHandling;

public class MethodOverriddenTestcaseExcecution extends MethodOverriddenExceptionHandling{
	
public void sumofTestcases() throws ArithmeticException{
		
		System.out.println("Arithmetic Exception of Sub Class ");
		
	 int intTestcasesRun= 10;
	 int intTestExcecuted = 0;
	 int intTotalTestcases = intTestcasesRun/intTestExcecuted;
	 
	 if (intTotalTestcases<=10) {
		 System.out.println("TestcasesExecution is not completed.");
	 } 
	
	}

}
