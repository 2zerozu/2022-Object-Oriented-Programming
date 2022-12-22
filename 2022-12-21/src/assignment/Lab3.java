package assignment;

/*
369게임을 만들어보자. 3, 6, 9의 개수만큼 박수를 치는 게임이다. (1부터 50까지의 정수만)
*/

public class Lab3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if (i == 3 || i == 6 || i == 9) {
				System.out.print("짝 ");
			} else if (i >= 10) {
				if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
					if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
						System.out.print("짝짝 ");
					} else {
						System.out.print("짝 ");
					}
				} else if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
					System.out.print("짝 ");
				} else {
					System.out.print(i + " ");
				}
			} else {
				System.out.print(i + " ");
			}
		}
	}

}
