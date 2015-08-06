package siemens.plm.bankaccountkata;

public class WithdrawTransaction {
	
	private BankAccount account;
	
	public WithdrawTransaction(BankAccount account)
	{
		this.account = account; 
	}
	
	public boolean Execute(int cents)
	{
		account.setBalance(account.getBalance() - cents);
		return true;
	}
}
