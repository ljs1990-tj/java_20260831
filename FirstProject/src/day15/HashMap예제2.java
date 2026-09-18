package day15;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너로 학번, 이름, 자바점수, db점수 입력받아서
		// map(hong)에 저장
		// 키는 순서대로 'stuNo, name, java, db'로 저장
		Scanner s = new Scanner(System.in);
		HashMap<String, Object> hong = new HashMap<>();
		
		System.out.print("학번 : ");
		String stuNo = s.next();
		hong.put("stuNo", stuNo);
		
		System.out.print("이름 : ");
		String name = s.next();
		hong.put("name", name);
		
		System.out.print("자바 : ");
		int java = s.nextInt();
		hong.put("java", java);
		
		System.out.print("db :");
		int db = s.nextInt();
		hong.put("db", db);
		
		
	}

}
