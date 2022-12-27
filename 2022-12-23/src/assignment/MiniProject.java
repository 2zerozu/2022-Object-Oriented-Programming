package assignment;

import java.util.ArrayList;
import java.util.Scanner;

/*
사용자가 읽은 책과 평점을 저장하는 객체 배열을 생성해보자.
다음과 같은 메뉴가 제공된다.
현재까지의 등록된 책의 수는 정적 필드로 구현해보자.
객체 배열은 정적이나 동적으로 생성해본다.
*/

class Book {
	private String title;
	private int value;

	Book(String title, int value) {
		this.title = title;
		this.value = value;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

class BookManager {

	private static BookManager bookManager = new BookManager();
	private ArrayList<Book> bookList;

	private BookManager() {
		bookList = new ArrayList<Book>();
	}

	public static BookManager getInstance() {
		return bookManager;
	}

	public void showMenu() {
		System.out.println("================");
		System.out.println("1. 책 등록");
		System.out.println("2. 책 검색");
		System.out.println("3. 모든 책 출력");
		System.out.println("4. 종료");

	}

	public int readInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

	public void enroll() {
		Scanner sc = new Scanner(System.in);
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("평점 : ");
		int val = sc.nextInt();
		Book book = new Book(title, val);
		bookList.add(book);

	}

	public void search() {
		System.out.print("책 제목을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String t = sc.nextLine();
		for (int i = 0; i < bookList.size(); i++) {
			if (t.equals(bookList.get(i).getTitle())) {
				System.out.println("찾았습니다!");
				System.out.println("제목 : " + bookList.get(i).getTitle());
				System.out.println("평점 : " + bookList.get(i).getValue());
			}
		}
	}

	public void print() {
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i).getTitle());
			System.out.println(bookList.get(i).getValue());
		}
	}

}

public class MiniProject {

	public static void main(String[] args) {
		BookManager manager = BookManager.getInstance();
		int input;
		do {
			manager.showMenu();
			System.out.print("번호를 입력하시오 : ");
			input = manager.readInput();

			switch (input) {
			case 1:
				manager.enroll();
				break;
			case 2:
				manager.search();
				break;
			case 3:
				manager.print();
				break;
			case 4:
				return;
			}
		} while (true);

	}

}
