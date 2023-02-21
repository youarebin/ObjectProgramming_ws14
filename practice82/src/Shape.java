
public class Shape {
	private int x,y;
	protected String type = "도형";
	
	public void setX(int x) {this.x = x;}
	public int getX() {return x;}
	public void setY(int y) {this.y = y;}
	public int getY() {return y;}
	
	public Shape() {
		x = 0;
		y = 0;
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int calcArea() {
		return -1;
	}
	public String toString() {
		String rslt = "";
		
		return rslt;
	}
	public String positionStr() {
		return "\n타입 :" + type + "\n중심좌표: (" + x + ", " + y + ")";
	}
}