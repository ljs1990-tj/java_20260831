package day8;

public class Point3D extends Point{
	private int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	void moveUp() {
		z++;
	}
	void moveDown() {
		z--;
	}
	
	void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// RED색의 (10,20)의 점
		return "(" + getX() + "," + getY() + "," + z + ")의 점";
	}
}
