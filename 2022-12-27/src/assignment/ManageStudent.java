package assignment;

/*
학생들의 정보를 관리하는 간단한 프로그램을 만들어 보자.

Student 라는 클래스를 만들고 name, address, phone, email이라는 인스턴스 변수를 String타입으로 선언하자.
학생의 정보에 이름은 반드시 입력되어야 하므로, name을 받아서 인스턴스 변수에 할당해 주는 Student 클래스의 생성자를 만들자.
모든 학생의 정보를 생성하면서 할당하는 name, address, phone, email을 매개 변수로 받아 인스턴스 변수에 할당하는 Student 클래스의 생성자를 만들자.
다음과 같이 학생의 정보들을 String 으로 리턴하는 toString()이라는 메소드를 만들자.
학생 정보를 담아두는 Student 클래스는 다 작성했으니, 학생들을 관리하는 ManageStudent라는 클래스를 만들자.
ManageStudent 클래스에 main()메소드를 만들자.
배열을 매개 변수로 받아 학생의 정보를 담은 후 리턴하는 메소드를 만들자.
main()메소드에서 student라는 이름을 갖는 Student 배열을 만들고 별도의 초기화는 하지 말고 null로 할당하자.
main()메소드에서 addStudent()메소드를 호출하고, 그 결과를 student 객체로 받자.
student 객체의 내용을 출력할 printStudents()라는 메소드를 만들고 매개 변수로는 student 객체를 맏을 수 있도록 하자.
pringStudents()메소드에서 for문을 사용하여 student 배열의 각각의 내용을 출력하자.
main()메소드에서 printStudents()메소드를 호출하자.
*/

class Student {
	String name;
	String address;
	String phone;
	String email;

	Student(String name) {
		this.name = name;
	}

	Student(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return name + " " + address + " " + phone + " " + email;
	}

	public Student[] addStudent() {
		Student[] student = new Student[3];
		student[0] = new Student("Lee");
		student[1] = new Student("Kim");
		student[2] = new Student("Park", "Seoul", "01011112222", "asdf@asdf.com");
		return student;
	}
}

public class ManageStudent {
	public static void main(String[] args) {
		Student student[] = null;
		ManageStudent manageStudent = new ManageStudent();
		student = manageStudent.addStudent();
		manageStudent.printStudent(student);
	}

	public Student[] addStudent() {
		Student[] student = new Student[3];
		student[0] = new Student("Lim");
		student[1] = new Student("Min");
		student[2] = new Student("Sook", "Seoul", "01011112222", "ask@bit.com");
		return student;
	}

	public void printStudent(Student[] student) {
		for (Student data : student) {
			System.out.println(data);
		}
	}
}
