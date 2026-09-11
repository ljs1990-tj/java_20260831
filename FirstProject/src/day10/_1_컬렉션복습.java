package day10;

import java.util.ArrayList;

public class _1_컬렉션복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList, HashMap
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("김철수");
		list.add(1, "박영희");
		System.out.println(list);
		System.out.println(list.get(0));
		
		for(int i=0; i<list.size(); i++) {
			String name = list.get(i);
			System.out.println(name);
		}
		
		list.remove(2);
		list.remove("홍길동");
		System.out.println(list);
		
		
		ArrayList<Human> humanList = new ArrayList<>();
		Human hong = new Human("홍길동");
		Human kim = new Human("김철수");
		humanList.add(hong);
		humanList.add(kim);
		System.out.println(humanList);
	}
}
