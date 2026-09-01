package day2;

public class _1_복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 변수
		// 8개 + String(일단은 변수처럼 생각)
		// 일단은 4개만 잘 기억하자
		
		// 문자열 => String, 숫자(정수) => int
		// 숫자(실수) => double, 참&거짓 => boolean
		
		String stuName = "홍길동";
		int age = 30;
		double weight = 50.1;
		boolean isMarried = true; // true or false
		
		// 90~100점 A학점
		// 80~89점 B학점
		// ... 60점 미만 F학점
		
		int stuScore = 85;
		System.out.println(stuScore / 10); // 8
		// 정수와 정수의 계산 결과는 무조건 정수
		
		// 실수와 다른 숫자의 계산결과는 무조건 실수
		// 즉, 하나라도 실수가 있는 경우 결과는 실수다
		System.out.println((double) stuScore / 10);
		
		System.out.println(stuScore / 10.0);
		
		
	}
}
