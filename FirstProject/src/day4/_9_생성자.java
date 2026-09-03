package day4;

public class _9_생성자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Person 객체 생성 (객체이름 hong)
		Person hong = new Person("홍길동", 30, "인천", 170.1);
		System.out.println(hong.name);
		
		Person kim = new Person("김철수", 25, "서울", 185.6);
		System.out.println(kim.name);
		
		Person park = new Person("박영희", 28, "제주도");
	}
}
