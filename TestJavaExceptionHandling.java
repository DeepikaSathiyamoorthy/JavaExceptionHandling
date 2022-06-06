package com.vstl.javaExceptionHandling;

public class TestJavaExceptionHandling {

	public static void main(String[] args) {
		
		JavaExceptionHandling objExceptionHandling = new JavaExceptionHandling();
		objExceptionHandling.arrayOutOfBoundException(4);
		System.out.println("------------------------");
		
		objExceptionHandling.arithmeticException();
		System.out.println("------------------------");
		
		objExceptionHandling.numberFormatException();
		System.out.println("------------------------");
		
		objExceptionHandling.nullPointerException();
		System.out.println("------------------------");
		
		objExceptionHandling.throwIOException();		
		System.out.println("---------------------------"); 
		
	}

	}
