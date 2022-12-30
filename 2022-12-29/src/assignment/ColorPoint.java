package assignment;

/*
문제 4 : 2차원 상의 한 점을 표현하는 Point 클래스는 다음과 같다.
다음 main()을 실행하여 결과가 그림과 같도록, Point를 상속받은 ColorPoint클래스(main()포함)를 작성하라.
*/

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

public class ColorPoint extends Point {

	public String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setPoint(int x, int y) {
		move(x, y);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void show() {
		System.out.println(color + "색으로 (" + getX() + "),(" + getY() + ")");
	}

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();
	}

}
