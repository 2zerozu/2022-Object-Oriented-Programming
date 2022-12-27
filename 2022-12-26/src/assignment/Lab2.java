package assignment;

import java.util.ArrayList;
import java.util.Scanner;

/*
지인들의 연락처(최대 100)를 저장하고 검색하는 프로그램을 객체 배열을 이용하여 작성해보자. 
Contacts 클래스는 이름(name), 전화번호(tel), 이메일(email)등의 필드를 가진다. 
여기에 지인들의 수를 저장하는 정적 변수 count를 추가하라. 
Contacts객체를 저장하는 객체 배열을 생성한다.(ArrayList사용) 
이 프로그램은 다음과 같은 사용자 인터페이스를 가진다.
*/

class Contacts {
	String name;
	String tel;
	String email;
	static int count;

	Contacts(String n, String t, String e) {
		super();
		this.name = n;
		this.tel = t;
		this.email = e;
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		this.name = n;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String t) {
		this.tel = t;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String e) {
		this.email = e;
	}
}

public class Lab2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Contacts> list = new ArrayList<>();
		System.out.println("연락처를 입력하시오(종료 -1)");
		while (true) {
			System.out.print("이름과 전화번호, 이메일을 입력하시오. ");
			String name = sc.next();
			if (name.equals("-1"))
				break;
			String tel = sc.next();
			String email = sc.next();
			list.add(new Contacts(name, tel, email));
		}
		System.out.println("지인들의 수는 " + Contacts.count + "명입니다. ");
		System.out.print("검색할 이름을 입력하시오 : ");
		String name = sc.next();
		
		for(Contacts c: list) {
			if(c.getName().equals(name)) {
				System.out.println(c.getName()+"전화번호 : " + c.getTel() + ", 이메일 : " + c.getEmail());
			}
		}
		sc.close();
	}

}
