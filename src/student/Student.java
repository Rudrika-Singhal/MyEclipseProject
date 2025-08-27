package student;

public class Student {
public int RollNumber;   //create class(state)
public String Name;      //create class(state)
public String Dept;
public char sec;
//static String CollegeName="KIET";
static String Collegename="KIET";

public Student(int RollNumber,String Name,String Dept,char sec) {
	this.RollNumber=RollNumber;
	this.Name=Name;
	this.Dept=Dept;
	this.sec=sec;
}
public Student() {
	this.RollNumber=3;
	this.Name="Tia";
	this.Dept="AIML";
	this.sec='C';
}
public Student(Student obj) {
	this.RollNumber=RollNumber;
	this.Name=Name;
	this.Dept=Dept;
	this.sec=sec;
}
public void studying(int No_of_hours) { //create class(behaviour)
	System.out.println("the student is studying for"+ " "+No_of_hours);
	}
public void playing() {
	System.out.println("Student is playing");
	}
public void displayInfo() {
	System.out.println("the name of the student is"+" "+Name);
	System.out.println("roll number is"+" "+RollNumber+" "+"College"+" "+Collegename);
	System.out.println("the department is"+" "+Dept);
}
public void payfee() {
	System.out.println("The student"+Name+"Has paid the tution fee");
}

public static void main(String[] args) {
	Student student1 = new Student();  //create new objects  (Student()=default constructor)
	Student student2 = new Student();  //create another new object
	student1.displayInfo();
	student2.displayInfo();
	//Student.CollegeName="IIT";
	//student1.CollegeName="NIT";
	student1.displayInfo();
	student2.displayInfo();
	student2.displayInfo();
	student1.Name="Tia";
	student1.Dept="AI";
	student1.Name="Ria";
	student1.RollNumber=1;
	student1.sec='C';
	student2.displayInfo();
	student1.playing();
	student1.studying(5);
	student2.studying(7);
}
}