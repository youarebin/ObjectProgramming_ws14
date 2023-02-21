import java.util.Scanner;

public class Practice83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Circle c = new Circle();
		
		System.out.print("\n사각형의 X좌표를 입력하세요: ");
		r.setX(sc.nextInt());
		System.out.print("사각형의 Y좌표를 입력하세요: ");
		r.setY(sc.nextInt());
		System.out.print("사각형의 가로를 입력하세요: ");
		r.setWidth(sc.nextInt());
		System.out.print("사각형의 세로를 입력하세요: ");
		r.setLength(sc.nextInt());
		
		System.out.print("\n삼각형의 X좌표를 입력하세요: ");
		t.setX(sc.nextInt());
		System.out.print("삼각형의 Y좌표를 입력하세요: ");
		t.setY(sc.nextInt());
		System.out.print("삼각형의 가로를 입력하세요: ");
		t.setBase(sc.nextInt());
		System.out.print("삼각형의 세로를 입력하세요: ");
		t.setHeight(sc.nextInt());
		
		System.out.print("\n원의 X좌표를 입력하세요: ");
		c.setX(sc.nextInt());
		System.out.print("원의 Y좌표를 입력하세요: ");
		c.setY(sc.nextInt());
		System.out.print("원의 반지름을 입력하세요: ");
		c.setRadius(sc.nextInt());
		
		r.type = "사각형";
		System.out.print(r.toString());
		
		t.type = "삼각형";
		System.out.print(t.toString());
		
		t.type = "원";
		System.out.print(c.toString());
	}

}
