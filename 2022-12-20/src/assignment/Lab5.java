package assignment;

import java.util.Scanner;

/*
 사용자가 번개로부터 얼마나 멀리 떨어져 있는지를 계산하는 프로그램을 만들어 보자.
 소리는 공기를 초당 약 340m를 이동한다.
 번개를 본 시간과 소리가 도달하는 시간 사이의 간격을 알면 번개까지의 거리를 계산할 수 있다.
 시간 간격은 사용자로부터 입력받는다.
*/

public class Lab5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sec, dist;

		System.out.print("시간 간격을 입력하시오(단위: 초): ");
		sec = sc.nextInt();

		dist = sec * 340;
		System.out.println("번개가 발생한 곳까지의 거리 : " + dist);

		sc.close();
	}

}
