package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _5_성적관리프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		ArrayList<String> stuNoList = new ArrayList<>();
		
		System.out.println("======= 성적관리 프로그램 ======");
		while(true) {
			System.out.print("[ (1) 성적등록 (2) 성적확인 (그 외) 종료 ] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				// 메뉴 1번에 대한 조건
				// 1. 학번은 무조건 4글자. 4글자 벗어나게 입력하면 다시 입력하도록
				// 2. 이미 있는 학번이라면 마찬가지로 다시 입력하도록
				// 3. 각 과목의 점수를 입력받을 때 점수의 범위는
				//    자바 : 0~40, db : 0~35, html : 0~25
				//    해당 범위 외의 숫자 입력 시 다시 입력하도록
				
				HashMap<String, Object> student = new HashMap<>();
				while(true) {
					String stuNo = MyFunction.textLength("학번 : ", 4);
					if(stuNoList.indexOf(stuNo) != -1) {
						System.out.println("이미 등록된 학번 입니다.");
					} else {
						student.put("stuNo", stuNo);
						break;
					}
				}
				
				System.out.print("이름 : ");
				String name = s.next();
				student.put("name", name);
				
				int javaScore = MyFunction.numberCheck("자바점수 : ", 0, 40);
				student.put("java", javaScore);
				int dbScore = MyFunction.numberCheck("db점수 : ", 0, 35);
				student.put("db", dbScore);
				int htmlScore = MyFunction.numberCheck("html점수 : ", 0, 25);
				student.put("html", htmlScore);
				
				list.add(student);
				stuNoList.add((String) student.get("stuNo"));
				
				System.out.println(list);
				System.out.println(stuNoList);
			} else if(menu == 2) {
				// 학번을 입력받아서
				// 해당 학번이 존재하면 해당 학생의 시험 총점 출력
				// 해당 학번 없으면 '학번을 확인해주세요' 출력 후 메뉴로 이동
				System.out.print("학번 : ");
				String stuNo = s.next();
				int index = stuNoList.indexOf(stuNo);
				if(index != -1) {
					HashMap<String, Object> student =  list.get(index);
					int total = 
							(Integer) student.get("java") + 
							(Integer) student.get("db") + 
							(Integer) student.get("html");
					
					System.out.println("총점 : " + total);
				} else {
					System.out.println("학번을 확인해주세요");
				}
				
			}
		}
	}

}
