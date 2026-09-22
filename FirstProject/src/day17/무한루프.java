package day17;

import java.util.Random;
import java.util.Scanner;

public class 무한루프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴퓨터와 가위바위보
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		// 1-> 가위, 2-> 바위, 3-> 보
		// 컴퓨터가 1~3중에 랜덤 숫자 생성
		
		// 사용자는 1~3사이 숫자 입력하기
		while(true) {
			System.out.print("[ (1) 3판 2선 (2) 5판 3선 ] : ");
			int menu = s.nextInt();
			if(menu != 1 && menu != 2) {
				System.out.println("1,2 번 중에 선택해주세요");
				continue;
			}
			
			int winCount = menu == 1 ? 2 : 3;
			int playerWinCount = 0;
			int comWinCount = 0;
			for(;;) {
				System.out.println("현재 사용자 " + playerWinCount + "승, 컴퓨터 " + comWinCount + "승");
				int computer = ran.nextInt(3)+1;
				System.out.print("[ 1(가위) 2(바위) 3(보) ] : ");
				int player = s.nextInt();
				String comChoice = computer == 1 ? "가위" : computer == 2 ? "바위" : "보";
				String playerChoice = player == 1 ? "가위" : player == 2 ? "바위" : "보";
				System.out.println("플레이어 : " + playerChoice + ", 컴퓨터 : " + comChoice);
				
				if(computer == player) {
					System.out.println("비겼다!");
				} else if((player == 1 && computer == 3)
						|| (player == 2 && computer == 1)
						|| (player == 3 && computer == 2)) {
					System.out.println("플레이어 윈!");
					playerWinCount++;
				} else {
					System.out.println("컴퓨터 윈!");
					comWinCount++;
				}
				
				if(playerWinCount == winCount) {
					System.out.println("플레어이가 먼저 " + winCount + "승에 도달했습니다!");
					break;
				} else if(comWinCount == winCount) {
					System.out.println("컴퓨터가 먼저 " + winCount + "승에 도달했습니다!");
					break;
				}
			}
			System.out.print("다시 하실?(y or n) : ");
			String choice = s.next();
			if(!choice.equalsIgnoreCase("y")) {
				System.out.println("종료되었습니다.");
				break;
			}
			
		}
		
		
		
	}

}
