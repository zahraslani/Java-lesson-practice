package section1;

public class account {
	public account(int balance, String branch) {
		super();
		this.balance = balance;
		this.branch = branch;
	}
	public account(int balance) {
		super();
		this.balance = balance;
	}
	private int balance;
	private String branch;
	private boolean locked;
	private int lasttransaction;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	public int getLasttransaction() {
		return lasttransaction;
	}
	public void setLasttransaction(int lasttransaction) {
		this.lasttransaction = lasttransaction;
	}
	public void print() {
		System.out.println("balance is" + this.balance + "branch is" + this.branch + "locked" + this.locked + "lasttransaction" + this.lasttransaction);
	}
	public void withdraw(int number) {
		if (number>balance) {
			System.out.println("you do not have enough money");
		}else {
			balance -= number;
			System.out.println("new balance" + balance);
		}
		
	}
	public static void main(String[] args) {
		account customer1 = new account(100);
		customer1.withdraw(200);
		customer1.withdraw(30);
	  }
}


