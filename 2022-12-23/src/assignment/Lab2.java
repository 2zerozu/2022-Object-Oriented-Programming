package assignment;

/*
원을 나타내는 Circle 클래스는 원의 중심을 나타내는 int x, y; 필드와 반지름을 나타내는 int radius; 필드를 가지고 있다. 
생성자, 설정자, 접근자도 추가하라. 
Circle 클래스에 다음과 같은 메소드 move(int dx, int dy)를 추가해보자. 
move()정적 메소드는 주어진 원을 (dx, dy)만큼 움직인다.
*/

class Circle {
	int x, y, radius;

	Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.radius = r;
	}

	public void move(int dx, int dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;
	}

	public String toString() {
		return "Circle [ x=" + this.x + ", y=" + this.y + ", radius=" + this.radius + " ]";
	}
}

public class Lab2 {

	public static void main(String[] args) {
		Circle c = new Circle(10, 10, 5);
		System.out.println(c + "\n");
		c.move(10, 20);
		System.out.println("move() 호출 후 ");
		System.out.println(c);
	}

}
