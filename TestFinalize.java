package com.vstl.javaExceptionHandling;

public class TestFinalize {

	public static void main(String[] args) {
		 
        // create Object of type FinalizeMethodExample
		// explicitly making null
        FinalizeMethod objfme = new FinalizeMethod();
        System.out.println("Finalize" +objfme.hashCode());
       
        objfme  = null;
        System.gc();
        System.out.println("End of Garbage Collection");
    }

}
