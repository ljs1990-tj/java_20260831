package day15;

public class 디버깅 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,2,9,4};
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > arr[i+1]) { // i가 4일때 문제가 발생했다
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
	}

}
