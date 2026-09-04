package day5;

public class User {

	public String name;
	int age;
	protected String addr;
	private String gender;
	
	void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
		System.out.println("성별 : " + gender);
	}
	
}
