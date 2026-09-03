package day4;

public class Person {
	String name;
	int age;
	String addr;
	double height;
	
	// 생성자는 메소드다. 다만, 일반 메소드랑 조금 차이가 있다.
	// 생성자의 이름은 클래스 이름과 동일하다.
	// 즉, 클래스 이름과 동일한 이름의 메소드다.
	// 리턴이 없다. 리턴타입 명시하지 않는다.
	// 오버로딩 가능한데, 아직 잘 모르니까 패스
	// 객체를 초기화하는 용도로 사용된다.
	
	Person(String name, int age, String addr, double height){
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.height = height;
	}
	Person(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	
}
