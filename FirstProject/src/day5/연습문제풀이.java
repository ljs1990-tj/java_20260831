package day5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 연습문제풀이 {
	static Scanner s = new Scanner(System.in);
	static Random ran = new Random();
	
	static void question1() {
//		1. 10부터 50까지 중 3의 배수이면서 짝수만 화면에 출력
		for(int i=10; i<=50; i++) {
			if(i % 3 == 0 && i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("==========================");
	}
	static void question2() {
//		2. 숫자를 두개 입력받고, 두 수의 합이 10이 넘을 경우 '큰 수' 아닐 경우 '작은 수' 출력
		System.out.print("첫번째 숫자 : ");
		int num1 = s.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = s.nextInt();
		if(num1 + num2 > 10) {
			System.out.println("큰 수");
		} else {
			System.out.println("작은 수");
		}
		
		System.out.println("==========================");
	}
	static void question3() {
//		3. 숫자를 하나 입력받고, 해당 숫자가 홀수인지 짝수인지 출력.
//		단, 숫자가 1~30사이 값이 아닐 경우 다시 입력하도록 함
		while(true) {
			System.out.print("숫자 입력 : ");
			int num = s.nextInt();
			if(num < 1 || num > 30) {
				System.out.println("1~30 사이 값 입력하셈");
			} else {
				if(num % 2 == 0) {
					System.out.println("짝수");
				} else {
					System.out.println("홀수");
				}
				break;
			}
		}
		System.out.println("==========================");
	}
	static void question4() {
//		4. 1부터 100 사이의 랜덤한 숫자를 생성하고, 숫자를 입력 받아 랜덤한 숫자와 비교하여, 
//		큰 수 인지 아닌지 판별하기
//		(ex, 랜덤 수 : 35, 입력 수 : 40 일 경우 
//		  '입력한 수가 더 큽니다' 출력, 반대일 경우 '랜덤 숫자가 더 큽니다' 출력, 두 수가 같으면 '같습니다' 출력)
		int ranNum = ran.nextInt(100) + 1;
		System.out.println("숫자 입력 : ");
		int inputNum = s.nextInt();
		if(ranNum == inputNum) {
			System.out.println("같습니다");
		} else if(ranNum > inputNum) {
			System.out.println("랜덤 숫자가 더 큽니다.");
		} else {
			System.out.println("입력한 숫자가 더 큽니다.");
		}
	}
	static void question5() {
//		5. 2단부터 9단까지 구구단 출력
//		단, 짝수(2,4,6,8)단만 출력
		for(int i=2; i<=9; i++) {
			if(i % 2 == 0) {
				System.out.println("====== " + i + "단 ======");
				for(int j=1; j<=9; j++) {
					System.out.println(i + " * " + j + " = " + (i*j));
				}
			}
			
		}
	}
	static int[] question6() {
//		6. 크기가 5인 int형 배열을 선언하고 사용자로부터 숫자를 입력받아서 5개의 값 넣기
//		단, 0이하의 수를 입력하거나 중복된 숫자가 있으면 안내 문구를 출력 후 다시 입력 받을 것 
//			=> 해당 조건이 어려우면 일단 5개 정상적으로 입력했다고 가정하고 진행하세요
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			int num = s.nextInt();
			arr[i] = num;
			if(num <= 0) {
				System.out.println("0이상 입력하셈");
				i--;
			} else {
				for(int j=0; j<i; j++) {
					if(num == arr[j]) {
						System.out.println("이미 등록된 숫자 있음");
						i--;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	static void question7() {
//		7. 6번에서 정의한 배열에서 홀수들의 합과 짝수들이 합의 차이 구하기
		int arr[] = question6();
		int oddSum = 0;
		int evenSum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenSum += arr[i];
			} else {
				oddSum += arr[i];
			}
		}
		System.out.println("홀수 합 : " + oddSum + ", 짝수 합 : " + evenSum);
		System.out.println("차이 : " + Math.abs(oddSum - evenSum));
	}
	static void question8() {
//		8. 
//		기본조건
//		 - 메인메뉴는 1~2. 그외 숫자 입력 시 안내 문구 후 다시 입력
//		 - 1번 메뉴 진입 시 난이도 선택. 1~3외 값 입력 시 안내 문구 후 다시 입력
//		 - 1번 난이도는 2~5단, 2번 난이도는 6~9단, 3번 난이도는 12~19단 문제 출력
//		 - 문제는 5문제 고정. 5문제 모두 푼 후 맞춘 개수 출력
//		 - 메인 메뉴에서 2번 선택 시 종료
		while(true) {
			System.out.print("[1. 구구단 풀기, 2. 종료] : ");
			int menu = s.nextInt();
			int count = 0;
			if(menu == 1) {
				System.out.print("[1. 쉬움(2~5단), 2. 보통(6~9단), 3. 어려움(12~19단)] : ");
				int level = s.nextInt();
				if(level < 1 || level > 3) {
					System.out.println("난이도는 1~3사이를 선택해주세요.");
					continue;
				} 
				
				System.out.println("====== 문제풀이를 시작합니다(5문제) ======");
				for(int i=1; i<=5; i++) {
					int x;
					int y = ran.nextInt(9) + 1;
					if(level == 1) {
						x = ran.nextInt(4) + 2;
					} else if(level == 2){
						x = ran.nextInt(4) + 6;
					} else {
						x = ran.nextInt(8) + 12;
					}
					System.out.print(x + " * " + y + " = " );
					int answer = s.nextInt();
					if(answer == (x*y)) {
						System.out.println("정답입니다!");
						count++;
					} else {
						System.out.println("틀렸습니다. 정답은 " + (x*y) + " 입니다.");
					}
				}
				System.out.println("총 " + count + "개 맞추셨습니다.");
			} else if(menu == 2){
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("메뉴는 1~2중에 선택해주세요.");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.print("[ 문제 번호 입력(1~8) - 0입력 시 종료 ] : ");
			int menu = s.nextInt();

			if(menu == 0) {
				System.out.println("종료 됨");
				break;
			}
			
			switch (menu) {
			case 1:
				question1();
				break;
			case 2:
				question2();
				break;
			case 3:
				question3();
				break;
			case 4:
				question4();
				break;
			case 5:
				question5();
				break;
			case 6:
				question6();
				break;
			case 7:
				question7();
				break;
			case 8:
				question8();
				break;
			default:
				System.out.println("문제 번호 오류!");
				break;
			}
			
		}

	}

}
