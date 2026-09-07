package day6;

public class _6_Static연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calculator 클래스 생성
		// 아래 코드가 정상동작하도록 Calculator 클래스 작성
		int a = Calculator.sum(3,5); // 두 수의 합 리턴
		System.out.println(a); // '8' 출력
		int b = Calculator.sum(3,5,10); // 세 수의 합 리턴
		System.out.println(b); // '18' 출력
		double c = Calculator.sum(3.5,5.4); // 두 수의 합 리턴
		System.out.println(c); // '8.9' 출력

		Calculator.multiple(2, 3); // '두 수의 곱은 6 입니다' 출력 

		int arr[] = {3,5,2,4,1};
		Calculator.arraySum(arr); // '배열의 모든 수의 합은 15 입니다' 출력
	}

}
