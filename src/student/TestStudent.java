package student;

public class TestStudent {
	public static void main(String[] args) {
		Student student1 = new Student();  //create new objects  (Student()=default constructor)
		Student student2 = new Student();//create another new object
		/*student1.displayInfo();
		student2.displayInfo();*/
		//Student.CollegeName="IIT";
		//student1.CollegeName="NIT";
		/*student1.displayInfo();
		student2.displayInfo();
		student2.displayInfo();
		student1.Dept="AI";
		student1.Dept="CSE";
		student1.RollNumber=1;
		student1.sec='C';
		student2.displayInfo();
		student1.playing();
		student1.studying(5);
		student2.studying(7);*/
		
		RegularStudent rs=new RegularStudent(1,"Ajanali","CSEAIML",'A',88,"H506");
		rs.displayInfo();
		OnlineStudent os=new OnlineStudent(14,"Kiara","EEE",'Z',"GMEET",100);
		os.displayInfo();
		os.payfee();
		//rs.payfee();
		//student1.payfee();
		//student2.payfee();
		
	}
}
