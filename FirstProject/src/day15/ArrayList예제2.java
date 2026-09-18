package day15;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		Random ran = new Random();
		// 1. list에 1부터 20사이 랜덤 숫자 6개 넣기
		//    일단은 중복 신경쓰지 말 것.
		while(list.size() <= 5) {
			int ranNum = ran.nextInt(20)+1;
			if(list.contains(ranNum)) {
				continue;
			}
			list.add(ranNum);
		}
		System.out.println(list);
		
	}
}
