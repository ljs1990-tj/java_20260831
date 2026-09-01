package day2;

import java.util.Scanner;

public class _11_스캐너 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// import 자동 완성 => Ctrl + Shift + O(알파벳)
		Scanner scan = new Scanner(System.in);
		// 문자 => scan.next();
		// 숫자 => scan.nextInt();
		System.out.print("문자를 입력해주세요 : ");
		String inputText = scan.next();
		System.out.println("입력한 텍스트 : " + inputText);
		
		System.out.print("숫자를 입력해주세요 : ");
		int inputNum = scan.nextInt();
		System.out.println("입력한 숫자 : " + inputNum);
		
	}
}
