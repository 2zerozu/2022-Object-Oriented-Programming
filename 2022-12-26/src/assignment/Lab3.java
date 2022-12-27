package assignment;

import java.util.ArrayList;
import java.util.Scanner;

/*
간단한 영한 사전을 객체 배열을 이용하여 만들어보자. 
클래스 Word는 영어 단어를 나타내는 eng, 한국어 단어를 나타내는 kor을 필드로 가진다. 
클래스 Word의 객체 배열을 만들어서(ArrayList) 여기에 몇 개의 단어쌍을 저장한다. 
이 객체 배열을 이용하여 사용자가 입력하는 영어 단어가 배열 안에 있으면 대응되는 한국어 단어를 출력한다.
*/

class Word {

	String eng;
	String kor;

	Word(String e, String k) {
		this.eng = e;
		this.kor = k;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String e) {
		this.eng = e;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String k) {
		this.kor = k;
	}
}

public class Lab3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Word> list = new ArrayList<>();
		list.add(new Word("house", "집"));
		list.add(new Word("cat", "고양이"));
		list.add(new Word("banana", "바나나"));
		list.add(new Word("apple", "사과"));

		while (true) {
			System.out.print("검색할 단어를 입력하시오. (종료 q) ");
			String eng = sc.next();
			boolean flag = false;
			if (eng.equals("q")) {
				break;
			}
			for (Word w : list) {
				if (w.getEng().equals(eng)) {
					System.out.println(w.getEng() + "->" + w.getKor());
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("사전에 없는 단어입니다!");
			}
		}

		sc.close();
	}

}
