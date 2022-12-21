package test;

import java.util.Scanner;

public class Add3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name;
		int age;

		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();

		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();

		System.out.println(name + "님 안녕하세요! " + age + "살이시네요.");

		sc.close();
	}

}

//String (한 단어) -> sc.next();
//int -> sc.nextInt();
//double -> sc.nextDouble();
//String (스페이스바 포함) -> sc.nextLine()