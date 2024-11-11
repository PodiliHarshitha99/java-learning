Interface Segregation Principle:
-  first principle that applies to Interfaces instead of classes in SOLID and it is similar to the single responsibility principle.
-  It states that "do not force any client to implement an interface which is not relevant to them".
-  The main goal is to focus on avoiding fat interface and give preference to many small client-specific interfaces.
-  Prefer client interfaces rather than one general interface and every interface should have a specific and single responsibility.


Deposit.java


package interfaceSegregationPrinciple;
public interface Deposit {
	
  void deposit(double amount);
	

}


Withddraw.java


package interfaceSegregationPrinciple;
public interface Withdraw {
	
	void withdraw(double amount);

}



TransferAmount.java


package interfaceSegregationPrinciple;
public interface TransferAmount {
	
  void transfer(double amount, String fromAcc, String toAcc);

}


BankService.java


package interfaceSegregationPrinciple;

public class BankService implements Deposit, Withdraw{

	@Override
	public void deposit(double amount) {
		System.out.println("Amount deposited: " +amount);
		
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Amount withdrawn: " +amount);
		
	}

}


BankManager.java

package interfaceSegregationPrinciple;
public class BankManager implements Deposit,Withdraw, TransferAmount{
  
  private double balance;
		
	@Override
	public void deposit(double amount) {
		
		if(amount > 0) {
      balance += amount;
			System.out.println("Amount deposited: " +amount);
		} else {
			System.out.println("Invalid amount");
		}
		
	}

	@Override
	public void withdraw(double amount) {
		  
    if(amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawing " +amount+ " from Checking account. New Balance: " +balance);
		} else {
			System.out.println("Insufficient funds");
		}
		
	}

	@Override
	public void transfer(double amount, String fromAcc, String toAcc) {
     System.out.println("Transfering " +amount+ " from " +fromAcc+ " to " +toAcc);
		
		
	
	}
	
	

}



BankOperations.java


package interfaceSegregationPrinciple;
  public class BankOperations {
	public static void main(String[] args) {
	  BankManager manager = new BankManager();
		
		manager.deposit(100.45);
		manager.transfer(100, "Savings account", "Checking account");
		
		manager.withdraw(10.07);
		
	}

}


