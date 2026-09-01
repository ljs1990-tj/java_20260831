package day2;

public class _9_조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;

		// age가 20이상이면 '성인입니다' 출력
		// 아닐경우 '청소년 입니다' 출력

		if (age >= 20) {
			System.out.println("성인입니다.");
		}
		if(age < 20) {
			System.out.println("청소년입니다.");
		}
		
		// 참과 거짓으로 명백히 나뉘는 경우에는 else라는 좋은 문법이 있다.
		if (age >= 20) {
			System.out.println("성인입니다.");
		} else {
			// else는 if 괄호의 조건이 거짓일 때 실행된다.
			System.out.println("청소년입니다.");
		}
		
		

	}

}
