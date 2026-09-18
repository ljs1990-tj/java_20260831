package day15;

import java.util.ArrayList;

public class ArrayList예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=5; i++) {
			list.add(i);
		}
		list.add(1, 100);
		System.out.println(list);
		
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
		
		boolean result = list.contains(3);
		if(result) {
			System.out.println("3이 있다!");
		}
		
	}
}
