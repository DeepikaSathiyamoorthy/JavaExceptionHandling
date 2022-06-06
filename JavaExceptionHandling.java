package com.vstl.javaExceptionHandling;

import java.io.FileNotFoundException;
import java.util.Random;

public class JavaExceptionHandling extends ThrowandThrowsIOException {
	
	//ArrayOutOfBound Exception
	//try-catch block Exception Handling
	public void arrayOutOfBoundException(int intLength) {
		
		Random random = new Random();
		String strCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZqwertyuiopasdfghjklzxcvbnm";
		String randomstring = "";
		
		try {
		char[] charText = new char[intLength];
		//Loop is less than orequals to the array length, 
		//where actual length is less than one as array index starts from 0
		for (int intIndex = 0; intIndex<=intLength; intIndex++) {
			charText[intIndex] = strCharacters.charAt(random.nextInt(strCharacters.length()));
			randomstring = randomstring +charText[intIndex];
			}
		System.out.println("Array OutOfBound Exception is " +randomstring);
			} catch (ArrayIndexOutOfBoundsException arrayoutofboundException) {
				System.out.println("Array OutOfBound Exception is :" +arrayoutofboundException.getMessage());
			}
	}
	
	//try-Multiple catch Blocks Exception Handling
	//NumberFormat Exception
	public void numberFormatException() {
		
		String stringweight = "ABC"; // it should be stringweight = "ABC"
				
		try {
			int intweight = Integer.parseInt(stringweight);
	
			if(intweight == 70) {
				System.out.println("Weight is " + intweight);
			} else {
				System.out.println("Type conversion is not happened");
				}
			} 
		catch (ArrayIndexOutOfBoundsException arrayoutofboud) {
			System.out.println("ArrayOut OfBound Exception");
		}
		catch (NumberFormatException exception) {
			
			System.out.println("NumberFormat Exception Message: " +exception.getMessage());
		//exception.printStackTrace();
			}
		catch (NullPointerException nullPointer) {
			System.out.println("Null Pointer Exception");
			}
	}
	
	//Try Catch Exception Handling
	//ArithmeticException
	public void arithmeticException() {
		
		try {
			
			double doubleCapital = 10000;
			int intTenure = 0;

			double doubleRepaymentPerMonth = doubleCapital/(double)intTenure;
		System.out.println("ArithMethic Exception for Dobule :  " +doubleRepaymentPerMonth);
		}
		catch (ArithmeticException exeArithmeticException) {
			
			System.out.println("Arithmetic Exception Message : "+exeArithmeticException.getMessage());
			System.out.println(exeArithmeticException.getLocalizedMessage());
			exeArithmeticException.printStackTrace();
			}
	}

	//NullPointer Exception
	@SuppressWarnings("null")
	public void nullPointerException() {
	
		try {
		String strUseName = null;
		int intstrNameLength = strUseName.length();
		
		System.out.println(intstrNameLength);
	} catch (NullPointerException nullPointerexception) {
		System.out.println("Null Pointer Exception is : " +nullPointerexception.getMessage());
	}
	}
	
	//Throws and throw Exception Handling
	//IOException
	public void  throwIOException() {
		ThrowandThrowsIOException objThrowandThrows = new ThrowandThrowsIOException();
		try {
			objThrowandThrows.throwandthrowsIOException();
			
		} catch (FileNotFoundException fileNotFound) {
			System.out.println("IO Exception with Throws and Throw" +fileNotFound.getMessage());
		
		}
	}


	
}
	
















