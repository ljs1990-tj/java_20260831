package day15;

public class Human {
	private String name;
	private int age;
	private String gender;
	String addr;
	
	public Human() {};
	
	public Human(String name, int age) {
		this(name, age, "알수없음");
//		this.name = name;
//		this.age = age;
//		this.gender = "알수없음";
	}
	public Human(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void walk() {
		System.out.println(name + "(이)가 걷는다!");
	}
	public String eat(String food) {
		return food + "를 먹는다.";
	}
	
	
	
	
}
