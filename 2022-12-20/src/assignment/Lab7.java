package assignment;

import java.util.Scanner;

/*
상점에 가면 우리는 상품에 대한 돈을 내고 영수증을 받는다.
영수증에는 10% 부가세와 잔돈등이 인쇄되어 있다.
구입한 상품의 가격과 손님한테 받은 금액을 입력하면 부가세와 잔돈을 출력하는 프로그램을 작성하여 보자.
*/

public class Lab7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money, price, change;

		System.out.print("받은 돈 : ");
		money = sc.nextInt();

		System.out.print("상품 가격 : ");
		price = sc.nextInt();

		change = money - price;

		System.out.println("부가세 : " + price / 10);
		System.out.print("잔돈 : ");
		System.out.println((change > 0) ? change : "잔돈이 없습니다.");

		sc.close();
	}

}
