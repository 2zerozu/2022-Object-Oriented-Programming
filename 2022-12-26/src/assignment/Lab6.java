package assignment;

import java.util.Scanner;

/*
배열을 이용하여 간단한 극장 예약 시스템을 작성하여 보자. 
아주 작은 극장이라서 좌석이 10개밖에 안 된다. 
사용자가 예약을 하려고 하면 먼저 좌석 배치표를 보여준다. 
즉 예약이 끝난 좌석은 1로, 예약이 안 된 좌석은 0으로 나타낸다.
 */

class Seat {
	private int empty = 0;

	void bookSeat() {
		empty = 1;
	}

	int getEmpty() {
		return empty;
	}
}

public class Lab6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int check;
		Seat[] seats = new Seat[10];
		for (int i = 0; i < seats.length; i++)
			seats[i] = new Seat();

		while (true) {
			System.out.print("좌석을 예약 하시겠습니까? (0 또는 1)  : ");
			check = sc.nextInt();
			if (check == 0)
				break;
			System.out.println("==============================");
			for (int i = 0; i < seats.length; i++)
				System.out.print(i + "  ");
			System.out.println();
			System.out.println("==============================");
			for (int i = 0; i < seats.length; i++)
				System.out.print(seats[i].getEmpty() + "  ");
			System.out.println();
			// 좌석 예약
			System.out.print("몇 번째 좌석을 예약하시겠습니까? ");
			check = sc.nextInt();
			if (check < -1 || check > 10 || seats[check].getEmpty() == 1)
				System.out.println("다시 진행해주세요.");
			else {
				seats[check].bookSeat();
				System.out.println("예약되었습니다.");
			}
		}
	}
}
