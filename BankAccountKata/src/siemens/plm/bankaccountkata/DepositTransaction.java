package siemens.plm.bankaccountkata;

public class DepositTransaction {
	
	private BankAccount account;
	
	public DepositTransaction(BankAccount account)
	{
		this.account = account; 
	}
	
	public boolean Execute(int cents)
	{
		account.setBalance(account.getBalance() + cents);
		return true;
	}
}