package day10;

import java.util.Scanner;

public class MyFunction {
	static Scanner s = new Scanner(System.in);
	
	static String textLength(String msg, int length) {
		
		while(true) {
			System.out.print(msg);
			String input = s.next();
			if(input.length() == length) {
				return input;
			} else {
				System.out.println("글자수는 " + length +"글자 입니다. 다시 입력해주세요.");
			}
		}
	} 
	
	static int numberCheck(String msg, int min, int max) {
		while(true) {
			System.out.print(msg);
			int input = s.nextInt();
			if(input >= min && input <= max) {
				return input;
			} else {
				System.out.println("숫자의 범위는 " + min + "~" + max + " 입니다.");
			}
		}
	}
}
