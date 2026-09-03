package day4;

public class _10_오버로딩 {
	static int sum(int x, int y) {
//		System.out.println(x+"+"+y+"의 결과는 " + (x+y));
		return x+y;
	}
	
	static int sum(int x, int y, int z) {
		return x+y+z;
	}
	
	static double sum(int x, double y) {
//		System.out.println(x+"+"+y+"의 결과는 " + (x+y));
		return x+y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메소드 오버로딩할 때(동일한 이름의 메소드를 여러개 만들 때)는
		// (1) 매개변수(인자, 파라미터)의 개수가 다르거나
		// (2) 혹은 매개변수 타입이 다를 때 생성 가능
		
		// sum이름의 메소드를 만들겁니다
		// 1. 정수 2개를 받아서 더해서 리턴 해주기
		int result1 = sum(3,5);
		
		// 2. 정수를 3개받아서 더해서 리턴 해주는 메소드도 만들고 싶어요
		int result2 = sum(1,2,3);
		
		double result3 = sum(10, 20.5);
		
		System.out.println();
	}

}
