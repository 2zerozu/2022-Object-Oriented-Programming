package assignment;

/*
MyMetric이라는 클래스를 작성하고 여기에 킬로미터를 마일로 변환하는 정적 메소드인 kiloToMile()을 작성하라. 
또 반대로 마일을 킬로미터로 변환하는 정적메소드 mileToKilo()로 작성하라. 
: MyMetricTest 클래스에서 이들 정적 메소드를 호출하여 테스트하시오.
*/

class MyMetric {
	static void kiloToMile(double input) {
		System.out.println((int)input + "km를 마일로 바꾸면 " + input * 0.621371);
	}

	static void mileToKilo(double input) {
		System.out.println((int)input + "마일을 km로 바꾸면 " + input * 1.609344);
	}
}

public class Lab3 {

	public static void main(String[] args) {
		MyMetric.kiloToMile(1);
		MyMetric.mileToKilo(1);
	}

}
