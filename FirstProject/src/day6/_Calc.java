package day6;

public abstract class _Calc {
	// 설계용
	void info() {
		System.out.println("아주좋은 계산기 입니다.");
	}
	// 덧셈
	abstract int sum(int x, int y);
	abstract int sum(int x, int y, int z);
	
	// 곱셈
	abstract int multiple(int x, int y);
	
	// 나눗셈
	abstract double divide(int x, int y);
}
