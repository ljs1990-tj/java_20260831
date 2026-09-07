package day6;

public class _8_업캐스팅 {
	
	static void fruitBoxing(Fruit f) { 
		System.out.println(f.name + "를 포장했습니다.");
	}
	
	
	// 필요 x
	static void appleBoxing(Apple a) {
		System.out.println(a.name + "를 포장했습니다.");
	}
	static void orangeBoxing(Orange o) {
		System.out.println(o.name + "를 포장했습니다.");
	}
	static void bananaBoxing(Banana b) {
		System.out.println(b.name + "를 포장했습니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = new Fruit("과일");
		
		Apple apple1 = new Apple("사과");
		Orange orange1 = new Orange("오렌지");
		Banana banana1 = new Banana("바나나");
		
		appleBoxing(apple1);
		
		fruitBoxing(apple1);
		fruitBoxing(orange1);
		fruitBoxing(banana1);
		
//		f = apple1;
////		orange1 = banana1; 안된다
//		f = banana1;
//		Fruit fruit2 = orange1;
	}

}
