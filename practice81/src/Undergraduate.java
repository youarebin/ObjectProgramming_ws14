//컴퓨터학과_20220740_가유빈
public class Undergraduate extends Student{
	private int year;
	
	public void setYear(int year) {this.year = year;}
	public int getYear() {return year;}
	
	public Undergraduate() {
		super();
		this.year = 0;
	}
	public Undergraduate(int id, int tuition, double gpa, int year) {
		super(id,tuition,gpa);
		this.year = year;
	}
	public int calcScholarship() {
			return (int)(getTuition() * ((int)(getTuition()*getRate())+ 10)/100);
	}
	
	public String toString() {
		String rslt = "";
		
		rslt += super.toString();
		rslt += ", 학년: " + getYear();
			
		return rslt;
	}
}
