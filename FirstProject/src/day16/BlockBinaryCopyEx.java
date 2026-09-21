package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BlockBinaryCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("C:\\Users\\tjoeu\\OneDrive\\바탕 화면\\image.jpg");
		File dest = new File("C:\\Users\\tjoeu\\OneDrive\\바탕 화면\\copyimg.jpg");
		double beforeTime = System.currentTimeMillis(); 
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf = new byte[1024 * 10]; 
			while (true) {
				int n = fi.read(buf); 
				fo.write(buf, 0, n); 
				if (n < buf.length)
					break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
		double afterTime = System.currentTimeMillis(); 
		double diffTime = (afterTime - beforeTime) / 1000; 
		System.out.println("시간차이 : " + diffTime);
	}
}
