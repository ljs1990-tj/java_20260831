package day17;

import java.util.ArrayList;

public class 연습문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("김철수");
		list.add("박영희");
		list.add("김길동");
		list.add("김하하");
		
		// 리스트에서 '김'씨만 찾아서 출력
		for(int i=0; i<list.size(); i++) {
			String name = list.get(i);
//			if(name.substring(0, 1).equals("김")) {
//				System.out.println(name);
//			}
			if(name.startsWith("김")) {
				System.out.println(name);
			}
			
		}
		
	}

}
