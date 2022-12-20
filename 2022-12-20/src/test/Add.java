package test;


// 덧셈 프로그램

public class Add {	// 접근 제한자 + 클래스 이름

	public static void main(String[] args) {	// 메소드 정의
		int x, y, sum;	
		x = 100;
		y = 200;
		sum = x + y;
		System.out.println(sum);
	}

}

// 여러 개의 파일이 들어가더라도 하나의 파일만 public
// 자바는 정적임 미리 메모리 할당함
// 메소드 : 클래스 내부에서 정의된 함수 (객체의 함수)
// public (누구나 호출 가능) static(정적 메소드) void(결과값 반환 x) main(메소드 이름) (매개변수)
// _(언더바)와 $(달러) 사용 가능 
// 상수(const) : final 자료형 상수이름(대문자) = 상수값;