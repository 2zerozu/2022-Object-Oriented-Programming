package assignment;

/*
1부터 100사이의 정수 중에서 3 또는 4의 배수의 합을 계산하시오.
*/

public class Lab4 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 || i % 4 == 0) {
				sum += i;
			}
		}
		System.out.println("3 또는 4의 배수의 합 = " + sum);

	}

}
