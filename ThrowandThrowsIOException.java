package com.vstl.javaExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


//Throws and throw Exception Handling
	//IOException
public class ThrowandThrowsIOException {
			
	int intPrinciple = 20000;
	int intInterrestpaid = 0;
	
	@SuppressWarnings("resource")
		public boolean throwandthrowsIOException() throws FileNotFoundException {
		
		System.out.println("IO Exception Handling");
		
		FileReader fileReader = new FileReader("E:\\TimeSheets\\Name_Timesheet_Month_2022");
		
		BufferedReader fileInput = new BufferedReader(fileReader);
		System.out.println("File " +fileInput);
		
		throw new FileNotFoundException();

}
	
}
		
	/*	try (BufferedReader fileInput = new BufferedReader(fileReader)) {
			System.out.println("File "+fileInput);
		} catch (FileNotFoundException filenotfound) {
			
			throw filenotfound;
			
		} catch (IOException ioException) {
		
			ioException.getMessage();
		}
		
		throw new FileNotFoundException(); */
		
		
		
