package day2;

import java.util.Scanner;

public class _21_중첩반복연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 구구단 역순으로 출력(9단 부터)
		// 9*1 = 9, 9*2 = 18 ... 2*9 = 18
		for(int i=9; i>=2; i--) {
			System.out.println("====== " + i + "단 ======");
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		
		// 2. 숫자 하나 입력받아서 해당 숫자만큼 별표 늘려가면 출력
		// ex) 5를 입력하면
		// *
		// **
		// ***
		// ****
		// *****
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int inputNum = s.nextInt();
		
		for(int i=1; i<=inputNum; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
}
