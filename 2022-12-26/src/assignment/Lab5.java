package assignment;

/*
비행기를 나타내는 Plane라는 이름의 클래스를 설계하라. 
Plane 클래스는 제작사(예:에어버스), 모델(A380), 최대승객수(500)를 필드로 가지고 있다.
 
필드를 정의하라. 모든 필드는 private 멤버로 하라.
모든 필드에 대한 접근자와 설정자 메소드를 작성한다.
Plane 클래스의 생성자 중 몇 개를 중복 정의하라. 생성자는 모든 데이터를 받을 수도 있고 하나도 받지 않을 수 있다.
PlaneTest라는 이름의 테스트 클래스를 만드는데 main()에서 Plane객체 여러 개를 생성하고 접근자와 설정자를 호출하여 보라.
Plane 클래스에 지금까지 생성된 비행기의 개수를 나타내는 정적변수인 planes를 추가하고 생성자에서 증가시켜 보자.
Plane 클래스에 정적변수 planes의 값을 반환하는 정적메소드인 getPlanes()를 추가하고 main()에서 호출하여 보라.
*/

class Plane {
	private String company;
	private String model;
	private int maxPassenger;
	private static int planes;

	Plane() {
		this("", "", 0);
	}

	Plane(String company, String model, int maxPassenger) {
		this.company = company;
		this.model = model;
		this.maxPassenger = maxPassenger;
		planes++;
	}

	public void setCompany(String compnay) {
		this.company = compnay;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setMaxPassenger(int maxPassenger) {
		this.maxPassenger = maxPassenger;
	}

	public String toString() {
		return "식별변호 : "+company + " 모델 : " + model + " 승객 수 : " + maxPassenger;
	}

	public static int getPlanes() {
		return planes;
	}

}

public class Lab5 {

	public static void main(String[] args) {
		Plane p1 = new Plane("1","aa",200);
		Plane p2 = new Plane("2","bb",300);
		Plane p3 = new Plane("3","cc",150);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
