
package com.arccorp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.arccorp.domain.Account;

public class AccountTest {
	@Test
	public void createAccount() {
		// log.info("Running createAccount test");
		System.out.print(" changed on master - 12JUN18 (9.38PM)");
		System.out.print("Running createAccount test, Starts");

		Account a = new Account("123", "Steves Account");
		assertEquals("Steves Account was created", true, a.getName().equalsIgnoreCase("Steves Account"));

		System.out.print("Running createAccount test, Ends");

	}

}
