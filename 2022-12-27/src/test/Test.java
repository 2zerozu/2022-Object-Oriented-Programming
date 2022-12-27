package test;

class Base {
	public Base() {
		System.out.println("Base() 생성자 ");
	}
}

class Derived extends Base {
	public Derived() {
		super(); // 부모 클래스의 기본 생성자 호출하게 하는 것
		System.out.println("Derived() 생성자 ");
	}
}

public class Test {

	public static void main(String[] args) {
		Derived r = new Derived();
		// 생성자 호출 순서 : 부모 -> 자식 
	}

}
