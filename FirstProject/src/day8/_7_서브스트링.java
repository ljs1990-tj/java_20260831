package day8;

import java.util.Scanner;

public class _7_서브스트링 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String text = "Hello JAVA";
//		System.out.println(text.substring(1));
//		System.out.println(text.substring(2, 7));
//		String text = "Hello";
//		// 첫글자를 맨 뒤로 보내고싶어요.
//		String result = text.substring(1) + text.substring(0, 1);
//		System.out.println(result.toUpperCase());
		
		Scanner s = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String input = s.next(); 
		for(int i=0; i<input.length(); i++) {
			input = input.substring(1) + input.substring(0,1); 
			System.out.println(input);
		}
		
		
	}

}
