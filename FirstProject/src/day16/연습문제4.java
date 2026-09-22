package day16;

import java.util.Arrays;

public class 연습문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = new int[5];
		// 스캐너를 통해 입력받은 값을 5개 공간 배열에 값 넣기
		// 값은 10~30 사이 값만 넣기. 
		// 그 외 값은 다시 입력받기
		
		int arr2[] = { 3, 9, 6, 5, 4, 2, 15, 8 };
		// 홀수 먼저 정렬 => 오름차순
		// 짝수 뒤에 정렬 => 내림차순
		// 결과 : {3,5,9,15,8,6,4,2}
		// 결과는 배열로 출력. 새로운 배열 만들어도 됨
		// 최초 배열의 홀수, 짝수 개수는 같다고 가정
		
		int oddArr[] = new int[arr2.length/2];
		int evenArr[] = new int[arr2.length/2];
		int oddCount = 0;
		int evenCount = 0;
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i] % 2 == 0) {
				evenArr[evenCount] = arr2[i];
				evenCount++;
			} else {
				oddArr[oddCount] = arr2[i];
				oddCount++;
			}
		}
		
		Arrays.sort(oddArr);
		Arrays.sort(evenArr);
		
		for(int i=0; i<oddArr.length; i++) {
			arr2[i] = oddArr[i];
		}
		for(int i=oddArr.length; i<arr2.length; i++) {
			arr2[i] = evenArr[oddCount-1];
			oddCount--;
		}
		System.out.println(Arrays.toString(arr2));
	}
}
