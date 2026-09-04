package day5;

public class Food {
	String name;
	int price;
	
	Food(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void info() {
		//"oo은 ooo원 입니다"
		System.out.println(name + "은 " + price + "원 입니다.");
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
	int getPrice() {
		return price;
	}
	
}

