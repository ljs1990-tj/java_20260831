package day1;

public class _98_복습문제 {

	public static void main(String[] args) {
		// 1. 아래 코드를 실행했을 때 주석의 내용처럼 출력되도록 변수 선언
		String name = "홍길동";
		int age = 30;
		double height = 170.1;
		boolean isMarried = false; // or true
		System.out.println(name + "의 나이는 " + age + ", 키는 " + height + ", 결혼여부는 " + isMarried + "입니다." );
		// '홍길동의 나이는 30, 키는 170.1, 결혼여부는 false입니다.' 출력


		// 2. 아래 조건에 맞게 코드 작성
		int num1 = 30;
		int num2 = 20;
		int num3 = num2+5;

		// 예시) num1은 10보다 크다를 나타내는 코드를 프린트 문으로 출력
		System.out.println(num1 > 10);

		// 2.1. num1은 num2+num3 의 값보다 크다를 나타내는 코드를 프린트 문으로 출력
		System.out.println(num1 > num2+num3);
		// 2.2. num1은 num2+10 보다 크거나 같다를 나타내는 코드를 프린트 문으로 출력
		System.out.println(num1 >= num2+10);
		// 2.3. num1은 30과 같다를 나타내는 코드를 프린트 문으로 출력
		System.out.println(num1 == 30);
		// 2.4. num1을 2로 나눴을 때 나오는 나머지는 0과 같다.
		System.out.println(num1 % 2 == 0);
		
		
		
	}
}
