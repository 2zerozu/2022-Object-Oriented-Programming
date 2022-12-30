package assignment;

/*
원을 나타내는 Circle클래스를 상속받아서 피자를 나타내는 Pizza클래스를 작성해보자
*/

class Circle {
	protected int radius;

	public Circle(int r) {
		this.radius = r;
	}
}

class Pizza extends Circle {
	String pizza;

	public Pizza(String p, int r) {
		super(r);
		this.pizza = p;
	}

	public void print() {
		System.out.println("피자의 종류 : " + this.pizza + ", 피자의 크기 : " + super.radius);
	}
}

public class Lab1 {

	public static void main(String[] args) {
		Pizza obj = new Pizza("Pepperoni", 20);
		obj.print();
	}

}
