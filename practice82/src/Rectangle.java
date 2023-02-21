
public class Rectangle extends Shape{
	private int length, width;
	
	public void setLength(int length) {this.length = length;}
	public int getLength() {return length;}
	public void setWidth(int width) {this.width = width;}
	public int getWidth() {return width;}
	
	public Rectangle() {
		super();
	}
	public Rectangle(int x, int y, int length, int width) {
		super(x,y);
		this.length = length;
		this.width = width;
	}
	@Override
	public int calcArea() {
		return length*width;
	}
	
	public String toString() {
		String rslt = "";
		
		super.positionStr();
		rslt += ", 가로: " + width;
		rslt += ", 세로: " + length;
		rslt += ", 면적: " + calcArea();
		
		return rslt;
	}
}
