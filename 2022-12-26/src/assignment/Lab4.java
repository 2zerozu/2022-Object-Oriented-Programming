package assignment;

import java.util.Scanner;

/*
ATM을 자바 프로그램으로 구현해보자. 
카드를 사용하는 ATM이라고 가정한다. 
기본적으로 필요한 클래스는 계좌를 나타내는 Account클래스이다. 
deposit() withdraw() 메소드를 만들어 다음과 같이 실행되도록 하시오.
*/

class Account {
	private int pin = 1234;
	private int money;
	private int account;

	public int getPin() {
		return pin;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int m) {
		this.money = m;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int a) {
		this.account = a;
	}

	public void deposit(int m) { // 예금
		this.money += m;
	}

	public void withdraw(int t) { // 인출
		this.money -= t;
	}

	public void transfer(int m, Account a) {
		this.money -= m;
		a.money += m;
	}
}

public class Lab4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a1 = new Account();
		Account a2 = new Account();

		while (true) {
			System.out.print("PIN을 입력하시오 : ");
			int pin = sc.nextInt();
			if (a1.getPin() != pin) {
				System.out.println("PIN이 잘못되었습니다.");
			} else {
				break;
			}
		}

		while (true) {
			System.out.print("1. 현금 입금 \n2. 현금 인출 \n3. 계좌이체 \n4. 종료 \n번호를 선택하세요 : ");
			int input = sc.nextInt();
			int money, account;
			switch (input) {
			case 1:
				System.out.print("입금액 : ");
				money = sc.nextInt();
				a1.deposit(money);
				System.out.println("현재 잔액은 " + a1.getMoney() + "원입니다.");
				break;

			case 2:
				System.out.print("인출액 : ");
				money = sc.nextInt();
				a1.withdraw(money);
				System.out.println("현재 잔액은 " + a1.getMoney() + " 원입니다.");
				break;

			case 3:
				System.out.print("이체액 : ");
				money = sc.nextInt();
				System.out.print("이체 계좌번호 : ");
				account = sc.nextInt();
				a1.transfer(money, a2);
				System.out.println("현재 잔액은 " + a1.getMoney() + " 원입니다.");
				System.out.println(account + "님의 현재 잔액은 " + a2.getMoney() + "원입니다.");
				break;

			case 4:
				return;
			}
		}
	}

}
