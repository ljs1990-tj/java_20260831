package day8;

public class _0_and_or {
	static boolean test(int x) {
		System.out.println("원하는 메시지~~~");
		return x > 30;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// &&, ||
		int a = 100;
		int b = 50;
//		if(a > 100 && test(b)) {
//			System.out.println("두 수 모두 큰 수 입니다.");
//		}
		
		if(a > 100 & test(b)) {
			System.out.println("두 수 모두 큰 수 입니다.");
		}
		
	}
}
