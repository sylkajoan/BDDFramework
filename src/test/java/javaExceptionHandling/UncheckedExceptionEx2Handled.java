package javaExceptionHandling;

public class UncheckedExceptionEx2Handled {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
		/**
		 * We suspect that this block of statement can throw 
		 * exception so we handled it by placing these statements 
		 * inside try and handled the exception in catch block.
		 */
			
		int total = 10/0;
		
		System.out.println("Total: " + total);
	}catch (ArithmeticException e) { //e is an object name
		/**
		 * This block will only execute if any arithmetic exception 
		 * occurs in try block. 
		 */
		System.out.println("You should not divide a number by zero: " + e);
		}
		System.out.println("Outside try catch block");
	}
}
