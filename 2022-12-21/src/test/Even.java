package test;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		System.out.print("정수를 입력하시오 : ");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("입력된 정수는 짝수입니다.");
		} else {
			System.out.println("입력된 정수는 홀수입니다.");
		}
		
		sc.close();
	}

}
