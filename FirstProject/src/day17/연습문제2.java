package day17;

import java.util.ArrayList;

public class 연습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("oracle");
		list.add("java");
		list.add("html");
		list.add("oracle");
		System.out.println(list);
		
		// 새로운 리스트를 만들어서 중복없이 
		// 기존 리스트의 과목명을 채운 후 출력
		// 출력결과 : [java, oracle, html] (순서 상관 없음)
		ArrayList<String> newList = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			String subject = list.get(i);
			
			if(!newList.contains(subject)) {
				newList.add(subject);
			}
		}
		System.out.println(newList);
		
	}
}
