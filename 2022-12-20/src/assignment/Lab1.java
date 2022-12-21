package assignment;

import java.util.Scanner;

/*
하나의 상자에 오렌지를 10개씩 담을 수 있다고 하자. 오렌지가 127개 있다면 상자 몇 개가 필요한가? 또 몇 개의 오렌지가 남을까?
*/

public class Lab1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int orange, box, remain;

		System.out.print("오랜지의 개수를 입력하시오 : ");
		orange = sc.nextInt();

		box = orange / 10;
		remain = orange % 10;

		System.out.println(box + "박스가 필요하고 " + remain + "개가 남습니다.");

		sc.close();
	}

}
