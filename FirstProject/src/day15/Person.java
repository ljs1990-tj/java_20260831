package day15;

public class Person {
	private String name;
	private int age;
	private String addr;
	
	public Person(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public void speak() {
		System.out.println(name + "(이)가 말한다.");
	}
	public void eat() {
		System.out.println("음식 먹는 중");
	}
	
	public String getInfo() {
		// '홍길동의 나이는 30살 입니다.' 출력
		return name + "의 나이는 " + age + "살 입니다.";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
}
