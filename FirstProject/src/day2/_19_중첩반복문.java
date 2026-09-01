package day2;

public class _19_중첩반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문 안에 반복문 넣기
		// 1. 1부터 10까지 반복하는 반복문 생성
		for(int i=1; i<=10; i++) {
			System.out.println("=====" + i + "=====");
			
			for(int j=1; j<=10; j++) {
				System.out.println(j);
			}
		}
		

	}

}
