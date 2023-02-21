
public class VisitingStudent extends Student{
	public VisitingStudent(int id,int tuition, double gpa){
		super(id,tuition,gpa);
	}
	public int calcScholarship() {
		return 0;
	}
	public String toString() {
		String rslt = "";
		
		rslt += super.toString();
			
		return rslt;
	}
}
