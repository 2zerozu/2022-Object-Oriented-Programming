package assignment;

/*
문제 1 : 은행 계좌를 나타내는 BankAccount 클래스는 잔액을 balance 필드를 가지고 있다. 
생성자, 설정자, 접근자도 추가하라. 
이 클래스에 계좌 간 이체 기능을 수행하는 메소드 transfer(int amount, BankAccount otherAccount)를 추가하고 테스트하라. 
transfer()는 현재 객체의 잔액에서 amount만큼을 otherAccount 계좌로 송금한다.
*/

class BankAccount {
	private int balance;

	BankAccount(int n) {
		this.balance += n;
	}

	public int getBankAccount() {
		return this.balance;
	}

	public void setBankAccount(int n) {
		this.balance += n;
	}

	public String toString() {
		return "[" + this.balance + "]";
	}

	public void transfer(int amount, BankAccount otherAccount) {
		this.balance = this.balance - amount;
		otherAccount.balance += amount;
	}

}

public class Lab1 {

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(10000);
		BankAccount a2 = new BankAccount(0);
		System.out.println("a1: " + a1);
		System.out.println("a2: " + a2 + "\n");
		a1.transfer(1000, a2);
		System.out.println("a1: " + a1);
		System.out.println("a2: " + a2);

	}

}
