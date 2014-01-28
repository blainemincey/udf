package com.jboss.teiid.udf;

/**
 * User-defined function example
 * 
 * @author bmincey
 *
 */
public class HashFunctions {
	
	/**
	 * 
	 * @param customerID
	 * @return
	 */
	public static long hashCustomerID(String customerID) {
		if (customerID == null) {
			return 0;
		}
		
		return calculateHash(customerID);
	}

	/**
	 * 
	 * @param input
	 * @return
	 */
	private static long calculateHash(String input) {
		long hash = 2L;
		int len = input.length();
		for (int i = 0; i < len; i++) {
			hash = (long) (3.141592637 * hash)
					+ new Character(input.charAt(i)).hashCode();
		}
		return hash;
	}
}