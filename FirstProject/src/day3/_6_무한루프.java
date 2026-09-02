package day3;

import java.util.Scanner;

public class _6_무한루프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		for(;;) {
			System.out.print("[ (1) 자기소개 (2) 취미 (3) 종료 ] : ");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				System.out.println("안녕하세요, 홍길동 입니다!");
			} else if(menu == 2) {
				System.out.println("취미는 게임입니다!");
			} else if(menu == 3) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1~3의 숫자를 입력해주세요.");
			}
			
		}
		

	}

}
