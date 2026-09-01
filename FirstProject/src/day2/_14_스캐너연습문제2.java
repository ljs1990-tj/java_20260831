package day2;

import java.util.Scanner;

public class _14_스캐너연습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 나이(숫자)를 하나 입력받은 후
		// 나이가 12이하 혹은 60이상일 경우 '무료입니다.' 출력
		// 13~59 사이 값이면 '1000원 입니다' 출력
		// 음수(마이너스 숫자) 혹은 120초과 값일 경우 
		// '나이를 다시 입력해주세요' 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		
		if(age < 0 || age > 120) {
			System.out.println("나이를 다시 입력해주세요.");
		} else {
			if(age <= 12 || age >= 60) {
				System.out.println("무료입니다!");
			} else {
				System.out.println("1000원 입니다.");
			}
		}
		
		
		
	}
}
