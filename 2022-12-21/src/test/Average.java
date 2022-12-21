package test;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0, cnt = 0;

		while (true) {
			System.out.print("정수를 입력하시오 : ");
			int grade = sc.nextInt();
			if (grade < 0)
				break;
			total += grade;
			cnt++;
		}
		System.out.println("평균운 " + (double) total / cnt);

		sc.close();
	}

}
