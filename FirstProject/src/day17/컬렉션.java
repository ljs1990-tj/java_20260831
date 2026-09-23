package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class 컬렉션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너로 문자열 5개 입력받아서 리스트에 넣기
		Scanner s = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		for(int i=1; i<=5; i++) {
			System.out.print(i + "번째 문자 입력 : ");
			String input = s.next();
			list.add(input); 
		}
		System.out.println(list);
		
		// 텍스트의 길이가 가장 큰 텍스트 출력
		// 1. 중복없다고 가정
		String maxText = "";
		for(int i=0; i<list.size(); i++) {
			if(maxText.length() < list.get(i).length()) {
				maxText = list.get(i);
			}
		}
		System.out.println(maxText);
		
		// 2. 중복이 있다면?
		int maxLength = 0;
		for(int i=0; i<list.size(); i++) {
			if(maxLength < list.get(i).length()) {
				maxLength = list.get(i).length();
			}
		}
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).length() == maxLength) {
				System.out.println(list.get(i));
			}
		}
		
	}
}
