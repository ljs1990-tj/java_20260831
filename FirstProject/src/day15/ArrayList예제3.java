package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList예제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동", 30);
		Human kim = new Human("김철수", 30);
		Human park = new Human("박영희", 30);
		
		ArrayList<Human> list = new ArrayList<>();
		list.add(hong);
		list.add(kim);
		list.add(park);
		System.out.println(list);
		
		// 사람 이름 입력받고 list에 있는지 검색
		// 있으면 '있습니다' 출력 후 종료
		// 없으면 그냥 아무것도 출력 안해도 됨
		Scanner s = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = s.next();
		for(int i=0; i<list.size(); i++) {
			Human h = list.get(i);
			if(h.getName().equals(name)) {
				System.out.println("있습니다.");
				break;
			}
		}
		
	}
}
