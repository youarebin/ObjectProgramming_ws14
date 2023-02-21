
public abstract class Shape {
	private int x,y;
	protected String type = "도형";
	
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	
	public Shape() {
		x = 0;
		y = 0;
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract double calcArea();//Shape클래스에서 중요한 의미를 가지지 않는다.
	public String toString() {
		String rslt = "";
		
		return rslt;
	}
}
