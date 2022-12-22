package assignment;

/*
2와 100사이의 모든 소수를 찾는 프로그램을 작성하라.
*/

public class Lab7 {

	public static void main(String[] args) {
		System.out.print("2부터 100 사이 모든 소수 : ");

		int cnt = 0;
		for (int i = 2; i <= 100; i++) {
			for (int k = 2; k <= i; k++) {
				if (i % k == 0) {
					cnt++;
				}
			}
			if (cnt == 1) {
				System.out.print(i + " ");
			}
			cnt = 0;
		}
	}

}
