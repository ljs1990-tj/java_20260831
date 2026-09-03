package day4;

public class Human {
	// 클래스 => 필드(변수) + 메소드
	// 변수(필드)
	String name;
	int age;
	String addr;
	double height;
	
	// 메소드
	// eat, sleep, walk
	void eat() {
		System.out.println(name + "(이)가 밥을 먹는다.");
	}
	void sleep() {
		System.out.println("잠을 잔다");
	}
	void walk(double km) {
		System.out.println(km + "km을 걷는다.");
	}
	
	
	
	
}
