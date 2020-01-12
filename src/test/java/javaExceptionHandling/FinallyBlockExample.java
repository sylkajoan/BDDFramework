package javaExceptionHandling;

public class FinallyBlockExample {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("First statement of try block");
			int num = 45 / 0;
			System.out.println(num);

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");

		} finally {
			System.out.println("Finally block");

		}

		System.out.println("Out of try-catch-finally block");
	}
}
