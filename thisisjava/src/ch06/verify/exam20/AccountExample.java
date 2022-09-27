package ch06.verify.exam20;

public class AccountExample {
	public static void main(String[] args) {
		Account1[] accounts = new Account1[10];// [A][A][null][null][null][null][null][null][null][null]
		accounts[0] = new Account1("111-111", "홍길동", 10000);
		accounts[1] = new Account1("111-222", "일지매", 20000);

		for (int i = 0; i < accounts.length; i++) {
			Account1 account = accounts[i];
			if (account != null) {
				if (account.getAno().equals("111-111")) {
					account.setBalance((account.getBalance() - 3000));
					System.out.println("출금 성공");
				}
			}
		}
	}
}

class Account1 {
	private String ano1;
	private String owner1;
	private int balance1;

	public Account1(String ano1, String owner1, int balance1) {
		this.ano1 = ano1;
		this.owner1 = owner1;
		this.balance1 = balance1;
	}

	public int getBalance() { 		return balance1;	}
	public void setBalance(int balance) {		this.balance1 = balance;	}
	public String getAno() {		return ano1;	}
	public String getOwner() {		return owner1;	}
}