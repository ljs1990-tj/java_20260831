package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 컬렉션무한루프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("====== 포인트 관리 프로그램 ======");
		while(true) {
			System.out.print("[ (1) 회원추가 (2) 확인 (3) 포인트차감 (그 외) 종료 ] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				// 이름, 포인트 값(정수) 입력받아서 map저장 후
				// list에 저장
				// 포인트를 0이하, 10000초과 입력할 경우
				// 1~10000사이 값을 입력해주세요. 출력 후 다시 입력받도록
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름 : ");
				String name = s.next();
				map.put("name", name);
				
				while(true) {
					System.out.print("포인트 : ");
					int point = s.nextInt();
					if(point <= 0 || point > 10000) {
						System.out.println("포인트는 1부터 10000사이 값을 입력해주세요.");
						continue;
					}
					map.put("point", point);
					break;
				}
				list.add(map);
				
			} else if(menu == 2) {
				System.out.println(list);
			} else if(menu == 3){
				// 차감할 사람의 이름을 입력받은 후
				// 해당 사용자가 있을 경우 차감할 포인트 입력받고 
				// 해당 숫자만큼 포인트 차감
				// 없을경우 '해당 사용자 없음' 출력 후 메뉴로 이동
				// 포인트는 음수 불가능, 사용자가 가진 포인트 이상으로
				// 차감 불가능
				System.out.print("이름 : ");
				String name = s.next();
				boolean flg = false;
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if(user.get("name").equals(name)) {
						flg = true;
						while(true) {
							System.out.print("차감할 포인트 : ");
							int point = s.nextInt();
							if(point <= 0) {
								System.out.println("1이상 입력해주세요.");
								continue;
							}
							if(point > (int) user.get("point")) {
								System.out.println("차감 가능한 포인트는 최대 " + user.get("point") + " 입니다.");
								continue;
							}
							user.put("point", (int) user.get("point") - point);
							break;
							
						}
					}
				}
				if(!flg) {
					System.out.println("이름 없음");
				}
				
			} else {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
		
		
		
		
	}

}
