package day2;

import java.util.Scanner;

public class _13_스캐너연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자 2개를 입력받은 후(양수&정수 2개 입력 가정)
		// 두 수의 합이 50이상일 경우 '큰 수' 출력
		// '20~49' 값일 경우 '중간 수'
		// 20미만일 경우 '작은 수' 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = scan.nextInt();
		int sum = num1 + num2;
		
		if(sum >= 50) {
			System.out.println("큰 수");
		} else if(sum >= 20 && sum < 50) {
			System.out.println("중간 수");
		} else {
			System.out.println("작은 수");
		}
		
		
		
		
	}
}
