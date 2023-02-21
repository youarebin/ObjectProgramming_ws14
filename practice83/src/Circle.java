
public class Circle extends Shape{
	private double radius;
	
	public void setRadius(double radius) {this.radius = radius;}
	
	public double calcArea() {
		return 3.1415*radius*radius;
	}
	
	public String toString() {
		String rslt = "";
		
		rslt += "\n타입: " + type;
		rslt += ", 밑변: " + radius;
		rslt += ", 면적: " + calcArea();
		
		return rslt;
	}
}
