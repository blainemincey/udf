package com.jboss.teiid.udf;

import static org.junit.Assert.*;

import org.junit.Test;

public class HashFunctionsTest {

	@Test
	public void testHashCustomerID() {

		String customerID = "CST01010";
		
		long hash = HashFunctions.hashCustomerID(customerID);

                System.out.println("CustomerID: " + customerID);
                System.out.println("Hash      : " + hash);

		assertEquals("Incorrect hash value!",332371, hash);
	}

}
