package day6;

public class Human {
	// 필드
	private String name;
	private int age;
	private String addr;
	
	// 생성자
	Human(){}
	
	Human(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	// 메소드
	void eat(String food) {
		System.out.println(food + "를 먹는다.");
	}
	void sleep() {
		System.out.println("잠을 잔다.");
	}
	void walk() {
		System.out.println("걷는다.");
	}
	String getInfo() {
		return name + ", " + age + "세, " + addr;
	}
}
