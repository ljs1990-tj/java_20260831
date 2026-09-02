package day3;

import java.util.Random;
import java.util.Scanner;

public class _8_랜덤구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤한 구구단 문제를 제공해주고 정답을 입력받아서
		// 맞추면 '정답', 틀리면 '오답' 출력
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int x = ran.nextInt(8) + 2; // 2~9
		int y = ran.nextInt(9) + 1; // 1~9
		
		System.out.print(x + " * " + y + " = ");
		int answer = scan.nextInt();
		
		if(x*y == answer) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
		
	}

}
