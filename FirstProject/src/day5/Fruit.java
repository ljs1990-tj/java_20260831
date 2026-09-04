package day5;

public class Fruit {
	private String name; // 과일이름
	private int count; // 수량
	private int price; // 가격
	
	Fruit(String name, int count, int price){
		this.name = name;
		this.count = count;
		this.price = price;
	}
	
	public void setPrice(int price) {
		// ex) 일반사용자 : C, 관리자 : A
		String status = "A"; // 로그인한 사용자의 권한
		
		if(!status.equals("A")) {
			System.out.println("가격 수정 권한이 없습니다!");
			return;
		}
		if(price <= 0) {
			System.out.println("값을 다시 확인해주세요!");
			return;
		}
		
		this.price = price;
	}
	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
