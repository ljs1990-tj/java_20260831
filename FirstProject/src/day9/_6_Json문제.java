package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _6_Json문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 성적입력 프로그램
		// 입력하고 싶은 만큼 입력 후 종료하고 싶을 때 종료

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("====== 성적 입력 프로그램 ======");
		
		while(true) {
			System.out.print("[ (1) 성적입력, (2) 성적확인 (그 외) 종료 ] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				// 이름, 자바점수, db점수, html점수 입력받아서 map으로 만든 후
				// list에 저장
			} else if(menu == 2){
				// 이름을 입력받은 후 해당 학생의 자바점수, db점수, html점수 출력
				// 해당 학생이 list에 존재하지 않으면 '등록된 학생이 아닙니다' 출력
			} else {
				System.out.println("종료되었습니다!");
				break;
			}
		}		
	}
}
