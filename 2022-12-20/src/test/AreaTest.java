package test;

public class AreaTest {

	public static void main(String[] args) {
		final double PI = 3.141592;
		
		double radius, area;
		
		radius = 5;
		area = radius * radius * PI;
		System.out.println("반지름이 " + (int)radius + "인 원의 면적은 " + area);
	}

}
