package assignment;

/*
크기가 3인 Circle 객체 배열을 생성하고 여기에 Circle 객체를 3개 생성하여 배열에 저장한다. 
원의 반지름은 0부터 100사이의 난수를 사용하여 생성한다. 
배열에 저장된 객체들을 꺼내서 화면에 출력한다.
*/

class Circle {
	private int radius;

	Circle(int r) {
		super();
		this.radius = r;
	}

	public String toString() {
		return "[ radius= " + this.radius + " ]";
	}
}

public class Lab1 {

	public static void main(String[] args) {
		Circle c[] = new Circle[3];
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle((int) (Math.random() * 100));
			System.out.println(c[i]);
		}
	}

}
