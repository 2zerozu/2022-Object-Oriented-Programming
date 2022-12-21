package test;

import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("피자 종류를 입력하시오 : ");

		String model = sc.next();
		int price = 0;

		switch (model) {
		case "콤비네이션":
		case "슈퍼슈프림":
			price = 20000;
			break;

		case "포테이토":
			price = 15000;
			break;

		case "쉬림프":
			price = 25000;
			break;

		default:
			price = 0;
			break;
		}

		System.out.println(model + " 피자의 가격 = " + price);
		sc.close();
	}

}
