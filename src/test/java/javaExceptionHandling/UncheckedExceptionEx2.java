package javaExceptionHandling;

public class UncheckedExceptionEx2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		/**
		 * Since er are dividing an integer with 0
		 * it should throw arithmaticException
		 */
		
		int total = 10/0;
		
		System.out.println(total);
	}
}
