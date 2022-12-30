package assignment;

/*
문제 2 : 동물을 나타내는 Animal 클래스를 상속받아서 새를 나타내는 Bird클래스를 작성해 보자.
Bird 클래스 안에 포함된 main()을 실행하였을 때 아래와 같은 결과가 출력되도록 하라.
*/

class Animal {
	void walk() {
		System.out.println("걸을 수 있음 ");
	}
}

public class Bird extends Animal {

	public void fly() {
		System.out.println("날 수 있음 ");
	}

	public void song() {
		System.out.println("노래 부를 수 있음 ");
	}

	public static void main(String[] args) {
		Bird bird = new Bird();

		bird.walk();
		bird.fly();
		bird.song();
	}

}
