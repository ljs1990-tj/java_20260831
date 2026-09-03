package day4;

public class _11_배열연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 5, 2, 4, 1};
		ArrayFunc func = new ArrayFunc();
		
		func.arrayMax(arr); // '배열에서 가장 큰 값은 5 입니다' 출력
		
		int sum = func.arraySum(arr);
		System.out.println(sum); // arr의 모든 수의 합 출력
								 // 즉, '15' 출력
		
		int num1 = func.arrayChoice(arr, 3);
		// {3, 5, 2, 4, 1}
		System.out.println(num1); // arr의 3번째 값(인덱스 x)을 출력
							  // 2 출력 
		
		func.arrayRandom(6); // 1~30사이의 랜덤한 숫자가 6(인자 값)개 담긴
							 // 배열 출력
							 // 메소드내에서 Arrays.toString() 배열 출력
		
	}
}
