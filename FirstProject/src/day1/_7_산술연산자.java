package day1;

public class _7_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		
		System.out.println(num + 5); // 105
		System.out.println(num / 3); // 33
		
		System.out.println(100.0 / 3);
		
		// 1. 문자열 + 아무 값 => 문자열(이어붙여진 결과)
		// 2. 정수랑 정수의 연산 => 결과가 정수로 나옴
		// 3. 문자열을 제외한 연산 시 실수가 포함되어 있으면 결과도 실수
		
		System.out.println((double) num / 7);
		
		// 사칙연산의 계산 순서는 기본적인 수학연산과 같다.
		// 괄호 먼저, 곱하기&나눗셈 먼저, 덧셈&뺄셈 등
		System.out.println(3+5*2); // 13
		System.out.println((3+5)*2); // 16
		
		
	}
}
