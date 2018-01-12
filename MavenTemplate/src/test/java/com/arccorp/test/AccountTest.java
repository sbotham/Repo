package com.arccorp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.arccorp.domain.Account;

public class AccountTest {
	  @Test
	    public void createAccount(){
	        Account a = new Account("123", "Steves Account");
	        assertEquals("Steves Account was created", true, a.getName().equalsIgnoreCase("Steves Account"));
	        
	    }

}
