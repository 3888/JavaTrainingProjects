package android.study.TestTasks.Roulette;
public class MoneyBalance {

	private int balance = 100;
	
	public int getBalance() 
	{
		return balance;
	}
	
		
	
	public int getBalanceWin() 
	{
		balance = balance + 10;
		return balance;
	}

	
	public int getBalanceLoose() 
	{
		balance = balance - 5;
		return balance;
	}
}