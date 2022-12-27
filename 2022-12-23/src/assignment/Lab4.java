package assignment;

/*
문제 4 : 자동차 회사에서 지금까지 생산한 자동차의 대수를 정적 변수를 이용하여 계산하려고 한다. 
Car 클래스에 모델 이름(model), 생산자(make)등의 필드를 정의하고, 여기에 지금까지 생산된 자동차의 대수를 나타내는 정적 변수 numberOfCars를 추가한다. 
이 정적 변수를 외부로 반환해주는 정적 메소드 getNumberOfCar()도 정의해서 사용해보자. 
생성자, 설정자, 접근자도 적절하게 추가하라.
*/

class Car {
	private String model;
	private String make;
	private static int numberOfCars = 0;
	
	Car(String model, String make) {
		this.model = model;
		this.make = make;
		this.numberOfCars++;
		System.out.println("자동차 1대 생산, 누적 생산량 = " + numberOfCars);
	}
	
//	public static int getNumberOfCar() {
//		return numberOfCars;
//	}
}

public class Lab4 {

	public static void main(String[] args) {
		//int n = Car.getNumberOfCar();
		Car c1 = new Car("asdf", "asdf");
		Car c2 = new Car("qwer", "qwer");
		Car c3 = new Car("zxcv", "zxcv");
		
	}

}
