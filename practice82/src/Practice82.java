import java.util.Scanner;

public class Practice82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		System.out.print("도형의 X좌표를 입력하세요: ");
		s.setX(sc.nextInt());
		System.out.print("도형의 Y좌표를 입력하세요: ");
		s.setY(sc.nextInt());
		
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
		
		System.out.print(s.positionStr());
		System.out.print(s.toString());
		
		r.type = "사각형";
		System.out.print(r.positionStr());
		System.out.print(r.toString());
		
		t.type = "삼각형";
		System.out.print(t.positionStr());
		System.out.print(t.toString());
	}

}
