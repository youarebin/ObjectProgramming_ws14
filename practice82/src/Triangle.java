
public class Triangle extends Shape{
	private int base, height;
	
	public void setBase(int base) {this.base = base;}
	public int getBase() {return base;}
	public void setHeight(int height) {this.height = height;}
	public int getHeight() {return height;}
	
	public Triangle() {
		super();
	}
	public Triangle(int x, int y, int base, int height) {
		super(x,y);
		this.base = base;
		this.height = height;
	}
	@Override
	public int calcArea() {
		return base*height/2;
	}
	
	
	public String toString() {
		String rslt = "";
		
		rslt += ", 밑변: " + base;
		rslt += ", 높이: " + height;
		rslt += ", 면적: " + calcArea();
		
		return rslt;
	}
}
