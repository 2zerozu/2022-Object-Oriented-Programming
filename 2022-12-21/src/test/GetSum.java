package test;

import java.util.Scanner;

public class GetSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		while (num != -1) {
			sum += num;
			System.out.print("정수를 입력하시오 : ");
			num = sc.nextInt();
		}
		System.out.println("정수의 합은 " + sum + "입니다.");

		sc.close();
	}

}
