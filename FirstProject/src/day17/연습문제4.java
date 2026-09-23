package day17;

import java.util.HashMap;
import java.util.Scanner;

public class 연습문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너를 통해 문자열을 입력받고
		// 각 문자가 몇번 나오는지 출력(대소문자 구분 x)
		// ex)show me the MonEy 입력하면
		// s => 1개, m => 2개, h => 2개 ...
		// 공백은 무시
		
		Scanner s = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		System.out.print("문자열 입력 : ");
		String input = s.nextLine();
		
		for(int i=0; i<input.length(); i++) {
			String c = input.charAt(i) + "";
			if(c.equals(" ")) {
				continue;
			}
			c = c.toLowerCase();
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
