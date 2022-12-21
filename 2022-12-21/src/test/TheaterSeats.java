package test;

public class TheaterSeats {

	public static void main(String[] args) {
		int[][] seats = { { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 1, 1, 1, 0 } };

		int cnt = 0;

		for (int i = 0; i < seats.length; i++) { // seats.length = 3
			for (int k = 0; k < seats[i].length; k++) { // seats[i].length = 10
				cnt += seats[i][k];
			}
		}
		System.out.print("현재 관객 수는 " + cnt + "명입니다.");
	}

}
