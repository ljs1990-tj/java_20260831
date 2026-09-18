package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Json1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 리스트안에 맵이 있는 형태
		// [{},{} ..., {}]
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		for(int i=1; i<=3; i++) {
			System.out.println("===== " + i + "번 사람 입력 =====");
			HashMap<String, Object> map = new HashMap<>();
			
			System.out.print("학번 : ");
			String stuNo = s.next();
			map.put("stuNo", stuNo);
			
			System.out.print("이름 : ");
			String name = s.next();
			map.put("name", name);
			
			list.add(map);
		}
		System.out.println(list);
		
		System.out.print("검색할 이름 : ");
		String searchName = s.next();
		// 검색한 이름이 리스트안의 맵(key-name)에 존재하는지 검색
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Object> student = list.get(i);
			if(student.get("name").equals(searchName)) {
				System.out.println("찾았다!");
				break;
			}
		}
		
	}
}
