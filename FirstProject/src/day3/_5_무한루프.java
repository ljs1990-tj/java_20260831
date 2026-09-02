package day3;

import java.util.Scanner;

public class _5_무한루프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = 1;
//		for(;;) {
//			if(x % 3 == 0 && x % 7 == 0) {
//				System.out.println(x);
//				break;
//			}
//			x++;
//		}
		Scanner scan = new Scanner(System.in);
		
		
		// 90~100점 'A학점' 출력
		// 80~89점 'B학점' 출력
		// ... 60점 미만 'F학점' 출력
		// 100점 초과하면 '다시 입력하세요' 출력
		for(;;) {
			System.out.print("점수 입력 : ");
			int score = scan.nextInt();
			
			if(score > 100) {
				System.out.println("다시 입력해라");
				continue;
			} else if(score >= 90 && score <= 100) {
				System.out.println("A학점");
			} else if(score >= 80 && score < 90) {
				System.out.println("B학점");
			} else if(score >= 70 && score < 80) {
				System.out.println("C학점");
			} else if(score >= 60 && score < 70) {
				System.out.println("D학점");
			} else {
				System.out.println("F학점, 공부하세요!");
			}
			
			break;
		}
		
	}
}
