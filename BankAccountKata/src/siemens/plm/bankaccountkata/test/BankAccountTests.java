package siemens.plm.bankaccountkata.test;

import static org.junit.Assert.*;

import org.junit.Test;

import siemens.plm.bankaccountkata.AccountType;
import siemens.plm.bankaccountkata.BankAccount;

public class BankAccountTests {

	@Test
	public void givenANewBankAccount_BalanceShouldBe$0() {
		BankAccount account = new BankAccount(AccountType.CheckingAccount);
		assertEquals(0, account.getBalance());
	}
	
	@Test
	public void whenISetTheBalanceTo$1_ThenBalanceShouldBe$1() {
		BankAccount account = new BankAccount(AccountType.CheckingAccount);
		account.setBalance(100);
		assertEquals(100, account.getBalance());
	}
	
	@Test
	public void whenISetTheBalanceTo$Minus1_ThenBalanceShouldBe$Minus1() {
		BankAccount account = new BankAccount(AccountType.CheckingAccount);
		account.setBalance(-100);
		assertEquals(-100, account.getBalance());
	}
	
	@Test
	public void whenISetTheBalanceTo$0_ThenBalanceShouldBe$0() {
		BankAccount account = new BankAccount(AccountType.CheckingAccount);
		account.setBalance(0);
		assertEquals(0, account.getBalance());
	}

	@Test
	public void givenASavingBankAccount_ItsTypeShouldBeSavings() {
		BankAccount account = new BankAccount(AccountType.SavingsAccount);
		assertEquals(AccountType.SavingsAccount, account.getType());
	}
}
