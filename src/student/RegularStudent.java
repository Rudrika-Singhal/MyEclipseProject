package student;

public class RegularStudent extends Student{
	int attend_per;
	String Classroom;
	//Student s1;
	public RegularStudent(int RollNumber,String Name,String Dept,char sec,int attend_per,String Classroom) {
		super(RollNumber, Name, Dept,sec);
		this.attend_per=attend_per;
		this.Classroom=Classroom;
		
	}
	public void submitAssignmnet() {
		System.out.println("The student have submited their assignment in hardcopy ");
	}
	public void payfee() {
		super.payfee();
		System.out.println("the student with roll no."+ Classroom+" has submited the tution fee + lab fee+lib fee");
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("The sec is "+sec+" and attendace is "+attend_per+" and having class at "+Classroom);
	}
	
}
