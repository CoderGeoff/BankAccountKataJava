package siemens.plm.bankaccountkata;

public class BankAccount {
	private AccountType type;
	private int balance;
	
	public BankAccount(AccountType type)
	{
		this.type = type;
		this.balance = 0;
	}
	
	public AccountType getType() { return type; }
	public int getBalance() { return balance; }
	public void setBalance(int cents) { balance = cents; }
}
