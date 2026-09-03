package day4;

public class _8_객체생성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human();
		hong.name = "홍길동";
		
		Human kim = new Human();
		kim.name = "김철수";
		Human park = new Human();
		
		System.out.println(hong.name); // 홍길동
		System.out.println(kim.name); // 김철수
		
		hong.eat();
		kim.eat();
		hong.walk(1);
		
		
	}
}
