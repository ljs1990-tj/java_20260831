package day2;

import java.util.Scanner;

public class _18_반복문연습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 숫자 10부터 1까지 역순으로 출력
		// (10 9 8 7 .. 1 )
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		System.out.println("=======================");
		// 2. 1부터 100까지 숫자 중 3의 배수의 합 출력
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("=======================");
		
		
		// 3. 스캐너로 숫자를 하나 입력받고(정수&양수)
		// 1부터 해당 숫자까지의 합 출력
		// ex) 30을 입력하면 1부터 30까지의 합 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int inputNum = scan.nextInt();
		
		int userSum = 0;
		for(int i=1; i<=inputNum; i++) {
			userSum += i; // userSum = userSum + i;
		}
		System.out.println("1 부터 " + inputNum + " 까지의 합은 " + userSum + "입니다.");
		
		
		
	}
}
