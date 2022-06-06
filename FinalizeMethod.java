package com.vstl.javaExceptionHandling;

public class FinalizeMethod {

	    protected void finalize() throws Throwable {
	 
	        System.out.println("finalize() method invoked"
	                + " to clean-up Object resources");
	    }
	 
	    
	}
