package test;

import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("가위(0), 바위(1), 보(2) : ");
		int user = sc.nextInt();

		int computer = (int) (Math.random() * 3);

		if (user == computer) {
			System.out.println("인간과 컴퓨터가 비겼음.");
		} else if (user == (computer + 1) % 3) {	// 0은 1한테 지고, 1은 2한테, 2는 0한테 진다.
			System.out.println("인간: " + user + ", 컴퓨터: " + computer + " => 인간 승리");
		} else {
			System.out.println("인간: " + user + ", 컴퓨터: " + computer + " => 컴퓨 승리");
		}

		sc.close();
	}

}
