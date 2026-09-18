package day15;

public class Private변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동", 30);
//		hong.age = 31;
		hong.setAge(31);
		
		System.out.println(hong.getAge());
		
		Human.intro();
		hong.intro = "zzzzzzzzzzzzzzzzzzzzzzzz";
		
		System.out.println(Human.intro);
		
//		Math math = new Math(); 생성자가 private 이라 객체 생성 못함
//		Math 클래스는 모든 멤버가 static이라 객체 생성 없이 사용 가능
		int max = Math.max(10, 20);
		
	}
}
