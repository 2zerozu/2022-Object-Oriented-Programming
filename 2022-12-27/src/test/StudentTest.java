package test;

class Person {
	private String regnumber;
	private double weight;
	protected int age;
	String name;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}

class Student extends Person {
	int id;
}

public class StudentTest {

	public static void main(String[] args) {
		Student obj = new Student();
//		obj.regnumber="123456-123456" // 부모 클래스의 변수가 private기 때문에 접근불가 
//		obj.weight = 75.0;	// 부모 클래스의 변수가 private기 때문에 접근불가 
		obj.setWeight(75.0); // get/set으로 접근 가능
		System.out.println(obj.getWeight());
		obj.age = 21;
		obj.name = "이빵주";
	}

}

// default랑 public 차이 알아보
