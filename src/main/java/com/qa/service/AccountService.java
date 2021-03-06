package com.qa.service;

import com.qa.exceptions.AccountNotFoundException;

public interface AccountService {
	
	String getAllAccounts();

	String createAccount(String account);

	String deleteAccount(int accountId) throws AccountNotFoundException;

	String updateAccount(int accountId, String account) throws AccountNotFoundException;

}
