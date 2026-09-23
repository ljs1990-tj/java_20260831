package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 해시맵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 10사이 숫자를 10번 입력받고(중복가능)
		// 각 숫자를 몇번입력했는지 출력
		// ex)1 => 3번, 2=> 1번 ... 10 => 1번
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		while(list.size() < 10) {
			System.out.print((list.size() + 1) + "번째 숫자 입력 : ");
			int num = s.nextInt();
			if(num < 1 || num > 10) {
				System.out.println("1부터 10사이 숫자 입력하셈");
				continue;
			}
			if(!map.containsKey(num)) {
				map.put(num, 1);
			} else {
				map.put(num, map.get(num)+1);
			}
			list.add(num);
		}
		System.out.println(map);
	}
}
