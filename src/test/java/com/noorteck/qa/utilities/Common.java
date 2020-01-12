package com.noorteck.qa.utilities;

public class Common {
	
	//write a method that takes two string values and
	//return true if they are equal otherwise false
	
	/**
	 * 
	 * This compares two String values and return boolean value
	 * @param actualVal
	 * @param expectedVal
	 * @return
	 */
	
	public static boolean compareTwoValue (String actualVal, String expectedVal) {
	boolean result = false;
	
//	if (actualVal.equalsIgnoreCase(expectedVal)){
//		result = true;
//	}else {									THIS IS THE  WAY WE USUALLY DO.
//		result= false;
//	}
//	return result;
//	}

		try {
			if (actualVal.equalsIgnoreCase(expectedVal)) {
				result = true;
				System.out.println("Expected value:["+ expectedVal+"] and Actual Value:["+actualVal+"] is Equal");
			}	else {
				System.out.println("Expected value:["+ expectedVal+"] and Actual Value:["+actualVal+"] is not Equal");
			}
		} catch(Exception e) {
			System.out.println("Unable to compare two values" + e);
			e.printStackTrace();
		}
		return result;
	}
}
