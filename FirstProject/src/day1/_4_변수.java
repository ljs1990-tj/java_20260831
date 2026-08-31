package day1;

public class _4_변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 지금까지는 변수 선언과 동시에 초기화를 진행했음
		
		// 1. 변수 선언
		int age; // 변수 선언하고 값은 안넣은 상태
//		System.out.println(age); 값이 없어서 출력 불가
		
		// 2. 초기화(값을 처음 넣을 때 초기화 라고함)
		age = 30;
		System.out.println("변경 전 : " + age);
		
		// 3. 한번 선언된 변수는 다시 선언 불가능(지역변수, 전역변수 모른다는 조건하에)
//		int age; // 이미 age 선언되어 있음
		
		// 4. 이미 선언된 변수의 값을 수정하는거는 가능
		age = 35;
		System.out.println("변경 후 : " + age);
		
		// 5. 보통은 선언과 동시에 초기화를 한다.
		// int age = 30;
	}

}
