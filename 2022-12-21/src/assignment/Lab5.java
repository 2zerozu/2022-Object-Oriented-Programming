package assignment;

/*
2개의 주사위를 던져 합이 6이 되는 경우의 수를 출력하라.
*/

public class Lab5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int k = 1; k <= 6; k++) {
				if (i + k == 6) {
					System.out.println("(" + i + ", " + k + ")");
				}
			}
		}
	}

}
