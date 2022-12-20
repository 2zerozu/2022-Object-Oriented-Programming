package test;

import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, sum;

		System.out.print("첫 번째 숫자를 입력하시오 : ");
		x = sc.nextInt();

		System.out.print("두 번째 숫자를 입력하시오 : ");
		y = sc.nextInt();

		sum = x + y;
		System.out.println(sum);
	}

}

// import 단축키 : cmd shift o
// 줄 정리 단축키 : cmd shift f