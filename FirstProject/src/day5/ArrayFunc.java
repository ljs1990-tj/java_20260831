package day5;

public class ArrayFunc {

	public void maxMinChange(int[] arr) {
		// TODO Auto-generated method stub
		int maxIndex = 0;
		int minIndex = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
			if(arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = temp;
	}

}
