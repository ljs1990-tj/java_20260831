package day9;

import java.util.ArrayList;
import java.util.Random;

public class _2_ArrayList문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList에 1부터 30사이의 랜덤한 숫자 10개 넣기
		// 단, 중복없도록
		ArrayList<Integer> list = new ArrayList<>();
		Random ran = new Random();
		
//		for(int i=0; i<10; i++) {
//			int num = ran.nextInt(30) + 1;
//			if(!list.contains(num)) {
//				list.add(num);
//			} else {
//				i--;
//			}
//		}
		
		while(list.size() < 10) {
			int num = ran.nextInt(30) + 1;
			if(!list.contains(num)) {
				list.add(num);
			}
		}
		System.out.println(list);
		
	}

}
