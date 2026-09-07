package day6;

public class _5_상속_객체생성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동", 30, "인천");
		System.out.println(hong.getInfo());
		
		Student kim = new Student("김철수", 25, "서울", 1234);
		System.out.println(kim.getInfo());
	}
}
