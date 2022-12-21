package test;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;

		System.out.print("성적을 입력하시오: ");
		score = sc.nextInt();

		if (score >= 90) {
			System.out.println("학점 A");
		} else if (score >= 80) {
			System.out.println("학점 B");
		} else if (score >= 70) {
			System.out.println("학점 C");
		} else if (score >= 60) {
			System.out.println("학점 D");
		} else {
			System.out.println("학점 F");
		}

		sc.close();
	}

}
