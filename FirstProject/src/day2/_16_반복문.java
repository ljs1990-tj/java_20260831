package day2;

public class _16_반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for(선언부; 조건식; 증감식)
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
		
		// 1부터 100중에 홀수만 출력
		for(int i=1; i<=100; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		
	}

}
