package javaExceptionHandling;

public class UncheckedExceptionExample1HandleExc {
	public static void main(String[] args) {
		String str = null;
		
		try {
			System.out.println(str.length());
			
		}catch (Exception e) {
			System.out.println("Exception Occured: " + e);
			e.printStackTrace();
		}
	}
}
