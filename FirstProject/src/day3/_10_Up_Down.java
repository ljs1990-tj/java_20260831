package day3;

import java.util.Random;
import java.util.Scanner;

public class _10_Up_Down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Up & Down 게임
		// 1~100 사이의 랜덤 숫자가 생성되고, 해당 숫자를 맞추는 게임
		// ex) 랜덤숫자 : 76(비공개)
		//     1번째 시도 : 50 => Up
		//     2번째 시도 : 80 => Down
		//     3번째 시도 : 76 => 정답입니다! 3번째에 정답을 맞추셨습니다!
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("Up&Down 게임을 시작합니다!");
		int ranNum = ran.nextInt(100) + 1; // 1 ~ 100
		int count = 0;
		for(;;) {
			count++;
			System.out.print(count + "번째 시도 : ");
			int answer = scan.nextInt();
			if(answer < 1 || answer > 100) {
				System.out.println("1~100사이 값을 입력해주세요.");
				count--;
			} else if(answer == ranNum) {
				System.out.println("정답입니다! " + count + "번째에 정답을 맞추셨습니다.");
				break;
			} else if(ranNum > answer) {
				System.out.println("Up");
			} else {
				System.out.println("Down");
			}
			
		}
		
	}

}
