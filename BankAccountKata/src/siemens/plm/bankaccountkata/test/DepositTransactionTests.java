package siemens.plm.bankaccountkata.test;

import static org.junit.Assert.*;

import org.junit.Test;

import siemens.plm.bankaccountkata.AccountType;
import siemens.plm.bankaccountkata.BankAccount;
import siemens.plm.bankaccountkata.DepositTransaction;

public class DepositTransactionTests {

	@Test
	public void givenAnAccountWith$1AndNoRules_WhenIDeposit$1_ThenBalanceShouldBe$2() {
		
    // Given
	BankAccount account = new BankAccount(AccountType.CheckingAccount);
	account.setBalance(100);

	// When
	DepositTransaction depositIntoAccount = new DepositTransaction(account);
	depositIntoAccount .Execute(100);

	// Then
	assertEquals(200, account.getBalance());
	}
}