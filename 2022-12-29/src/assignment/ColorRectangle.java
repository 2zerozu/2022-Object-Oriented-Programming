package assignment;

/*
문제 3 : 일반적인 사각형을 나타내는 Rectangle 클래스가 다음과 같이 정의된다.
위의 Rectangle 클래스를 상속받아서 색깔있는 사각형을 나타내는 ColorRectangle클래스를 정의한다. 
ColorRectangle 클래스에는 색상을 나타내는 필드 String color가 추가된다. 
ColorRectangle클래스의 생성자를 작성해보자. 
다음과 같은 실행 결과가 나오도록 한다. 
*/

class Rectangle {
	int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
}

public class ColorRectangle extends Rectangle {
	String color;

	public ColorRectangle(int width, int height, String color) {
		super(width, height);
		this.color = color;
	}

	public static void main(String[] args) {
		ColorRectangle obj = new ColorRectangle(100, 100, "blue");
		System.out.println("가로 : " + obj.width);
		System.out.println("세로 : " + obj.height);
		System.out.println("색상 : " + obj.color);

	}

}
