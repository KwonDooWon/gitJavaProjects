package testProject;

public class MainStart {
	public static void main(String[] args) {
		BankAccountPo choi1 = new BankAccountPo();
		BankAccountPo choi2 = new BankAccountPo(1000);
		BankAccountPo choi3 = new BankAccountPo(1000,"지원");
		
		choi1.deposit(1000);
		
		choi1.checkMyBalance();
	}
}
