
public class Triangle extends Shape{
	private int base, height;
	
	public void setBase(int base) {this.base = base;}
	public void setHeight(int height) {this.height = height;}
	
	public Triangle() {
		super();
	}
	public Triangle(int x, int y, int base, int height) {
		super(x,y);
		this.base = base;
		this.height = height;
	}
	@Override
	public double calcArea() {
		return base*height/2;
	}
	
	public String toString() {
		String rslt = "";
		
		rslt += "\n타입: " + type;
		rslt += ", 밑변: " + base;
		rslt += ", 높이: " + height;
		rslt += ", 면적: " + calcArea();
		
		return rslt;
	}
}
