package day1;

public class _5_형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 30;
		double age2 = 30; // 30.0
		
//		int height = 169.9; // 소수점 있어서 에러
		int height = (int) 169.9; // 실수를 int로 강제 형변환
		System.out.println(height);
		
		int newAge = age + 1; // 31
		int newAge2 = (int) age2;
		
		
	}
}
