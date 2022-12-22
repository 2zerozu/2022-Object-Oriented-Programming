package assignment;

import java.util.Scanner;

/*
숫자 추측 게임
이 예제는 프로그램이 가지고 있는 정수를 사용자가 알아맞히는 게임이다.
사용자가 답을 제시하면 프로그램은 자신이 저장한 정수와 비교하여 제시된 정수가 더 높은지 낮은지 만을 알려준다.
*/

public class MiniProject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0, cnt = 0, answer = 59;

		do {
			cnt++;
			System.out.print("정답을 추측하여 보시오: ");
			num = sc.nextInt();

			if (num > answer) {
				System.out.println("제시한 정수가 높습니다.");
			} else if (num < answer) {
				System.out.println("제시한 정수가 낮습니다.");
			}
		} while (num != answer);

		System.out.println("축하합니다. 시도 횟수 = " + cnt);

		sc.close();
	}

}
