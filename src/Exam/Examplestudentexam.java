package Exam;
import student.Student;

public class Examplestudentexam extends Student{
	public static void main(String[] args) {
	Student s1 = new Student(2,"JIA","CSE",'A');
	Examplestudentexam obj = new Examplestudentexam();
	obj.Dept="OPPS";
	System.out.println(obj.Dept);
}
}