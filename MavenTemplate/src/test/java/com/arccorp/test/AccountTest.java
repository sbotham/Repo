
package com.arccorp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.arccorp.domain.Account;

public class AccountTest {
	@Test
	public void createAccount() {
		// log.info("Running createAccount test");

		System.out.println(" changed on master - 17JUN18");
		System.out.println("Running createAccount test, Starts");


		Account a = new Account("123", "Steves Account");
		assertEquals("Steves Account was created", true, a.getName().equalsIgnoreCase("Steves Account"));

		System.out.println("Running createAccount test, Ends");

	}

}
