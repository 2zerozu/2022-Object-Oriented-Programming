package test;

public class ConditionalOperator {

	public static void main(String[] args) {
		final double PI = 3.141592;
		var pizza20 = 20 * 20 * PI;
		var pizza30 = 30 * 30 * PI;

		System.out.println("20cm 피자 면적 : " + pizza20);
		System.out.println("30cm 피자 면적 : " + pizza30);
		System.out.println((pizza20 * 2 > pizza30) ? "20cm 피자" : "30cm 피자");
	}

}
