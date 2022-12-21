package assignment;

import java.util.Scanner;

/*
사용자로부터 화씨 온도를 받아서 섭씨 온도로 환산하여 출력하는 프로그램을 작성 하시오.
사용자로부터 섭씨 온도를 받아서 화씨 온도로 환산하여 출력하는 프로그램을 작성 하시오.
*/

public class MiniProject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		double temperature;

		System.out.println("=====================================");
		System.out.println("1. 화씨->섭씨");
		System.out.println("2. 섭씨->화씨");
		System.out.println("=====================================");
		System.out.print("번호를 선택 하시오 : ");
		num = sc.nextInt();

		System.out.print(num == 1 ? "섭씨 온도를 입력 하시오 : " : "화씨 온도를 입력 하시오 : ");
		temperature = sc.nextDouble();

		System.out.println(num == 1 ? "화씨 온도는 " + (temperature - 32) * 5 / 9 : "섭씨 온도는 " + temperature * 9 / 5 + 32);

		sc.close();
	}

}
