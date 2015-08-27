package siemens.plm.bankaccountkata.test;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;

import siemens.plm.bankaccountkata.AccountType;
import siemens.plm.bankaccountkata.BankAccount;
import siemens.plm.bankaccountkata.DepositTransaction;
import siemens.plm.bankaccountkata.ICollaborator1;
import siemens.plm.bankaccountkata.ICollaborator2;
import siemens.plm.bankaccountkata.ICollaborator3;
import siemens.plm.bankaccountkata.MyClass;

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

	@Test
	public void givenCollaborator1ReturnsLessThan0_WhenICallTheMethodIWantToTest_ThenCollaborator2ShouldReceiveValue() {

	    ICollaborator1 coll1 = mock(ICollaborator1.class);
	    ICollaborator2 coll2 = mock(ICollaborator2.class);
	    ICollaborator3 coll3 = mock(ICollaborator3.class);
	    int expectedValue = 2;

	    // Given
	    MyClass myObject = new MyClass(coll1, coll2, coll3);
	    myObject.SetValue(expectedValue);
	    when(coll1.Method1()).thenReturn(-2);

	    // When
	    myObject.BehaviorIWantToTest();

	    // Then
	    verify(coll2, times(1)).Method2(expectedValue);
	}
	
	@Test
    public void givenCollaborator1ReturnsLessThan0_WhenICallTheMethodIWantToTest_ThenTheResultShouldBeMinus1() {
		ICollaborator1 collaborator1 = mock(ICollaborator1.class);
		ICollaborator2 collaborator2 = mock(ICollaborator2.class);
		ICollaborator3 collaborator3 = mock(ICollaborator3.class);
    
		// Given
		MyClass myObject = new MyClass(collaborator1, collaborator2, collaborator3);
		when(collaborator1.Method1()).thenReturn(-2);

	    // When
	    int result = myObject.BehaviorIWantToTest();
	
	    // Then
	    assertEquals(-1, result);
	}
}
