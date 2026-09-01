package day2;

import java.util.Scanner;

public class _12_스캐너활용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자를 1개 입력받아서 홀수인지 짝수인지 판별
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수 입니다!");
		} else {
			System.out.println("홀수 입니다!");
		}
		
	}

}
