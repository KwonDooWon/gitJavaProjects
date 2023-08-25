package testProject;

public class BankAccountPo {
	int balance;
	String name;
	public BankAccountPo() {
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
	public BankAccountPo(int money,String n) {
		balance = money;
		name = n;
	}
	public  BankAccountPo(int money) {
		balance = money;
	}
}
