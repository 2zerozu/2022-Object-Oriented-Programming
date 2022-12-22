package assignment;

import java.util.Scanner;

/*
사용자가 입력한 값이 1, 2…, 9이면 “ONE”, “TWO”….”NINE”과 같이 출력하는 프로그램을 작성하라.
1부터 9사이가 아니면 “OTHER”를 출력한다. (switch~case문 사용할 것!)
*/

public class Lab1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		String s;
		System.out.print("정수를 입력하시오 : ");
		num = sc.nextInt();

		switch (num) {
		case 1:
			s = "ONE";
			break;
		case 2:
			s = "TWO";
			break;
		case 3:
			s = "THREE";
			break;
		case 4:
			s = "FOUR";
			break;
		case 5:
			s = "FIVE";
			break;
		case 6:
			s = "SIX";
			break;
		case 7:
			s = "SEVEN";
			break;
		case 8:
			s = "EIGHT";
			break;
		case 9:
			s = "NINE";
			break;
		default:
			s = "OTHER";
			break;
		}

		System.out.println(s);

		sc.close();
	}

}
