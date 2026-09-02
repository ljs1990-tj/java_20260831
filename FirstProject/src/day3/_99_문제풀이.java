package day3;

import java.util.Random;
import java.util.Scanner;

public class _99_문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 카페에 '랜덤구구단 연습문제' 게시글에 있는 
		// 이미지처럼 동작하도록 코드 작성
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("=== 랜덤 구구단 ===");
		
		for(;;) {
			System.out.print("[ (1) 구구단 시작 (2) 종료 ] : ");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				// 구구단 풀이
				System.out.print("문제수를 입력해주세요 : ");
				int count = scan.nextInt();
				int correctCnt = 0; // 정답 개수
				for(int i=1; i<=count; i++) {
					int x = ran.nextInt(8) + 2; // 2~9
					int y = ran.nextInt(9) + 1; // 1~9
					System.out.print("[" + i + "번 문제] ");
					System.out.print(x + " * " + y + " = ");
					int answer = scan.nextInt();
					if(answer == x*y) {
						System.out.println("정답!!!");
						correctCnt++;
					} else {
						System.out.println("오답!!!");
					}
				}
				System.out.println("총 " + correctCnt + "문제 맞추셨습니다.");
				
			} else {
				System.out.println("종료되었습니다.");
				break;
			}
			
		}
		
	}

}
