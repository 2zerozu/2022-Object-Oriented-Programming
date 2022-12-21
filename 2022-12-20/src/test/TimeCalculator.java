package test;

import java.util.Scanner;

public class TimeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int time, min, sec;

		System.out.print("초를 입력하세요 : ");
		var time = sc.nextInt();

		var min = time / 60;
		var sec = time % 60;

		System.out.println(time + "초는 " + min + "분 " + sec + "초입니다.");

		sc.close();
	}

}
