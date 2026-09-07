package day6;

import java.util.Arrays;

public class _4_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,2,4,1};
//		ArrayFunc af = new ArrayFunc();
//		af.arrayMax(arr); // 굳이 객체 만들어서 접근할 필요 x
		
		// 메소드를 static 으로 선언했으므로 
		ArrayFunc.arrayMax(arr);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}
}
