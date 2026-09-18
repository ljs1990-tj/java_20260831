package day15;

public class Food {
	private String name;
	private int price;
	private int count;
	
	static String marketName = "코딩천국";
	
	public Food() {
		this("이름없음", 0, 0);
//		this.name = "이름없음";
	}
	public Food(String name, int price) {
		this(name, price, 0);
	}
	public Food(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
