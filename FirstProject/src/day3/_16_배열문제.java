package day3;

public class _16_배열문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 5, 1, 7, 4};
		// 배열안에 있는 숫자 중에서 가장 작은 숫자의 위치(index)를 알고싶어요
		
		int min = 0; // 2
		for(int i=1; i<arr.length; i++) {
			if(arr[min] > arr[i]) {
				min = i;
			}
		}
		System.out.println(min);
	}

}
