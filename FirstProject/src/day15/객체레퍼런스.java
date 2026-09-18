package day15;

public class 객체레퍼런스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = a;
		a = 15;
		System.out.println(b); // b에 영향 없음
		
		Human h1 = new Human("홍길동", 30);
		Human h2 = new Human("홍길동", 30);
		h1.addr = "인천";
		System.out.println(h2.addr);
		
		Human h3 = h2;
		h2.addr = "서울";
		System.out.println(h3.addr);
		
	}

}
