package assignment;

import java.util.Scanner;

/*
움직이는 물체의 운동에너지를 계산해보자. 물체의 에너지를 계산하는 식은 0.5 X 무게 X 속도2이다. 적절한 자료형을 사용한다.
*/

public class Lab10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w, s, e;

		System.out.print("물체의 무게를 입력하시오(킬로그램): ");
		w = sc.nextDouble();

		System.out.print("물체의 속도를 입력하시오(미터/초): ");
		s = sc.nextDouble();

		e = 0.5 * w * s * s;
		System.out.println("물체는 " + e + "(줄)의 에너지를 가지고 있다.");

		sc.close();
	}

}
