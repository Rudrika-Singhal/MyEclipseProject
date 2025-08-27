package student;

public class OnlineStudent extends Student{
	String plattform;
	int InternetSpeed;
	
	public OnlineStudent(int RollNumber,String Name,String Dept,char sec,String plattform,int InternetSpeed) {/*constructor*/
		super(RollNumber, Name, Dept,sec);
		this.plattform=plattform;
		this.InternetSpeed=InternetSpeed;
		
	}
	public void submitAssignmnet() {
		System.out.println("The student have submited their assignment in softcopy ");
	}
	public void payfee() {
		super.payfee();
		System.out.println("the student with plattform"+ plattform+" has submited the tution fee + plattform fee");
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("The sec is "+sec+" and plattfrom is "+plattform+" and having InternetSpeed is  "+InternetSpeed);
	}
}
