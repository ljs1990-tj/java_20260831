package day16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadHangulSuccess {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\Users\\tjoeu\\OneDrive\\바탕 화면\\hangul.txt");
			in = new InputStreamReader(fin, "UTF-8");
			int c;
			System.out.println("인코딩문자집합은" + in.getEncoding());
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력오류");
		}
	}
}
