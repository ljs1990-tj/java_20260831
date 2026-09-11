package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _5_성적관리프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		ArrayList<String> nameList = new ArrayList<>();
		
		System.out.println("======= 성적관리 프로그램 ======");
		while(true) {
			System.out.print("[ (1) 성적등록 (2) 미정 (그 외) 종료 ] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				HashMap<String, Object> student = new HashMap<>();
				System.out.print("학번 : ");
				String stuNo = s.next();
				System.out.print("이름 : ");
				String name = s.next();
				System.out.print("자바점수 : ");
				int javaScore = s.nextInt();
				System.out.print("db점수 : ");
				int dbScore = s.nextInt();
				System.out.print("html점수 : ");
				int htmlScore = s.nextInt();
			}
		}
	}

}
