//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Undergraduate ud;
		Graduate g1;
		Graduate g2;
		VisitingStudent vs;
		
		System.out.print("기본 장학금 비율: ");
		double rate = sc.nextDouble();
		
		System.out.print("첫번째 학생의 등록금: ");
		int udTuition=sc.nextInt();
		System.out.print("첫번째 학생의 평균등급: ");
		double udGpa = sc.nextDouble();
		ud = new Undergraduate(1111,udTuition,udGpa,3);
		ud.rate = rate;
		
		System.out.print("두번째 학생의 등록금: ");
		int g1Tuition = sc.nextInt();
		System.out.print("두번째 학생의 평균등급: ");
		double g1Gpa = sc.nextDouble();
		g1 = new Graduate(2222,g1Tuition,g1Gpa,"SE");
		
		System.out.print("세번째 학생의 등록금: ");
		int g2Tuition = sc.nextInt();
		System.out.print("세번째 학생의 평균등급: ");
		double g2Gpa = sc.nextDouble();
		g2 = new Graduate(3333,g2Tuition,g2Gpa,"OS");
		
		System.out.print("네번째 학생의 등록금: ");
		int vsTuition = sc.nextInt();
		System.out.print("네번째 학생의 평균등급: ");
		double vsGpa = sc.nextDouble();
		vs = new VisitingStudent(4444,vsTuition,vsGpa);
		
		System.out.println("입력된 학생들의 정보입니다.");
		System.out.println(ud.toString());
		System.out.println(g1.toString());
		System.out.println(g2.toString());
		System.out.println(vs.toString());
	}

}
